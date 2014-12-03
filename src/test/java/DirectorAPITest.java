import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by vladimirkr on 12/3/2014.
 */
public class DirectorAPITest {
    @Test
    public void startCommandTest() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new URL("http://192.168.155.224:8009/?cmd=gameStart&UID=1005120&serviceID=550&gameType=15&noGameTimeout=40&duration=30").openStream());
        doc.getDocumentElement().normalize();

        Assert.assertEquals("Response", doc.getDocumentElement().getNodeName());
//        Assert.assertEquals("Huy", doc.getDocumentElement().getNodeName());

//        NodeList nodeLst = doc.getElementsByTagName("ResponseDetails");

//        for (int s = 0; s < nodeLst.getLength(); s++) {
//
//            Node fstNode = nodeLst.item(s);
//
//            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
//
//                Element rplyElmnt = (Element) fstNode;
//                NodeList rplyElmntLst = rplyElmnt.getElementsByTagName("rply");
//                Element rplyElmnt = (Element) rplyElmntLst.item(0);
//                NodeList prly = rplyElmnt.getChildNodes();
//                System.out.println("Reply Code : "  + ((Node) prly.item(0)).getNodeValue());
//
//                NodeList lstNmElmntLst = rplyElmnt.getElementsByTagName("gameType");
//                Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
//                NodeList lstNm = lstNmElmnt.getChildNodes();
//                System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());
//            }
//
//        }
    }
}
