package webdomtest;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.util.*;
import org.dom4j.*;
public class Dom4jApp1 {
	public static void parseXML()                     		
	{
		SAXReader parser =new SAXReader();
		try{
			Document doc=parser.read(new File("dept.xml")); 
			Element root=doc.getRootElement();   		
		    String rootName=root.getName();      		
			System.out.println(rootName);       			
			List<Element> list = root.elements();
			for(Element e:list)
			{
				String eName=e.getName();      			
				System.out.println(eName);     			
				List<Attribute> atts=e.attributes();	
				for(Attribute att:atts)
				{
					String attName=att.getName();		
					String attValue=att.getValue(); 	
					System.out.println(attName+"---"+attValue);
				}
				Iterator<?> iter=e.elementIterator();	
				while(iter.hasNext())
				{
					Element child=(Element) iter.next(); 
					String childName=child.getName(); 	
					String childText=child.getText();  	
					System.out.println(childName+"---"+childText);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args)      			
	{
		parseXML();                              			
	}
	
}
