package com.jetbrains.startup;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;



public class Main {

    public static void main(String[] args) {





        try {

            File fileXML = new File("C:/Users/Robin/Dropbox/WeatherReport/src/com/jetbrains/places.xml");
            DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(fileXML);

            NodeList placeList = doc.getElementsByTagName("locality");
            for (int i = 0; i < placeList.getLength(); i++){
                Element place = (Element) placeList.item(i);
                System.out.print("City : " + place.getAttribute("name"));

                NodeList childNodes = place.getChildNodes();
                Element location = (Element) childNodes.item(1);
                System.out.println(" " + location.getAttribute("longitude") + " " +
                        location.getAttribute("latitude") + " " +
                        location.getAttribute("altitude"));
            }
        }catch (ParserConfigurationException e){
            System.out.println("parse exc");
        }catch (SAXException e){
            System.out.println("SAX");
        }catch (IOException e){
            System.out.println("IO");
        }

    }
}
