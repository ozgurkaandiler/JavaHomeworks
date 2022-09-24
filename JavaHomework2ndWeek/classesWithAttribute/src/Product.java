public class Product {

    public Product(int id,String name,String description,int stockAmount,int price)
    {

    }
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;

   //getter
    public int _getId() {
        return _id;
    }

    //setter
    public void setId(int id) {
        _id = id;
        //this,içerisinde bulunan classı belirler
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }
}
