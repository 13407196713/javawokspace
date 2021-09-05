package ch11code;

import java.util.Vector;

public class GenericStudentVectory {
	public static void main(String[] args) {                    //主方法
		Vector<Student6> v = new Vector<Student6>(); 			//创建对象v
		Student6 s1 = new Student6(6);
		Student6 s2 = new Student6(7);
		Student6 s3 = new Student6(8);
		Student6 s4 = new Student6(9);
		Integer t = new Integer(10);              			     //创建对象t
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		//v.add(t); 
		for (int k = 0; k < v.size(); k++) {     			    //遍历集合k
			System.out.println(v.get(k));
		}
	}

}
