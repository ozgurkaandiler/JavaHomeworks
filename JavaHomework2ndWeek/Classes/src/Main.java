public class Main {
    public static void main(String[] args)
    {
        //instance oluşturma
        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;

        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();

        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);
        System.out.println("****************************************");

        int[]sayilar=new int[]{5,6,9};
        int[]sayilar2=new int[]{1,7,0};

        sayilar2=sayilar;
        sayilar[0]=25;
        System.out.println(sayilar[0]);
         /*iş yapan her şey classtır */
    }
}
