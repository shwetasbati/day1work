public class Sumofdigits {
    public static void main(String[] args) {
        int n=123,add=0;
        System.err.println("The original no:"+n);
        while(n!=0){
            int module=n%10;
             add= add+module;
            n=n/10;

        }
        System.out.println("Sum of digits:"+add);
        
    }

    
}
