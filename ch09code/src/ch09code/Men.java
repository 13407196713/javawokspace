package ch09code;

public class Men extends Person{
	int b;                                                  //定义整型变量b
    Men()                                        		    //子类的构造函数
    {
    //super();                                      	    //调用父类无参构造函数
    b=20;                                                   //给变量b赋值
    System.out.println("这个是子类的构造函数");                   //输出相应信息
    }
    public static void main(String[] args)                  //主方法
    {
        Men m=new Men();                                    //创建对象m
        System.out.println(m.a+" "+m.b);                    //输出相应信息
    }

}
