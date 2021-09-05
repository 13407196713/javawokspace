package ch18code;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
public class DeptHandler extends DefaultHandler{
	int deptindex = 1;
    //用来遍历xml文件的开始标签
    public void startElement(String uri, String localName, String qName,Attributes attributes) throws SAXException {
        //调用DefaultHandler类的startElement方法
        super.startElement(uri, localName, qName, attributes);
        //开始解析book元素的属性
        if(qName.equals("dept")) {
            System.out.println("------------现在开始遍历第" + deptindex + "部门---------");
            //已知dept元素下属性的名称，根据名称获取属性值
            String value = attributes.getValue("deptid");
            System.out.println("dept的属性值是：" + value);
            //不知道dept元素下属性的名称以及个数，如何获取元素名称及属性
            int num = attributes.getLength();
            for(int i = 0;i < num;i++) {
                System.out.print("第" + (i + 1) + "个dept元素的属性名是" + attributes.getQName(i));
                System.out.println("----dept元素的属性值是" + attributes.getValue(i));
            }
        }else if(!qName.equals("dept") && !qName.equals("depts")){
            System.out.print("节点名是" + qName);
        }
    }
     //用来遍历xml文件的结束标签
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if(qName.equals("dept")) {
            System.out.println("------------结束遍历第" + deptindex++ + "部门---------");
        }
    }
    //用来表示解析开始
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("SAX解析开始");
    }
    //用来表示解析结束
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("SAX解析结束");
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String value = new String(ch, start, length);
        //通过trim()截掉空格和换行符，如果是空字符则跳过if执行语句
        if(!value.trim().equals(""))
            System.out.println("节点值为" + value);
    }
    public static void main(String[] args) {
        //获取一个SAXParserFactory的实例
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            //通过factory获取SAXParser的实例
            SAXParser parser = factory.newSAXParser();
            //创建SAXParserHandler对象
            DeptHandler handler = new DeptHandler();
            parser.parse("D:\\javawokspace\\ch18code\\src\\ch18code\\dept.xml", handler);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
