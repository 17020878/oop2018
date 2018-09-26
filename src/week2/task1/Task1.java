package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a==0) return b;
        return gcd(b%a , a);

    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0) return  0;
        else if(n==1) return  1;
        return fibonacci(fibonacci(n-1)+fibonacci(n-2));
    }

    public static void main(String[] args)
    {
        System.out.println("UCLN cua 2 so 10 va 8 la : ");
        System.out.println(gcd(2,10));
        System.out.println(" Fibonacci cua so 39 la : ");
        System.out.println(fibonacci(39));
    }

}
