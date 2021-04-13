package com.sergiobejaranoarroyo;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Horario {
    public static void main(String[] args) {

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("horario.xml"));

            Node root = doc.getDocumentElement();

            Text saltoLinea = doc.createTextNode("\n");

            Comment comentario = doc.createComment("Horario de 1ºDAW:");

            Element primerDia = (Element) doc.getElementsByTagName("dia").item(0);

            root.insertBefore(comentario, primerDia);

            Element dia = doc.createElement("dia");
            dia.setAttribute("nombre", "lunes");

            Element tramo1 = doc.createElement("tramo");
            tramo1.setTextContent("FOL");
            Element tramo2 = doc.createElement("tramo");
            tramo2.setTextContent("SIINF");
            Element tramo3 = doc.createElement("tramo");
            tramo3.setTextContent("LMSGI");
            Element tramo4 = doc.createElement("tramo");
            tramo4.setTextContent("PROGR");
            Element tramo5 = doc.createElement("tramo");
            tramo5.setTextContent("PROGR");
            Element tramo6 = doc.createElement("tramo");
            tramo6.setTextContent("PROGR");

            dia.appendChild(tramo1);
            dia.appendChild(tramo2);
            dia.appendChild(tramo3);
            dia.appendChild(tramo4);
            dia.appendChild(tramo5);
            dia.appendChild(tramo6);

            root.appendChild(dia);

            NodeList nl = doc.getElementsByTagName("dia");
            Node node = nl.item(nl.getLength() - 1);
            Element diaClonado = (Element) node.cloneNode(true);

            root.appendChild(primerDia);

            Element segundoDia = (Element) doc.getElementsByTagName("dia");
            root.removeChild(segundoDia);

            root.replaceChild(diaClonado, primerDia);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoDia = new File("nuevoHorario.xml");
            StreamResult destino = new StreamResult(nuevoDia);

            transformer.transform(origenDOM, destino);
        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}