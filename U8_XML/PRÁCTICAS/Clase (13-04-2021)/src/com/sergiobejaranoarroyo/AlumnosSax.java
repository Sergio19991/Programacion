package com.sergiobejaranoarroyo;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AlumnosSax extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienza el Parseo del Documento alumno.xml");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Fin del Parseado del Documento alumnos.xml");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        System.out.println("<" + qName);

        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println(" " + attributes.getQName(i) + "=\"" + attributes.getValue(i) + "\"");
            }
        }

        System.out.println(">");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        System.out.print("</" + qName + ">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);

        String content = new String(ch, start, length);
        System.out.print(content);
    }
}