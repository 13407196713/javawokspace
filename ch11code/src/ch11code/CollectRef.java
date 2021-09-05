package ch11code;
import java.io.*;
import java.util.*;
public class CollectRef {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException,
					InstantiationException, IllegalAccessException,
					ClassNotFoundException {                     //主方法
		//读取属性文件
		InputStream is = new FileInputStream("bin//Config.properties");
		Properties props = new Properties(); 			        //创建Properties类型对象
		props.load(is);                          			    //加载输入流
		is.close();                             		        //关闭输入流
		String className = props.getProperty("className");	    //获取相应的值
		//创建相应的集合对象
		Collection<String> collections = (Collection<String>)Class.forName(className).newInstance();
		//为集合collections添加数据
		collections.add("1");
		collections.add("2");
		collections.add("3");
		collections.add("4");
		System.out.println("collections集合中的成员" + collections);
	}

}
