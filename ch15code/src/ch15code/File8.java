package ch15code;

import java.util.Arrays;

public class File8 {
	public static void main(String[] args) {     			//主方法
		//创建各种学生对象
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
		// 通过设置器赋予多个对象参数值
		st1.set(20, "男", "10000", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st2.set(22, "男", "10001", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st3.set(21, "男", "10002", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st4.set(19, "女", "10003", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st5.set(18, "女", "10004", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st6.set(24, "男", "10005", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st7.set(22, "男", "10006", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st8.set(29, "女", "10007", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st9.set(25, "女", "10008", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		st10.set(28, "男", "10009", "重庆大学", "大学三年级", "计算机专业", "重庆市沙坪坝区");
		//创建学生数组对象a
		Student[] a = new Student[] { st1, st2, st3, st4, st5, st6, st7, st8,st9, st10 };
		try {
			Arrays.sort(a);                              //实现排序功能
			//通过循环进行数组内容的输出
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (Exception e) {
			System.out.println("出错了");
		}
	}


}
