package ch11code;
import java.util.Vector;
public class RandomGener {
	public static void main(String[] args) {     //主方法
		Vector<Integer> v = new Vector<Integer>(); 	//创建Integer类型泛型对象
		//添加成员
		v.add(1);
		v.add(2);
		Vector<Object> v1 = new Vector<Object>();		        //创建Object类型泛型对象
		//添加成员
		v1.add("aa");
		v1.add(2.2);
		radomMeth(v);
		radomMeth(v1);
	}
	   public static void radomMeth(Vector<?> vector) {		    //接受任何类型参数的方法
			// vector.add("1");
			System.out.println("输出" + vector + "各个成员----------");
			for (Object obj : vector) {           			    //通过循环实现遍历
				System.out.println(obj);
			}
			System.out.println("对象的大小" + vector.size());
	}

}
