package ch17code;

import java.util.Iterator;
import java.util.LinkedList;


public class File1 {
	public void add() {                              //创建一个add方法
		LinkedList List = new LinkedList(); 	     //创建一个链表类对象list.
		//添加元素到对象List里
		List.add("王鹏");
		List.add("王浩");
		List.add("王杰");
		List.add("张杰");
		List.add("李杰");
		List.add("孙文杰");
		List.add("赵杰");
		Iterator it = List.iterator();    		                //创建一个迭代器对象it
		System.out.println("现在添加了如下的同学的姓名：");
		//通过迭代器对象it来遍历list对象中的元素
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("删除某些同学的姓名后，还剩下哪些同学呢？");
		it.remove();                           		//移除元素
		//创建另一个迭代器对象it1来重新遍历list对象中的元素
		Iterator it1 = List.iterator();
		for (int i = 0; i < List.size(); i++) {
			System.out.println(it1.next());
		}
	}
	public static void main(String[] args) {   	   //主方法
		File1 f = new File1();                	   //创建对象f
		f.add();                         		   //调用方法add()
	}

}
