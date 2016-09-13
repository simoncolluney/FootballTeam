package com.simon.football;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

//import javax.xml.xpath.*;

public class XmlLibrary {

    public static Document openXmlFile(String filePath) {

        Document xmlDoc = null;

        File file = new File(filePath);
        if(!(file.exists() && file.canRead())) {
            System.err.println("ERROR - Cannot read " + filePath + ". Exiting now.");
            return null;
            //System.exit(1);
        }

        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();  // Create the parser
            xmlDoc = builder.parse(filePath);

            if(xmlDoc != null) {
                System.out.println("Successfully opened " + filePath);
            }

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("BUGGER! Something went wrong there.");
            return null;
            //System.exit(1);
        }

        return xmlDoc;
    }

    public static Node getRootNode(Document xmlDoc) {
        if(xmlDoc != null) {
            return xmlDoc.getFirstChild();
        }

        return null;
    }
/*
    public static NodeList getNode(Node parent) {
        if(parent != null) {
            return parent.getChildNodes();
        }

        return null;
    }
*/
}