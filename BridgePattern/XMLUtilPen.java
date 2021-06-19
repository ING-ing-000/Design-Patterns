package BridgePattern;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLUtilPen {
	public static Object getBean(String type) {
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc;
			doc=builder.parse(new File("config.xml"));
			
			NodeList nl= doc.getElementsByTagName("className");
			Node classNode1=nl.item(0).getFirstChild();
			Node classNode2=nl.item(1).getFirstChild();
			
			String cName1=classNode1.getNodeValue();
			String cName2=classNode2.getNodeValue();
			
			Class c1=Class.forName(cName1);
			Class c2=Class.forName(cName2);
			
			Object obj1=c1.newInstance();
			Object obj2=c2.newInstance();
			
			if(type.equals("color")) return obj1;
			if(type.equals("pen")) return obj2;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return type;
	}
}
