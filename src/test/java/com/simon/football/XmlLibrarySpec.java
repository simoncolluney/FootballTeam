package com.simon.football;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

//import javax.xml.xpath.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author developer, @date 13/09/16 11:25
 */

public class XmlLibrarySpec {

    Document xmlDoc = null;

    @Before
    public void executeBeforeTest() {
        String filePath = "./resources/footballers.xml";

        xmlDoc = XmlLibrary.openXmlFile(filePath);
    }

    @Test
    public void xmlFilePassedIsOpenedCorrectly() {
        assertNotNull(xmlDoc);
    }

    @Test
    public void xmlFilePassedReturnsRootNode() {
        Node rootNode = XmlLibrary.getRootNode(xmlDoc);
        assertNotNull(rootNode);
    }
/*
    @Test
    public void rootNodePassedReturnsChildNode() {
        Node rootNode = XmlLibrary.getRootNode(xmlDoc);
        if(rootNode != null) {
            NodeList childNode = xmlLibrary.getNode(rootNode);
        }

        assertNotNull(childNode);
    }
*/
}