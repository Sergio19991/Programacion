package com.sergiobejaranoarroyo;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class RecorridoStax {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("ejercicio2.xml"));

            NodeList nl = doc.getElementsByTagName("food");

            Node food = nl.item(0);

            if (food.hasChildNodes()) {
                NodeList interior = food.getChildNodes();

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

        int cantidadCalorias = 650 + 900 + 900 + 600 + 950;

        System.out.println("\n\n\n" + "Cantidad de Calorías: " + cantidadCalorias + " Calorías.");
    }
}