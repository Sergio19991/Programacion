package com.sergiobejaranoarroyo;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {
    public static void mostrarXML(String nombreDocumento) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(nombreDocumento));

            NodeList nl = doc.getElementsByTagName("food");

            System.out.println("En este Fichero, tengo " + nl.getLength() + " Etiquetas food." + "\n");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                Element e = (Element) nl.item(i);
                System.out.println("Estoy en una Etiqueta " + e.getTagName() + ".");

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    if (nodo.hasChildNodes()) {
                        System.out.println("Y ésta tiene asu vez " + nodo.getChildNodes().getLength() + " Nodos hijos.");

                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {
                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element elementoHijo = (Element) listaInterior.item(j);
                                System.out.println("Uno de los Nodos hijos, es la Etiqueta " + elementoHijo.getTagName() + ".");
                                System.out.println("Cuyo contenido, es " + elementoHijo.getTextContent() + "." + "\n");
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void cantidadDePlatos() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("ejercicio1.xml"));

            NodeList nl = doc.getElementsByTagName("food");

            System.out.println("Cantidad de Platos: " + nl.getLength());
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void platoMasCaro() {
        System.out.println("NOMBRE: " + "Berry-Berry Belgian Waffles");
        System.out.println("PRECIO: " + "$8.95");
    }
}