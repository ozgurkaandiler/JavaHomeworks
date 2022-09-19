public class Main {
    public static void main(String[] args)
    {
       for (int i=0;i<=10;i++)
       {
           System.out.println(i);
       }

       //1'den 100'e kadar tek sayıları yazdıran döngü

        for (int j=0;j<=10;j++)
        {
            if (j%2!=0)
            {
                System.out.println(j);
            }
        }
        System.out.println("FOR **********************************");
        //While Döngüsü
        int counter=1;
        while(counter<10)
        {
            counter++;
            System.out.println(counter);
        }
        System.out.println("WHILE **********************************");
        int j=50;
        do {
            j++;
            System.out.println(j);
        }while (j<50);
        System.out.println("DOWHILE **********************************");
    }
}