package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public void setName(String name1)
    {
        this.name = name1;
    }
    public String getName()
    {
        return name;
    }
    public void setId(String id1)
    {
        this.id = id1;
    }
    public String getId()
    {
        return id;
    }
    public void setGroup(String group1)
    {
        this.group = group1;
    }
    public String getGroup()
    {
        return group;
    }
    public void setEmail(String email1)
    {
        this.email = email1;
    }
    public String getEmail()
    {
        return email;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        n = this.name;
        sid = this.id;
        em = this.email;
        this.group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name= s.getName();

        id= s.getId();

        email= s.getEmail();

        group= s.getGroup();


    }

    String getInfo() {
        // TODO:
        String kieuinSV = name + "\n" + id + "\n" + group + "\n" + email + "\n";
        return kieuinSV;
    }

}
