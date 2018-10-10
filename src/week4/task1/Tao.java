package week4.task1;

public class Tao extends HoaQua {
    //TODO: bổ sung thuộc tính
    String MuiVi;

    public Tao(String name, int price, String xuatxu, String MuiVi)
    {
        super(name, price, xuatxu);
        this.MuiVi = MuiVi;
    }

    public Tao(String MuiVi)
    {

        this.MuiVi = MuiVi;
    }
    public Tao()
    {

    }

    //TODO: tạo getter setter cho các thuộc tính

    public String getMuiVi() {
        return MuiVi;
    }

    public void setMuiVi(String muiVi) {
        this.MuiVi = muiVi;
    }
}
