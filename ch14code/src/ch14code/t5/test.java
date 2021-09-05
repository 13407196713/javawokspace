package ch14code.t5;

// 目标类
interface target{
    public void v1();
    public void v2();
}

// 源
class adaptee{
    public void v1(){
        System.out.println("v1");
    }
}

// 适配器类
class adapter extends adaptee implements target{

    @Override
    public void v2() {
        System.out.println("v2");
    }
}

public class test {
    public static void main(String[] args) {
        adapter a = new adapter();
        a.v1();
        a.v2();
    }
}
