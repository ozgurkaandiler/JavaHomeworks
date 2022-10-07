public class Main {
    public static void main(String[] args)
    {
        CreditManager creditManager=new CreditManager();
        creditManager.Save();
        creditManager.Save();

        Customer customer=new Customer();
        customer.Id=1;

        Company company=new Company();
        company.companyName="PMP Makina";
        company.taxNo="4558700354";
        company.Id=100;

        Person person=new Person();
        person.Id=5;
        person.firstName="Deneme";
        person.lastName="Yanılma";
        person.nationalityId="64465468";

        CustomerManager customerManager =new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.Save();

        //bir sınıf, bir sını inherit edebilir. bir sınıf, birden çok interfacei implemente edebilir
    }
}