package ch14code.t9;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<Double> s = new TreeSet<Double>();

        for (int i = 0; i < 10; i++){
            Random r =new Random();
            double t = r.nextDouble()*100%71+30;
            DecimalFormat df   =new   java.text.DecimalFormat("#.0");
            s.add(Double.valueOf(df.format(t)));
        }

        Iterator<Double> it = s.iterator();
        System.out.println("成绩由低到高：");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\n不及格的成绩：");
        SortedSet<Double>s1 = s.headSet(60.0);
        for(double t:s1)
            System.out.println(t);

        System.out.println("\n90以上的成绩：");
        SortedSet<Double>s2 = s.tailSet(90.0);
        for(double t:s2)
            System.out.println(t);
    }
}
