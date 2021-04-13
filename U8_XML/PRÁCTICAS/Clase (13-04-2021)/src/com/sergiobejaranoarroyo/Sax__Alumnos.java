package com.sergiobejaranoarroyo;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Sax__Alumnos {
    public static void main(String[] args) {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler alumnoSax = new AlumnosSax();

            saxParser.parse(new File("alumnos.xml"), alumnoSax);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e.getStackTrace());
        }
    }
}