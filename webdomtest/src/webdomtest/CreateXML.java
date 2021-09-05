package webdomtest;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.dom4j.*;
import org.dom4j.io.*;

public class CreateXML {
	public static void createXML() 			       // 创建XML文件
	{
		Document doc = DocumentHelper.createDocument();  //获取Document对象
		doc.addComment("人的信息xml文件"); 			    //设置注释信息
		// 设置根元素
		Element root = doc.addElement("peoples"); 	//为Document对象设置根元素
		// 设置第一个儿子元素
		Element p1 = root.addElement("person"); 	//为根对象设置儿子元素
		p1.addAttribute("pid", "1");                //设置儿子元素的属性
		p1.addComment("第一个人");              		//设置儿子元素的注释
		// 设置孙子元素
		Element pnameEle = p1.addElement("pname");	//为儿子对象设置孙子元素
		pnameEle.setText("张三");                  	//设置孙子对象的内容
		Element psexEle = p1.addElement("psex");
		psexEle.setText("男");
		Element pageEle = p1.addElement("page");
		pageEle.setText("20");
		Element phoneEle = p1.addElement("phone");
		phoneEle.setText("13556746645");
		// 设置第二个儿子元素
		Element p2 = root.addElement("person");
		p2.addAttribute("pid", "2");
		p2.addComment("第二个人");
		// 设置孙子元素
		Element pnameEle2 = p2.addElement("pname");
		pnameEle2.setText("张三");
		Element psexEle2 = p2.addElement("psex");
		psexEle2.setText("男");
		Element pageEle2 = p2.addElement("page");
		pageEle2.setText("20");
		Element phoneEle2 = p2.addElement("phone");
		phoneEle2.setText("13556746645");
		// 设置第三个儿子元素
		Element p3 = p2.createCopy();        		//通过第二儿子复制设置第三个儿子
		p3.addComment("第三个人");
		p3.attribute("pid").setValue("3");        	//修改第三个儿子的属性
		p3.element("pname").setText("李四"); 		    //修改第三个儿子的孙子元素
		root.add(p3);                        		//第三个儿子添加到根元素里
		try {
			//定义把document进行输入的格式
			OutputFormat format = new OutputFormat();
			format.setEncoding("utf-8");    		//输入的编码格式
			format.setIndent(true);       			//输入是否缩进
			format.setIndent("  ");      			//输入缩进的间距
			format.setNewlines(true);   			//换行输出
			format.setSuppressDeclaration(true);
			OutputStream os = new FileOutputStream("peoples.xml"); 
			XMLWriter writer = new XMLWriter(os, format);	//设置输出流的格式
			writer.write(doc);                  		    //输出doc内容
			writer.close();                   		        //关闭资源
			os.close();                      			    //关闭资源
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)     		    //主函数
	{
		createXML();                               		//调用相应方法
		System.out.println("创建xml文件成功！");
	}
}
