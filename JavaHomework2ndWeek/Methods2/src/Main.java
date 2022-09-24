public class Main {
    public static void main(String[] args)
    {
        ekle();
        sil();
        guncelle();

        int total=topla(10,6);
        System.out.println(total);

        String message=mesajVer();
        System.out.println(message);

        int total2=topla2(7,7,8);
        System.out.println(total2);
    }
    //void operasyonları, geriye değer döndürmeyip sadece içerisinde tanımlanan kod bloklarını çalıştırıp her yerde çağrılabilir.
    //herhangi bir değişkenlerle işlem yapılmak istenmediği durumlarda void kullanılır
    //ekleme,silme,güncelleme gibi işlemlerde genellikle "void" kullanılır.

    public static void ekle()
    {
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    //parametreli metodlar

    public static int topla(int sayi1,int sayi2)
    {
        return sayi1+sayi2;
        //parametreli metotlar, metodun işlem ve geri döndürme işlemini gerçekleştirmesi için metodlara istenen parametre verilmelidir
        //ardından parametreli metod bir değişkene atanarak her yerde kullanılabilir
    }

    public static String mesajVer()
    {
      return "bugün hava yağmurlu 22.09.2022 16:32";
    }

    public static int topla2(int... sayilar)
    {
        int toplam=0;
        for (int sayi:sayilar)
        {
            toplam+=sayi;
        }
        return toplam;
        /*Variable arguments: metoda parametre olarak tanımlanır ve parametreleri diziye çevirir
        * bu da sınırsız değer göndermemizi sağlar */
    }
}