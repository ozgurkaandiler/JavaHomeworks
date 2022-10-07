abstract class BaseCreditManager implements ICreditManager
{

    public abstract void Calculate();// Bu metod, farklı classlarda değişkenlik göstereceği için abstract yapılmıştır.
    //kısacası kullanılacak her classta override yapılarak üzerine yazılır bu sayede içerisinde tanımlanan-
    //farklı kodların, ayrı bir biçimde çalışması sağlanır.

    @Override
    public  void Save()
    {
        System.out.println("Kaydedildi");
    }
}
