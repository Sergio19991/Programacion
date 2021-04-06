package com.sergiobejaranoarroyo;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class horario {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("horario.xml"));

            NodeList nl = doc.getElementsByTagName("dia");

            Node dia = nl.item(0);

            NamedNodeMap atributos = dia.getAttributes();

            Attr nombre = (Attr) atributos.getNamedItem("nombre");

            System.out.println(nombre.getValue());

            if (dia.hasChildNodes()) {
                NodeList interior = dia.getChildNodes();

                for (int i = 0; i < interior.getLength(); i++) {
                    Node nodo = interior.item(i);

                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Element e = (Element) nodo;
                        System.out.println("   " + e.getTagName() + ": " + e.getTextContent());
                    } else if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        Text t = (Text) nodo;
                        System.out.println(t.getWholeText());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}