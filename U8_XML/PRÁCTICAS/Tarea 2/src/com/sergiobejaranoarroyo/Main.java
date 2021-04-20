package com.sergiobejaranoarroyo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("personas.xml"));

            System.out.println("Nodos Hijos de todo el Documento: " + doc.getChildNodes().getLength() + ".");

            Element root = doc.getDocumentElement();

            System.out.println("Nodos Hijos del Elemento Raíz: " + root.getChildNodes().getLength() + ".");

            NodeList nl = root.getChildNodes();

            System.out.println("Información de los Nodos.");

            for (int i = 0; i < nl.getLength(); i++) {
                System.out.println("Tipo del Nodo: " + nl.item(i).getNodeType() + ".");

                System.out.println("Contenido del Nodo: " + nl.item(i).getTextContent());

                System.out.println(" -------------------------------------------------- ");
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}