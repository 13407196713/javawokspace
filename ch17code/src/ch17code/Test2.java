package ch17code;

import java.util.Hashtable;

public class Test2 {
	public static void main(String[] args) {    		                   //主方法
		Hashtable<String, Teacher1> ht=new Hashtable();          		    //创建对象ht
		//创建7个教师对象
		Teacher1 t = new Teacher1("孟凡良", "34512", "男", "1954-09-23");
		Teacher1 t1 = new Teacher1("赵浩", "1234001", "男", "1981-01-02");
		Teacher1 t2 = new Teacher1("黎平", "1234002", "男", "1982-08-09");
	    Teacher1 t3 = new Teacher1("王鹏", "1234003", "男", "1982-11-22");
		Teacher1 t4 = new Teacher1("宋波", "1234004", "女", "1982-11-02");
	    Teacher1 t5 = new Teacher1("章伟", "1234005", "男", "1980-01-12");
		Teacher1 t6 = new Teacher1("孙君", "1234006", "女", "1981-09-22");
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
		t.setschoolname("成都科技大学");
		t.setclassname("机械系三班");
		t.setfamilyaddress("成都市区");
		//在散列表中添加元素
		ht.put("zh", t1); 
		ht.put("lp", t2);
		ht.put("wp", t3);
		ht.put("sb", t4);
		ht.put("zw", t5);
		ht.put("sj", t6);
		System.out.println("这个小组有" + ht.size() + "个教师。");
		//输出散列表中的元素个数
		System.out.println(ht.values());
		System.out.println("我需要查找一个教师的信息。");
		//输出散列表中的元素内容
		if (ht.containsKey("wh")) {
			System.out.println("找到了此教师的信息，如下：");
			System.out.println((Teacher1) ht.get("wh"));
		} else {
			System.out.println("没有找到此教师的信息!");
		}
		ht.remove("lp");              				         //删除散列表中的元素
		ht.remove("sj");
		System.out.println("由于有些教师离开了学校，经过我们的审核后，教师信息如下：");
		System.out.println(ht.values());    		          //输出散列表中剩下的元素内容
	}

}
