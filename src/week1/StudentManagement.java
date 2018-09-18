package week1;



public class StudentManagement {


    Student[] students = new Student[100];

    public  boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }


    public void studentsByGroup() {
        String nameGroup1 = "INT22042";
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup().equals(nameGroup1)) {
                System.out.println(students[i].getInfo());
            }
        }
    }

    public void remove(String id) {
        int dem = students.length;
        int i;
        for (i = 0; i < dem; i++) {
            if (students[i].getId().equals(id)) {
                break;
            }
        }
        if (i == dem) System.out.println("Khong co sinh vien nao co trung ma ID");
        for (int j = i; j < dem - 1; j++) {
            students[j] = students[j + 1];
        }
        dem--;
    }

    public static void main(String[] args) {
        StudentManagement kiemtra = new StudentManagement();

        Student sv1 = new Student();

        sv1.setName("sv1 : Monkey D.Luffy");
        sv1.setId("17020878");
        sv1.setGroup("INT22041");
        sv1.setEmail("17020878@vnu.edu.vn");
        System.out.println(sv1.getInfo());

        Student sv2 = new Student();

        sv2.setName("sv2 : Vinsmoke Sanji");
        sv2.setId("17020879");
        sv2.setGroup("INT22042");
        sv2.setEmail("17020879@vnu.edu.vn");
        System.out.println(sv2.getInfo());

        Student sv3 = new Student();

        sv3.setName("sv3 : Roronoa Zoro");
        sv3.setId("17020880");
        sv3.setGroup("INT22041");
        sv3.setEmail("17020880@vnu.edu.vn");
        System.out.println(sv3.getInfo());


        //Kiểm tra 2 sinh viên có cùng lớp hay không?
        System.out.println("Kiem tra co sinh vien nao cung lop hay khong? " + "\n");
        if (kiemtra.sameGroup(sv1, sv3)) System.out.println("sv1 va sv3 cung lop" + "\n");
        else if(kiemtra.sameGroup(sv1, sv2))  System.out.println("sv1 va sv2 cung lop" + "\n");
        else if (kiemtra.sameGroup(sv2, sv3))  System.out.println("sv2 va sv3 cung lop" + "\n");


        //Nhập thông tin sinh viên
        for (int i = 0; i < kiemtra.students.length; i++) {
            kiemtra.students[i] = new Student();
            kiemtra.students[i].setName("NGUYEN DANG MANH");
            kiemtra.students[i].setId("12345678");
            kiemtra.students[i].setGroup("INT2204-2");
            kiemtra.students[i].setEmail("changomanh13@gmail.com");
        }
        //In ra thông tin sinh viên
        System.out.println("In ra danh sach sinh vien cung lop " + "\n");

        for (int i = 0; i < kiemtra.students.length; i++) {
            System.out.println(kiemtra.students[i].getInfo());
        }



        kiemtra.studentsByGroup();

        System.out.println("Xoa sinh vien có ma sinh vien ID la id " + "\n");

        kiemtra.remove("id");

    }
}