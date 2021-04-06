package com.sergiobejaranoarroyo;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class persona {

    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("persona.xml"));
            System.out.println("FIN");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}