package ch12code;

public class st {
    private int[] data = new int[10];
    private int ip=0, op=0, c=0;

    public synchronized void put(int n){
        try {
            while (c == data.length) {
                this.wait();
            }

            data[ip] = n;
            System.out.println(ip + " 放入 " + n);
            ip++;

            if(ip == data.length) {
                ip = 0;
            }
            c++;

            this.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void get(){
        try {
            while (c==0){
                this.wait();
            }

            int t = data[op];
            System.out.println(op + " 取出 " + t);
            data[op] = 0;
            op++;

            if(op==data.length){
                op = 0;
            }
            c--;

            this.notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class input implements Runnable{
    private st s;
    private int num=0;

    input(st s){
        this.s = s;
    }

    @Override
    public void run() {
        while (num<20){
            s.put(num++);
        }
    }
}

class output implements Runnable{
    private st s;
    output(st s){
        this.s = s;
    }

    @Override
    public void run() {
        while (true){
            s.get();
        }
    }
}

class test{
    public static void main(String[] args) {
        st s = new st();
        input s1 = new input(s);
        output s2 = new output(s);
        new Thread(s1).start();
        new Thread(s2).start();
    }
}

