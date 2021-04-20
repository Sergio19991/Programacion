package com.sergiobejaranoarroyo;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("asignaturas.xml"));

            Element root = doc.getDocumentElement();

            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                    //Muestro la información del elemento (etiqueta)
                    System.out.println("He encontrado un Nodo Etiqueta.");
                    Element e = (Element) nl.item(i);
                    System.out.println("Es la etiqueta: " + e.getTagName());
                    System.out.println("Y contiene:");
                    System.out.println(e.getTextContent());

                    if (e.hasAttributes()) {
                        System.out.println("Y este Nodo tiene Atributos.");

                        NamedNodeMap nodeMap = e.getAttributes();
                        for (int j = 0; j < nodeMap.getLength(); j++) {
                            Node node = nodeMap.item(j);
                            Attr atributo = e.getAttributeNode(node.getNodeName());
                            System.out.println("Atributo: " + atributo.getNodeName());
                            System.out.println("Valor: " + atributo.getValue());
                        }
                    }
                } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                    System.out.println("He encontrado un Nodo Texto.");
                    System.out.println("Y contiene:");
                    Text texto = (Text) nl.item(i);
                    System.out.println(texto.getTextContent());
                } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                    System.out.println("He encontrado un Nodo Comentario.");
                    System.out.println("Y contiene:");
                    Comment comentario = (Comment) nl.item(i);
                    System.out.println(comentario.getTextContent());

                }

                System.out.println("----------------------------------------");
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}