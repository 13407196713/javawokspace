package ch11code;
import java.util.Vector;
public class RandomGenerObject {
	public static void main(String[] args) {     //主方法
		Vector<Integer> v = new Vector<Integer>(); 		//创建Integer类型泛型对象
		Vector<Object> v1 = new Vector<Object>(); 		//创建Object类型泛型对象
		//调用静态方法radomMeth()
		//radomMeth(v);
		radomMeth(v1);
	}
	   public static void radomMeth(Vector<Object> vector) {	//接受任意类型泛型方法
		  	vector.add("cjg");
			vector.add(156);
			for (Object obj : vector) {					//通过循环实现遍历
				System.out.println(obj);
		}

}
}
