public class Main {
    public static void main(String[] args)
    {
        double[]numbers ={1.2,5.6,7.7,10.0,9.8};
        double total=0;
        double max=numbers[0];
        for (double number:numbers)
        {
            if (max<number)
            {
                max=number;
            }
            total=total+number;
            System.out.println(number);
        }
        System.out.println("Toplam: "+total);
        System.out.println("En büyük: "+max);
    }
}