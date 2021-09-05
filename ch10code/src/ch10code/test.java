package ch10code;

public class test {
    private static String s = "asd";
    private String s1 = "zxc";

    public test() {
        System.out.println("test");
    }

    public void i(){
        System.out.println(s1);
    }
    
    public static void s(){
        System.out.println(s);
    }
    
    public static class c{
        public c(){
            System.out.println("s1");
        }
        public void a(){
            System.out.println(s);
        }
    }
    
    public class i1{
        public i1(){
            System.out.println("i");
        }
        public void a(){
            System.out.println(s1);
            i();
        }
    }
    
    public void set(){
        new i1().a();
    }

    public static void main(String[] args) {
        new test().set();
    }
}
