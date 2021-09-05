package ch11code;
import java.lang.reflect.Field;  
public class FieldRef {
	public static void main(String[] args) throws SecurityException,
					NoSuchFieldException, IllegalArgumentException,
					IllegalAccessException {                   //主方法
		Point point = new Point(3, 4);                   		//定义一个坐标
		//获取字段y的值
		Field fieldY = point.getClass().getField("y");      	     //获取类中的类字段
		System.out.println("输出public属性字段" + fieldY.get(point));  //获取对象中值
		//获取字段y的值
		Field fieldX = point.getClass().getDeclaredField("x");                       //获取类中的类字段
		fieldX.setAccessible(true);                   			   //改变类字段的属性
		System.out.println("输出private属性字段" + fieldX.get(point));
		//调用方法chang()方法
		chang(point);
		System.out.println(point);                        		   //输出对象point
	}
	//通过反射改变字段中的字母方法
public static void chang(Object obj) throws IllegalArgumentException,
			IllegalAccessException {
		Field[] fields = obj.getClass().getFields();    		//获取所有成员字段
		for (Field field : fields) {         	         		                //遍历字段数组
			if (String.class == field.getType()) {      		//若类型为Sting类型
				String oldValue = (String) field.get(obj);	//获取成员字段的值
				String newValue = oldValue.replace('a', 'b');	//实现替换
				field.set(obj, newValue);                 		     //设置成员字段的值
			}
		}
	}

}
