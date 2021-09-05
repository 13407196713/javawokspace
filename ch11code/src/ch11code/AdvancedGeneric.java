package ch11code;
import java.util.ArrayList;
public class AdvancedGeneric {
	public static void main(String[] args) {           //主方法
		ArrayList<String> arry1= new ArrayList<String>();		      //创建对象arry1
		arry1.add("cjg");
		ArrayList<Integer> arry2 = new ArrayList<Integer>();		//创建对象arry2
		arry2.add(27);
		System.out.println("arry1对象与arry2对象是否指向同一份字节码？"+(arry1.getClass()==arry2.getClass()));
	}

}
