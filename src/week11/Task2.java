package week11;

import java.util.ArrayList;

public class Task2 {
    public static <T extends Comparable> T max(ArrayList<T> a) {
        if(a == null || a.size() == 0) return null;
        T max = a.get(0);
        for (int i = 1; i< a.size(); i++){
            if(max.compareTo(a.get(i))< 0)
                max = a.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Double> b = new ArrayList<>();
       // Integer[] a = {-5,6,-8,0,1,9,8,7,5,4};
        //Double[] b = {-1.1,5.2,-11.5,1222.1,-2.5};
        a.add(4);
        a.add(5);
        a.add(-6);
        a.add(1000);
        b.add(-1.1);
        b.add(-1000.2);
        b.add(3.5);
        b.add(1.7);
        int max = max(a);
        double max1 = max(b);
        System.out.println(max);
        System.out.println(max1);
    }
}