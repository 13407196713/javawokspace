package ch17code;

import java.util.TreeMap;

public class Test7 {
	public static void main(String[] args) {               //主方法
		TreeMap<String, Teacher4> tm = new TreeMap<String, Teacher4>(); 		                //创建一个树映像对象tm
		//创建6个教师对象
		Teacher4 t1 = new Teacher4("赵浩", "1234001", "男", "1981-01-02");
		Teacher4 t2 = new Teacher4("黎平", "1234002", "男", "1982-08-09");
		Teacher4 t3 = new Teacher4("王鹏", "1234003", "男", "1982-11-22");
		Teacher4 t4 = new Teacher4("宋波", "1234004", "女", "1982-11-02");
		Teacher4 t5 = new Teacher4("章伟", "1234005", "男", "1980-01-12");
		Teacher4 t6 = new Teacher4("孙君", "1234006", "女", "1981-09-22");
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
		// 通过设置器赋值给对象
		tm.put("zh", t1); 				   //添加对象到树映像
		tm.put("lp", t2);
		tm.put("wp", t3);
		tm.put("sb", t4);
		tm.put("zw", t5);
		tm.put("sj", t6);
		System.out.println("这个小组有" + tm.size() + "个教师。");
		System.out.println(tm.values());
		tm.remove("lp");					//删除树映像中的元素。
		tm.remove("sb");
		System.out.println("帮我查找一下有没有孙君这个教师");
		if (tm.containsKey("sj")) {
			System.out.println("这个教师是存在的，他的信息如下：");
			System.out.println((Teacher4) tm.get("sj"));
		} else {
			System.out.println("这里没有这个教师。");
		}
		System.out.println("由于有些教师离开了学校，经过我们的审核后，教师信息如下：");
		System.out.println(tm.values());
		System.out.println("这些教师今天都离开了，所有教师信息都可以删除了!");
		tm.remove("zh");
		tm.remove("sj");
		tm.remove("zw");
		tm.remove("wp");
		if (tm.isEmpty()) {
			System.out.println("这里把教师信息都删除了。");
		} else {
			System.out.println("系统报错了!!!");
		}
	}


}
