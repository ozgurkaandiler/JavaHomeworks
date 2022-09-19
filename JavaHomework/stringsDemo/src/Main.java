public class Main {
    public static void main(String[] args)
    {
        String message="Deneme yanılma testi.";
        /*System.out.println(message);
        System.out.println("************************************");
        System.out.println("Eleman sayısı: "+ message.length());
        System.out.println("5. Eleman : "+ message.charAt(4));
        System.out.println(message.concat("Yaşasın!"));
        System.out.println("************************************");
        System.out.println(message.startsWith("D"));
        System.out.println(message.endsWith("."));
        System.out.println("************************************");
        char [] characters=new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);*/

        String newMessage=message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(message.substring(2,5));

        for (String kelime:message.split(" "))
        {
           System.out.println(kelime);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}