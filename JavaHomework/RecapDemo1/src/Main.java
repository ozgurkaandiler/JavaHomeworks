public class Main {
    public static void main(String[] args)
    {
        int sayi=20;
        int sayi2=1;
        int sayi3=128;
        int buyukSayi=sayi;

        if (buyukSayi<sayi2)
        {
            buyukSayi=sayi2;
        }
        if (buyukSayi<sayi3)
        {
            buyukSayi=sayi3;
        }

        System.out.println("En büyük : "+buyukSayi);
    }
}