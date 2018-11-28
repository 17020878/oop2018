package week12;

/**
 * Mẫu Strategy:
 *
 * Ta định nghĩa sẵn các đối tượng, các thuật toán, các hàm…
 *
 * Mẫu strategy cho phép người sử dụng các “chiến lược” có sẵn vào những vấn đề cụ thể… Ngoài ra còn cho phép người dùng dễ dàng thêm vào một “chiến lược” mới.
 *
 * Các “chiến lược” được tách biệt ra khỏi chương trình. Người dùng chỉ cần biết cách sử dụng chúng, không cần biết chúng thực hiện như thế nào!
 */
 abstract class Task2Item1 {
    public void BubbleSort(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public  void  SelectionSort(int a[])
    {

        for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[index]){
                    index = j;
                }
            }
            int min = a[index];
            a[index] = a[i];
            a[i] = min;
        }
    }
}

public class Task2 extends  Task2Item1{
    public static void main(String[] args) {
        int a[] = {9,8,7,6,5,4,3,2,1};
        int b[] = {9,8,7,6,5,4,3,2,1};
        Task2 task = new Task2();
        System.out.print("BubbleSort: ");
        task.BubbleSort(a);
        for (int st : a)
        {
            System.out.print(st+" ");
        }
        System.out.println("\n");
        System.out.print("SelectionSort: ");
        task.SelectionSort(b);
        for (int st : b)
        {
            System.out.print(st+" ");
        }
    }
}