package ch17code;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {      	                       //主方法
					ArrayList<Teacher> al = new ArrayList<Teacher>();           	           //创建对象a1
					//创建7个教师对象
					Teacher t = new Teacher("孟凡良", "34512", "男", "1954-09-23");
					Teacher t1 = new Teacher("赵浩", "1234001", "男", "1981-01-02");
					Teacher t2 = new Teacher("黎平", "1234002", "男", "1982-08-09");
					Teacher t3 = new Teacher("王鹏", "1234003", "男", "1982-11-22");
					Teacher t4 = new Teacher("宋波", "1234004", "女", "1982-11-02");
					Teacher t5 = new Teacher("章伟", "1234005", "男", "1980-01-12");
					Teacher t6 = new Teacher("孙君", "1234006", "女", "1981-09-22");
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
					//把每个对象添加到数组列表中去
				    al.add(t1); 
					al.add(t2);
				    al.add(t3);
					al.add(t4);
					al.add(t5);
					al.add(t6);
					System.out.println("这个小组有" + al.size() + "个教师。");
				    //输出数组列表中的元素个数
					for (int i = 0; i < al.size(); i++) {
					//输出数组列表中的元素，以字符串形式
					System.out.println((Teacher) al.get(i)); 
				}
					System.out.println("对不起，系统出错了!有个教师信息错了,需要改正。");
					al.set(5,t);
					System.out.println("经过我们的审核后，教师信息如下：");
				for (int i = 0; i < al.size(); i++) {
						System.out.println((Teacher) al.get(i));
					}
					//删除数组列表中的元素
				    al.remove(2); 
					al.remove(4);
					System.out.println("有两个教师辞职了，所以剩下教师信息为：");
					for (int i = 0; i < al.size(); i++) {
						//输出剩下的数组列表中的元素
						System.out.println((Teacher) al.get(i)); 
					}
				}


}
