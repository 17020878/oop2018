package week10;

public class Task2 {
    public double[] Ramdom() {

        double[] temp = new double[1000];
        for(int i=0;i<1000;i++){
            temp[i] = Math.random()*(1000-1) +1;
        }
        return temp;


    }
    public void bubbleSort(double[] temp)
    {
        for(int i=0; i<temp.length-1; i++)
        {
            for(int j=0; j<temp.length -1 ; j++)
            {
                if(temp[j] > temp[j+1])
                {
                    Double dem = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = dem;
                }
            }
        }
    }
    public  static void main(String[] args)
    {
        Task2 a = new Task2();
        double[] mang = a.Ramdom();
        a.bubbleSort(mang);
        for(int i=0;i<mang.length;i++){
            System.out.println(mang[i]);
        }
    }
}