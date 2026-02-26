public class Reverse_no {
    public static void main(String[] args) {
        int n=1234,reverse=0,remainder;

        System.out.println("Given no:"+n);

        while(n!=0){
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
      }
        System.out.println("Reverse no:"+reverse);
    }
    
}
