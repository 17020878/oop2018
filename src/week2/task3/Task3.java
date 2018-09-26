package week2.task3;

//public class Task3 {


import java.util.concurrent.Callable;

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
    // Hãy mô tả ít nhất ba đối tượng quanh cuộc sống của bạn (ví dụ: giáo viên, con mèo, tổng thống, lập trình viên, v.v.).
    // Với mỗi đối tượng, bạn hãy mô tả trong một class tương ứng, mỗi class có ít nhất ba thuộc tính và ba phương thức
    // không tính getter, setter).
    // Chú ý rằng các thuộc tính và phương thức phải thể hiện được đặc trưng của đối tượng đó.
        class CaRoPhi{
            private double nhietdo, doman, ph;
            public void setNhietDo(double nhietdo)
            {
                this.nhietdo = nhietdo;
            }
            public double  getNhietDo()
            {
                return nhietdo;
            }
        public void setDoMan(double doman)
        {
            this.doman = doman;
        }
        public double  getDoMan()
        {
            return doman;
        }
        public void setPH(double ph)
        {
            this.ph = ph;
        }
        public double  getPH()
        {
            return ph;
        }
        public void NhietDo(double nhietdo)
        {
            if(nhietdo >= 20 && nhietdo <=32 )
                System.out.println("Nhiet Do can thich hop cho su phat trien cua ca Ro Phi");
            if(nhietdo <= 5.5)
                System.out.println("Ca Ro Phi da bi chet ret");
            if(nhietdo >= 42)
                System.out.println("Ca Ro Phi da bi chet nong");
        }
         public void DoMan(double doman)
        {
            if(doman >=25 && doman <= 0.4  )
            System.out.println("Ca Ro Phi song binh thuong");
            if(doman >= 0 && doman <= 0.25)
            System.out.println("Ca tang truong nhanh, thit thom ngon");
        }
         public void pH(double ph)
        {
            if(ph>=6.5 && ph <= 8.5)
                System.out.println("Moi truong thich hop cho ca ro phi");
            if(ph<4)
                System.out.println("Ca Ro Phi khong the chiu dung duoc trong moi truong nay" + "\n" );
        }
        public static void main(String[] args)
        {
            CaRoPhi caRoPhi = new CaRoPhi();
            caRoPhi.NhietDo(25);
            caRoPhi.DoMan(0.12);
            caRoPhi.pH(3.5);
        }
    }
    class ConNguoi{
            private double cannang;
            private  int dotuoi, dotuoi2;
            private String gioitinh;
        public void setCanNang(double cannang)
        {
            this.cannang = cannang;
        }
        public double  getCanNang()
        {
            return cannang;
        }
        public void setDoTuoi(int dotuoi)
        {
            this.dotuoi = dotuoi;
        }
        public int getDoTuoi()
        {
            return dotuoi;
        }
        public void setDoTuoi2(int dotuoi2)
        {
            this.dotuoi2 = dotuoi2;
        }
        public int  getDoTuoi2()
        {
            return dotuoi2;
        }
        public void setGioiTinh(String gioitinh)
        {
            this.gioitinh = gioitinh;
        }
        public String  getGioiTinh()
        {
            return gioitinh;
        }
            public  void CanNang(double cannang, String gioitinh)
        {
            if(gioitinh == "nu" )
            {
                if(cannang> 60)
                    System.out.println("De bi beo phi");
                else
                    System.out.println("than hinh tuong doi hoan hao");
            }
            if(gioitinh == "Nam")
            {
                if(cannang < 50 )
                    System.out.println("Bi duy dinh duong");
                else
                    System.out.println("Dan ong tuong doi hoan hao");
            }
        }
        public void DoTuoi(int dotuoi )
        {
            if(dotuoi>=18)
                System.out.println("Da du tuoi chiu trach nhiem truoc phap luat ve hanh vi nhan su");
            else
                System.out.println("Chua du tuoi chiu trach nhien ve hanh vi nhan su");
        }
        public void DoTuoi2(int dotuoi2)
        {
            if(dotuoi2 >= 1 && dotuoi2 <= 10)
                System.out.println("Ban dang o do tuoi tre con");
            else if(dotuoi2 >10 && dotuoi2 <= 17)
                System.out.println("Ban dang o tuoi day thi");
            else if(dotuoi2 > 18 && dotuoi2 <= 30)
                System.out.println("Ban dang o tuoi thanh xuan");
            else if(dotuoi2 > 30 && dotuoi2 <= 50)
                System.out.println("Ban dang o tuoi trung nien");
            else if(dotuoi2 > 50 )
                System.out.println("Ban dang o tuoi gia");
        }
        public static void main(String[] args)
        {
            ConNguoi conNguoi = new ConNguoi();
            conNguoi.CanNang(40, "Nam");
            conNguoi.DoTuoi(16);
            conNguoi.DoTuoi2(19);
        }
    }

    class ConMeo {
            private int tuoimeo;
            private double kichthuoc;
            private int giongu;
        public void setTuoiMeo(int tuoimeo)
        {
            this.tuoimeo = tuoimeo;
        }
        public double  getTuoiMeo()
        {
            return tuoimeo;
        }
        public void setKichThuoc(double kichthuoc)
        {
            this.kichthuoc = kichthuoc;
        }
        public double  getKichThuoc()
        {
            return kichthuoc;
        }
        public void setGioNgu(int giongu)
        {
            this.giongu = giongu;
        }
        public double  getGioNgu()
        {
            return giongu;
        }
        public void TuoiMeo(int tuoimeo) {
            if (tuoimeo > 2)
                System.out.println("Meo co the bat chuot");
            else
                System.out.println("Meo con van ohu thuoc vao bo me");
        }

        public void KichThuoc(double kichthuoc) {
            if (kichthuoc >= 2.5 && kichthuoc <= 7)
                System.out.println("Kich thuoc phat trien chuan cua Meo truong thanh");
            else if (kichthuoc < 2.5)
                System.out.println("Meo chua truong thanh");
            else if (kichthuoc > 7)
                System.out.println("Meo phat trien hon muc bing thuong");

        }

        public void GioNgu(int giongu) {
            if (giongu >= 12 && giongu <= 16)
                System.out.println("Muc do ngu Trung Binh cua loai meo");
            else if (giongu > 20)
                System.out.println("Meo ngu qua nhieu, de beo phi");
            else if (giongu < 12)
                System.out.println("Meo thieu ngu, so voi muc gio ngu trung binh");
        }

        public static void main(String[] args) {
            ConMeo conMeo = new ConMeo();
            conMeo.TuoiMeo(3);
            conMeo.KichThuoc(8);
            conMeo.GioNgu(21);
        }
    }
//}