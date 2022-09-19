public class Main {
    public static void main(String[] args)
    {
        int[]sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=10;



        for (int i=0;i<sayilar.length;i++)
        {
            if (aranacak==sayilar[i])
            {
                System.out.println("bulunan sayı: "+sayilar[i]);
                break;
            }
            else
            {
                System.out.println("aranan sayı mevcut değil");
            }
        }
    }
}