package com.sergiobejaranoarroyo;

import org.w3c.dom.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Alumnos {
    public static void main(String[] args) {
        String[] nombres = {"ALUMNO 1", "ALIMNO 2", "ALUMNO 3", "ALUMNO 4", "ALUMNO 5", "ALUMNO 6", "ALUMNO 7", "ALUMNO 8", "ALUMNO 9", "ALUMNO 10"};
        String[] apellidos = {"APELLIDO 1", "APELLIDO 2", "APELLIDO 3", "APELLIDO 4", "APELLIDO 5", "APELLIDO 6", "APELLIDO 7", "APELLIDO 8", "APELLIDO 9", "APELLIDO 10"};

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("alumnos.xml"));

            Node root = doc.getDocumentElement();

            Element primerAlumno = (Element) doc.getElementsByTagName("alumno");

            root.insertBefore(doc, primerAlumno);

            for (int i = 0; i < nombres.length; i++) {
                Element alumno = doc.createElement(nombres[i]);
            }

            for (int i = 0; i < apellidos.length; i++) {
                Element apellido = doc.createElement(apellidos[i]);
            }

            NodeList nl = doc.getElementsByTagName("alumno");
            Node node = nl.item(nl.getLength() - 1);
            Element alumnoClonado = (Element) node.cloneNode(true);

            Element nuevoAlumno = (Element) doc.getElementsByTagName("alumno");

            root.replaceChild(alumnoClonado, nuevoAlumno);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoAlumnos = new File("nuevoAlumnos.xml");
            StreamResult destino = new StreamResult(nuevoAlumnos);

            transformer.transform(origenDOM, destino);
        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}