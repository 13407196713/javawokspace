package ch17code;

import java.util.Iterator;
import java.util.LinkedList;

public class File2 {
	public static void main(String[] args) {    			     //主方法
		//创建10个学生对象
	    Student st1 = new Student("王鹏");
	    Student st2 = new Student("王浩");
	    Student st3 = new Student("孙鹏");
	    Student st4 = new Student("孙文君");
		Student st5 = new Student("谭妮");
		Student st6 = new Student("赵志强");
		Student st7 = new Student("王凯");
		Student st8 = new Student("苏瑞");
		Student st9 = new Student("张伟");
		Student st10 = new Student("张杰");
		//设置学生信息
		st1.set(20, "男", "10000", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
	    st2.set(22, "男", "10001", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st3.set(21, "男", "10002", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st4.set(19, "女", "10003", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st5.set(18, "女", "10004", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st6.set(24, "男", "10005", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st7.set(22, "男", "10006", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st8.set(29, "女", "10007", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st9.set(25, "女", "10008", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝");
		st10.set(28, "男", "10009", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		try {
			LinkedList<Student> list1 = new LinkedList<Student>();		    //创建对象list1
			//添加10个学生对象到对象list1中
			list1.add(st1);
			list1.add(st2);
			list1.add(st3);
		    list1.add(st4);
			list1.add(st5);
		    list1.add(st6);
			list1.add(st7);
		    list1.add(st8);
			list1.add(st9);
		    list1.add(st10);
			//it是迭代器对象，通过它来指向链表中的元素
			Iterator<Student> it = list1.iterator(); 
			System.out.println("以下就是所有的同学的信息：");
			while (it.hasNext()) {                 		//通过循环输出相应信息
				System.out.println(it.next());
			}
			System.out.println("其中有几个同学已经转学了!");
			System.out.println("那么就从数据库中删除他：");
			//移除相应信息
			list1.remove();
			list1.remove();
			list1.remove();
			list1.remove();
			list1.remove();
			Iterator<Student> it1 = list1.iterator();      		//获取迭代器对象it1
			while (it1.hasNext()) {
				System.out.println(it1.next());
			}
		} catch (Exception e) {
		}
	}

}
