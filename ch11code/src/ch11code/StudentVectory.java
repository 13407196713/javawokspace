package ch11code;
import java.util.Vector;
public class StudentVectory {
	public static void main(String[] args) {    //主方法
		Vector<Object> v = new Vector<Object> ();    //创建集合Vector对象
		//创建四个学生对象
	    Student6 s1 = new Student6(6);
		Student6 s2 = new Student6(7);
		Student6 s3 = new Student6(8);
		Student6 s4 = new Student6(9);
		Integer t = new Integer(10);       			      //创建一个Integer类型对象
		//实现把五个对象添加到集合对象v
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
	//把Integer类型的对象t添加进了集合对象v中
		v.add(t); 
		//遍历集合v
		for (int i = 0; i < v.size(); i++) {
			Student6 s = (Student6) v.get(i);   		//获取学生的编号
			System.out.println(s);
		}
	}

}
