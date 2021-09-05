package ch14code.t3;

// 产品类
abstract class bmw{
    public bmw(){}
}

class bmw320 extends bmw {
    public bmw320(){
        System.out.println("制造bmw320");
    }
}

class bmw520 extends bmw {
    public bmw520(){
        System.out.println("制造bmw520");
    }
}

// 工厂类
interface factory{
    public bmw crrat();
}

class factorybmw320 implements factory{
    @Override
    public bmw crrat() {
        return new bmw320();
    }
}

class factorybmw520 implements factory{
    @Override
    public bmw crrat() {
        return new bmw520();
    }
}

public class test {
    public static void main(String[] args) {
        factorybmw320 f1 = new factorybmw320();
        factorybmw520 f2 = new factorybmw520();

        f1.crrat();
        f2.crrat();
    }
}