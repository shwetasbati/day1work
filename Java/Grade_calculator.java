public class Grade_calculator {
    public static void main(String[] args){
        int marks=98;
    if(marks>90)
        System.out.println("A:"+marks);
    else if(marks<89 & marks>75)
           System.out.println("B:"+marks); 
        else if(marks<74 & marks>50)
            System.out.println("C:"+marks);
        else
             System.out.println("fail:"+marks);
    }
    
}
