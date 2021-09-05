package ch16code;

import java.util.ArrayList;

public class ArraylistTest {
	 public static void main(String[] args)                     //主方法
    {
        ArrayList<String> al=new ArrayList<String>();        	//创建对象al
        al.add("anson");                     	//添加元素到al
        al.add("John");                      	//添加元素到a1
        al.add("Tina");                       	//添加元素到a
        for(int i=0;i<al.size();i++)      	    //通过循环输出a1中的元素
        {
            System.out.println(al.get(i));    	//输出元素
        }
    }


}
