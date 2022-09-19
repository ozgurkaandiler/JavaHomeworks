public class Main {
    public static void main(String[] args)
    {
        char grade='A';

        switch (grade)
        {
            case'A':
                System.out.println("Başarılı");
                break;
            case'B':
                System.out.println("Geçtiniz");
                break;
            case'C':
                System.out.println("İyi");
                break;
            case'D':
                System.out.println("Fena Değil");
                break;
            case'F':
                System.out.println("Kaldın");
                break;
            default:
                System.out.println("Invalid Value");

        }

    }
}