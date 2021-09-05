package ch14code.t7;

import java.util.ArrayList;
import java.util.List;

// 观察者的接口
interface watcher{
    public void update();
}

// 观察者的类
// 保镖
class security implements watcher{
    @Override
    public void update() {
        System.out.println("保镖在保护黄金");
    }
}

// 强盗
class thief implements watcher{
    @Override
    public void update() {
        System.out.println("强盗想抢劫这批黄金");
    }
}

// 警察
class police implements watcher{
    @Override
    public void update() {
        System.out.println("警察在保护这批黄金");
    }
}

// 被观察者的接口
interface watched{
    public void add_watcher(watcher w);
    public void remove_watcher(watcher w);
    public void notitf_watcher();
}

// 被观察者的类
// 黄金是被观察者
class transport implements watched{
    private List<watcher> list = new ArrayList<watcher>();

    @Override
    public void add_watcher(watcher w) {
        list.add(w);
    }

    @Override
    public void remove_watcher(watcher w) {
        list.remove(w);
    }

    @Override
    public void notitf_watcher() {
        for (watcher w:list)
            w.update();
    }
}

public class test {
    public static void main(String[] args) {
        transport tr = new transport();

        police p = new police();
        security s = new security();
        thief th = new thief();

        tr.add_watcher(p);
        tr.add_watcher(s);
        tr.add_watcher(th);

        tr.notitf_watcher();
    }
}
