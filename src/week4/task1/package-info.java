/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
class main{
    public static void main(String[] args) {
        HoaQua hoaqua = new HoaQua();
        QuaCam quacam = new QuaCam("CamCanh",25000,"VietNam","Yellow");
        Tao tao = new Tao("China",30000,"TrungQuoc","Ngot");
        CamSanh camsanh = new CamSanh("CamSanh",20000,"HaGiang",14);
        CamThanhPhong camthanhPhong = new CamThanhPhong("CamThanhPhong",40000,"HoaBinh",25);
    }
}