package ch17code;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {
	public static void main(String[] args) {     //主方法
		HashSet<Teacher2> hs = new HashSet<Teacher2>();                        //创建一个散列集对象hs
		//创建6个教师对象
		Teacher2 t1 = new Teacher2("赵浩", "1234001", "男", "1981-01-02");
		Teacher2 t2 = new Teacher2("黎平", "1234002", "男", "1982-08-09");
		Teacher2 t3 = new Teacher2("王鹏", "1234003", "男", "1982-11-22");
	    Teacher2 t4 = new Teacher2("宋波", "1234004", "女", "1982-11-02");
		Teacher2 t5 = new Teacher2("章伟", "1234005", "男", "1980-01-12");
		Teacher2 t6 = new Teacher2("孙君", "1234006", "女", "1981-09-22");
		//设置教师对象信息
		t1.setschoolname("重庆大学");
		t1.setclassname("计算机三班");
		t1.setfamilyaddress("重庆沙坪坝");
		t2.setschoolname("重庆大学");
		t2.setclassname("计算机三班");
		t2.setfamilyaddress("重庆沙坪坝");
		t3.setschoolname("重庆大学");
		t3.setclassname("计算机三班");
		t3.setfamilyaddress("重庆沙坪坝");
		t4.setschoolname("重庆大学");
		t4.setclassname("计算机三班");
		t4.setfamilyaddress("重庆沙坪坝");
		t5.setschoolname("重庆大学");
		t5.setclassname("计算机三班");
	    t5.setfamilyaddress("重庆沙坪坝");
	    t6.setschoolname("重庆大学");
		t6.setclassname("计算机三班");
		t6.setfamilyaddress("重庆沙坪坝");
		// 通过设置器赋值给每个对象
		hs.add(t1);                           			//往散列集中添加元素
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
	    System.out.println("这个小组有" + hs.size() + "个教师。");
		// 输出散列集中的元素个数
		Iterator<Teacher2> it = hs.iterator();          //新建一个迭代器对象
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		hs.remove(t3);                       			//删除散列集中元素
		hs.remove(t4);
		System.out.println("由于有些教师离开了学校，经过我们的审核后，教师信息如下：");
		Iterator<Teacher2> it1 = hs.iterator();         //新建一个迭代器对象
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("这些教师今天都离职了，所有教师信息都可以删除了!");
		hs.remove(t1);                        			//删除散列集中的元素
		hs.remove(t2);
		hs.remove(t5);
	hs.remove(t6);
		if (hs.isEmpty()) {                  			//当hs中的元素为空时
			System.out.println("这里把教师信息都删除了。");
		} else {
			System.out.println("系统报错了!!!");
		}
	}

}
