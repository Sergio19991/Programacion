package com.sergiobejaranoarroyo;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class banco {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("banco.xml"));

            Element banco = doc.getDocumentElement();
            NodeList cuentas = banco.getChildNodes();

            for (int i = 0; i < cuentas.getLength(); i++) {
                Node n = cuentas.item(i);

                if (n.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) cuentas.item(i);
                    Attr a = e.getAttributeNode("cc");
                    System.out.println("CC:" + a.getValue());
                    NodeList nlInterior = e.getChildNodes();

                    for (int j = 0; j < nlInterior.getLength(); j++) {
                        Node nodo = nlInterior.item(j);

                        if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                            Element element = (Element) nodo;
                            if (element.getTagName().equals("cliente")) {
                                String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                                String apellidos = element.getElementsByTagName("apellidos").item(0).getTextContent();
                                System.out.println("CLIENTE: " + nombre + ", " + apellidos);
                            }

                            if (element.getTagName().equals("saldo")) {
                                System.out.println("Saldo:" + element.getTextContent());
                            }
                        }
                    }

                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}