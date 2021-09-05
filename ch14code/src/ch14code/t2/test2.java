package ch14code.t2;

abstract class bmw{
    public bmw(){}
}

class bmw320 extends bmw{
    public bmw320(){
        System.out.println("制造bmw320");
    }
}

class bmw520 extends bmw{
    public bmw520(){
        System.out.println("制造bmw520");
    }
}

class factory{
    public bmw creat(int type){
        switch (type){
            case 320:
                return new bmw320();
            case 520:
                return new bmw520();
            default:
                break;
        }
        return null;
    }
}

public class test2 {
    public static void main(String[] args) {
        factory f = new factory();
        bmw320 b1 = (bmw320) f.creat(320);
        bmw520 b2 = (bmw520) f.creat(520);
    }
}