package ch14code.t6;

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
class adapter implements target {

    private adaptee a;

    public adapter(adaptee a){
        super();
        this.a = a;
    }

    @Override
    public void v1() {
        a.v1();
    }

    @Override
    public void v2() {
        System.out.println("v2");
    }
}

public class test {
    public static void main(String[] args) {
        adaptee a1 = new adaptee();
        adapter a2 = new adapter(a1);
        a2.v1();
        a2.v2();
    }
}
