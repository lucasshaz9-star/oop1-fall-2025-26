public class main5 {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap:");
        System.out.println("a = " + a + ", b = " + b);

       
        a = a + b;  
        b = a - b; 
        a = a - b;  

        System.out.println("\nAfter swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}


