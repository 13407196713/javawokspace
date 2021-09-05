package ch13code;

public class RuntimeExceptionTest {
	//定义静态方法OneMethod()，该方法抛出RuntimeException
    static void OneMethod(){
              throw new RuntimeException(" from OneMethod()");
    }
    //定义静态方法TwoMethod()，该方法调用函数OneMethod()
    static void TwoMethod(){
         OneMethod();
     }
     //定义静态方法ThreeMethod()，该方法调用函数TwoMethod()
     static void ThreeMethod(){
         TwoMethod();
     }
     public static void main(String[] args){
    //在主函数中调用ThreeMethod();
         ThreeMethod();
     }


}
