public class Main {
    public static void main(String[] args)
    {
        Product product=new Product(1,"Coffeé Machine","Espresso",150,3500);

        /*product.setId(1);
        product.set_name("Coffeé Machine");
        product.set_description("Espresso");
        product.set_stockAmount(150);
        product.set_price(3500);*/

        ProductManager productManager=new ProductManager();

        productManager.Add(product);

    }
}