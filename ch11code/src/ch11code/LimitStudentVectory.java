package ch11code;

import java.util.Vector;

public class LimitStudentVectory {
	private Vector<Object> v1 = new Vector<Object>();       //创建Vector对象v1
		public void add(Student6 s) {          				//向v1中添加学生功能
			v1.add(s);
		}
		public Student6 get(int t) {             	        //获取学生id号
			return (Student6) v1.get(t);
		}
		public int size() {           						//获取集合对象的大小
			return v1.size();
		}
	    public static void main(String[] args) {
			//创建LimitStudentVectory对象v
			LimitStudentVectory v = new LimitStudentVectory(); 
		    //创建4个学生对象
			Student6 s1 = new Student6(6);
			Student6 s2 = new Student6(7);
			Student6 s3 = new Student6(8);
			Student6 s4 = new Student6(9);
			//创建1个Integer对象
			Integer t = new Integer(10);
			//添加各个对象到v对象
			v.add(s1);
			v.add(s2);
			v.add(s3);
			v.add(s4);
			//v.add(t);
			//遍历集合v
			for (int k = 0; k < v.size(); k++) {
				System.out.println(v.get(k));
			}
		}

}
