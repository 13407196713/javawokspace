package ch16code;

public class Htable {

	public static void main(String[] args) {
		Hashtable numbers=new Hashtable();       			           //创建对象numbers
		numbers.put("one", new Integer(1));           		//添加元素
		numbers.put("two",new Integer(2));
		numbers.put("three",new Integer(3));
		//要取出一个数，比如2，用相应的key：
		Integer n=(Integer)numbers.get("two");
		System.out.println("two="+n);        
	}

}
