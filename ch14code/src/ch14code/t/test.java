package ch14code.t;

class bmw320{
    public bmw320(){
        System.out.println("制造bmw320");
    }
}

class bmw520{
    public bmw520(){
        System.out.println("制造bmw520");
    }
}

public class test {
    public static void main(String[] args) {
        bmw320 b1 = new bmw320();
        bmw520 b2 = new bmw520();
    }
}
