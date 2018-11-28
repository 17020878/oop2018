package week12;

import java.util.ArrayList;

public class Task1 {
    /**
     * Composite Pattern cho phép tương tác với tất cả các đối tượng tương tự nhau giống như là các đối tượng đơn hoặc collections.
     *
     */
    public static abstract class Task1Item {
        public abstract int Children();
        public abstract boolean isMarried();
    }
    /**
     * Component (Thành phần):
     *
     * Khai báo interface hoặc abstract chung cho các thành phần đối tượng.
     * Chứa các method thao tác chung của các thành phần đối tượng.
     * Leaf (Lá):
     *
     * Biểu diễn các đối tượng lá (ko có con) trong thành phần đối tượng.
     * Composite (Hỗn hợp):
     *
     * Định nghĩa một thao tác cho các thành phần có thành phần con.
     * Lưu trữ thành phần con.
     * Thực thi sự quản lý các thành phần con của giao diện Component.
     */
    public static class Task1Item1 extends Task1Item{
        String name;
        String Sex;
        String DateOfBirth;
        int Children;
        boolean Married;
        Task1Item1(){}
        Task1Item1(String name, String Sex, String DateOfBirth, boolean Married, int Children)
        {
            this.name = name;
            this.Sex = Sex;
            this.DateOfBirth = DateOfBirth;
            this.Married = Married;
            this.Children = Children;
        }

        public int getChildren() {
            return Children;
        }

        @Override
        public int Children() {
            return Children;
        }

        public void setMarried(boolean Married) {
            Married = Married;
        }
        @Override
        public boolean isMarried() {
            return Married;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return Sex;
        }

        public void setSex(String sex) {
            Sex = sex;
        }
        public String getDateOfBirth() {
            return DateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            DateOfBirth = dateOfBirth;
        }

        public boolean isMarriedWith(Task1Item1 task1, Task1Item1 task2) {
            return false;
        }
    }

        static public boolean check(Task1Item1 name1, Task1Item1 name2)
        {
            return false;
        }
        public static void main(String[] args) {
            ArrayList<Task1Item1> Task = new ArrayList<>();
            Task1Item1 person1 = new Task1Item1("manh", "nam", "19/12/1989", true, 2);
            Task1Item1 person2 = new Task1Item1("nam", "nam", "20/11/1970",true, 3 );
            Task1Item1 person3 = new Task1Item1("thao", "nu", "12/1/1997", false, 0);
            Task1Item1 person4 = new Task1Item1("chinh", "nam", "12/1/1980", false, 0);
            Task1Item1 person5 = new Task1Item1("duong", "nam", "20/2/1987", false, 0);
            Task1Item1 person6 = new Task1Item1("linh", "nu", "12/1/1990", false, 0);
            Task1Item1 person7 = new Task1Item1("phuong", "nu", "12/1/1983", true, 2);
            Task1Item1 person8 = new Task1Item1("vinh", "nu", "12/1/1998", true, 3);

            Task.add(person1);
            Task.add(person2);
            Task.add(person3);
            Task.add(person4);
            Task.add(person5);
            Task.add(person6);
            Task.add(person7);
            Task.add(person8);

            System.out.println("Nhung nguoi doc than :");
            for(int i = 0; i < Task.size(); i++)
            {
                if(Task.get(i).isMarried() == false) System.out.println( Task.get(i).getName());
            }
            System.out.println("Nhung nguoi co 2 con  :");
            for(int i = 0; i < Task.size(); i++)
            {
                if(Task.get(i).Children() == 2) System.out.println(Task.get(i).getName());
            }
        }
    }

