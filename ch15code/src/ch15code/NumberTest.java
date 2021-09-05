package ch15code;

public class NumberTest {
	public static void main(String[] args) {                    //主方法
		Integer data21 = Integer.valueOf(127);    			    //创建对象data21
		Integer data22 = Integer.valueOf(127);  			    //创建对象data22
		Integer data211 = Integer.valueOf(128);   			    //创建对象data211
		Integer data221 = Integer.valueOf(128);     		    //创建对象data221
		Integer data31 = -128;
		Integer data32 = -128;
		Integer data311 = -129;
		Integer data321 = -129;
		System.out.println("data21与data22是否为同一个对象?" + (data21 == data22));
		System.out.println("data211与data221是否为同一个对象?" + (data211 == 
		    data221));
		System.out.println("data31与data32是否为同一个对象?" + (data31 == data32));
		System.out.println("data311与data321是否为同一个对象?" + (data311 == 
		    data321));
	}

}
