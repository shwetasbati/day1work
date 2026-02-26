public class Count_of_digits {
    public static void main(String[] args){
        int n=12345,count=0;
        if (n==0)
          count=1;
       else{
        while(n!=0){
            n=n/10;
            count++;
        }
       }
        System.out.println("Count of digits:"+count);
        
    }
    
}
