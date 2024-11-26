public class stringcalling {
    public static void main (String[] args)
    {
        String personalized = greet("Prasoon\tRao");
        System.out.println(personalized);
        
    }
    static String greet(String name)  
    {
        String message="Hello\t"+name;
        return message;
    }
}
