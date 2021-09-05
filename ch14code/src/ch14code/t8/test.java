package ch14code.t8;

import java.awt.*;

abstract class state{
    public abstract void handpush(Context c);
    public abstract void handpull(Context c);
    public abstract Color getcolor();
}

// 状态管理器
class Context{
    private state s = null;

    public void set_state(state s){
        this.s = s;
    }

    public void push() {
        s.handpush(this);
    }

    public void pull(){
        s.handpull(this);
    }
}

class blue extends state{
    @Override
    public void handpush(Context c) {
        System.out.println("变为绿色");
        c.set_state(new green());
    }

    @Override
    public void handpull(Context c) {
        System.out.println("变为红色");
        c.set_state(new red());
    }

    @Override
    public Color getcolor() {
        return Color.blue;
    }
}

class green extends state{
    @Override
    public void handpush(Context c) {
        System.out.println("变为黑色");
        c.set_state(new black());
    }

    @Override
    public void handpull(Context c) {
        System.out.println("变为蓝色");
        c.set_state(new blue());
    }

    @Override
    public Color getcolor() {
        return Color.green;
    }
}

class black extends state{
    @Override
    public void handpush(Context c) {
        System.out.println("变为红色");
        c.set_state(new red());
    }

    @Override
    public void handpull(Context c) {
        System.out.println("变为绿色");
        c.set_state(new green());
    }

    @Override
    public Color getcolor() {
        return Color.black;
    }
}

class red extends state{
    @Override
    public void handpush(Context c) {
        System.out.println("变为蓝色");
        c.set_state(new blue());
    }

    @Override
    public void handpull(Context c) {
        System.out.println("变为黑色");
        c.set_state(new black());
    }

    @Override
    public Color getcolor() {
        return Color.red;
    }
}

public class test {
    public static void main(String[] args) {
        blue blue = new blue();
        green green = new green();
        black black = new black();
        red red = new red();

        Context c = new Context();

        blue.handpush(c);
        red.handpull(c);
    }
}
