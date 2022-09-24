public class Main {
    public static void main(String[] args)
    {
        sayiBulmaca();

    }
    public static void sayiBulmaca()
    {
      int[]sayilar=new int[]{1,2,5,7,9,0};
      int aranacak=5;
      boolean varMi=false;
      for (int sayi:sayilar)
      {
          if (sayi==aranacak)
          {
              varMi=true;
              break;
          }

      }
        if (varMi){
            sendMessage(aranacak);
        }
        else
        {
            System.out.println("sayı mevcut değildir");
        }
    }

    public static void sendMessage(int aranacak)
    {
        System.out.println("sayı mevcuttur (çalıştı)"+aranacak);
    }

}