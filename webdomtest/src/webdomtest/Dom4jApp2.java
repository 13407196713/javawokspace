package webdomtest;
import org.dom4j.io.SAXReader;
import java.io.File;
import org.dom4j.*;
public class Dom4jApp2 {
	public static void parseXML() 
			{
				SAXReader parser=new SAXReader();    		//获取解析对象
				try{
					//关于根元素的相关信息
					Document doc=parser.read(new File("dept.xml")); 
					Element root=doc.getRootElement();    	//获取根对象
					String rootName=root.getName();        	//获取根元素的名称
					System.out.println(rootName);
					//关于儿子对象的相关信息
					Element e1=root.element("dept");      		//获取儿子对象
					String eName=e1.getName();            		//获取儿子对象的名称
					System.out.println(eName);
					Attribute att=e1.attribute("deptid");     	//得到儿子对象的属性对象
					String attName=att.getName();         		//获取属性对象的名称
					String attValue=att.getValue();           	//获取属性对象的值
					System.out.println(attName+"---"+attValue);
					//关于名为deptname孙子对象的相关信息
					Element e21=e1.element("deptname"); 		//获取孙子对象
					String childName21=e21.getName();   		//孙子对象的名称
					String childText21=e21.getText();     		//孙子对象的内容
					System.out.println(childName21+"---"+childText21);
					//关于名为deptnum孙子对象的相关信息
					Element e22=e1.element("deptnum");
					String childName22=e22.getName();
					String childText22=e22.getText();
					System.out.println(childName22+"---"+childText22);
					//关于名为deptdesc孙子对象的相关信息
					Element e23=e1.element("deptdesc");
					String childName23=e23.getName();
					String childText23=e23.getText();
					System.out.println(childName23+"---"+childText23);
				}catch(Exception e){
					e.printStackTrace();
				}
}
	public static void main(String[] args){     			//主函数
	     parseXML();                              			//调用parseXML()方法
        }
}