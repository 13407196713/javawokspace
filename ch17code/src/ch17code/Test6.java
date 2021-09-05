package ch17code;

import java.util.Iterator;
import java.util.TreeSet;

public class Test6 {
	public static void main(String[] args) {
		TreeSet<Teacher3> ts = new TreeSet<Teacher3>();     		//创建一个树集对象ts
		//创建6个教师对象 (注：下面括号中的教工号的双引号去掉)
		Teacher3 t1 = new Teacher3("赵浩", 1234001, "男", "1981-01-02");
		Teacher3 t2 = new Teacher3("黎平", 1234002, "男", "1982-08-09");
		Teacher3 t3 = new Teacher3("王鹏", 1234003, "男", "1982-11-22");
		Teacher3 t4 = new Teacher3("宋波", 1234004, "女", "1982-11-02");
		Teacher3 t5 = new Teacher3("章伟", 1234005, "男", "1980-01-12");
		Teacher3 t6 = new Teacher3("孙君", 1234006, "女", "1981-09-22");
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
		ts.add(t1);               				            //往树集中添加元素
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		ts.add(t5);
		ts.add(t6);
		System.out.println("这个小组有" + ts.size() + "个教师。");
		// 输出树集中的元素个数
		Iterator<Teacher3> it = ts.iterator();  		   //新建一个迭代器对象
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		ts.remove(t3);                    		          //删除树集中元素
		ts.remove(t4);
		System.out.println("由于有些教师离开了学校，经过我们的审核后，教师信息如下：");
		Iterator<Teacher3> it1 = ts.iterator();          //新建一个迭代器对象
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("这些教师今天都离职了，所有教师信息都可以删除了!");
		ts.remove(t1);                  			      //删除树集中的元素
		ts.remove(t2);
		ts.remove(t5);
		ts.remove(t6);
		if (ts.isEmpty()) {             			      //当ts中的元素为空时
			System.out.println("这里把教师信息都删除了。");
		} else {
			System.out.println("系统报错了!!!");
		}
	}


}
