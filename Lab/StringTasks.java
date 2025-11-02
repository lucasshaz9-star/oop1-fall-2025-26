public class StringTasks {
    public static void main(String[] args) {

        String firstName = "Shalix";
        String lastName = "Sarker";
        String fullName = firstName + " " + lastName;
        System.out.println(" Full Name: " + fullName);

       
        String productName = "Laptop";
        int productID = 12345;
        String productCode = productName + " " + productID;
        System.out.println(" Product Code: " + productCode);

        
        String email = "lucasshaz9@gmail.com";
        String username = email.substring(0, 5);
        System.out.println(" Username: " + username);

        
        String message = "Hello";
        int length = message.length();
        System.out.println(" Total Characters: " + length);

        
        String sent = "Hello 2";
        System.out.println(" Uppercase: " + "HELLO 2");
        System.out.println("   Lowercase: " + "hello 2");

        
        String text = "Hello 3";
        String text2 = text.replace("Java", "Python");
        System.out.println("  Replacement: " + text2);
    }
}







    

