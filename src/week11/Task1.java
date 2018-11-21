package week11;
public class Task1 {
    public static <T extends Comparable> void sortArr(T[]a) {

        int n = a.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j+1].compareTo(a[j])<=0)
                {
                    T temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }

    public static void main(String[] args) {
        Task1 hihi = new Task1();
        Character b[] = {'a','c','b','v'};
        Integer a[] = {9,8,7,6,5,4,2,1};
        hihi.<Integer>sortArr(a);
        hihi.<Character>sortArr(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " " );
        }
        System.out.println("\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
