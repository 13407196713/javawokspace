package ch14code.t4;

// 发动机
interface engine{}

class engine_a implements engine{
    public engine_a(){
        System.out.println("制造engine_a");
    }
}

class engine_b implements engine{
    public engine_b(){
        System.out.println("制造engine_b");
    }
}


// 空调
interface aircondition{}

class aircondition_a implements aircondition{
    public aircondition_a(){
        System.out.println("制造aircondition_a");
    }
}

class aircondition_b implements aircondition{
    public aircondition_b(){
        System.out.println("制造aircondition_b");
    }
}

// 工厂类
interface factory{
    public engine crrat_engine();
    public aircondition crrat_aircondition();

}

class factorybmw320 implements factory {

    @Override
    public engine crrat_engine() {
        return new engine_a();
    }

    @Override
    public aircondition crrat_aircondition() {
        return new aircondition_a();
    }
}

class factorybmw520 implements factory {

    @Override
    public engine crrat_engine() {
        return new engine_b();
    }

    @Override
    public aircondition crrat_aircondition() {
        return new aircondition_b();
    }
}


public class test {
    public static void main(String[] args) {
        factorybmw320 f1 = new factorybmw320();
        factorybmw520 f2 = new factorybmw520();

        f1.crrat_engine();
        f1.crrat_aircondition();

        f2.crrat_engine();
        f2.crrat_aircondition();
    }
}
