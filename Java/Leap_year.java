class Leap_year {
    public static void main(String[] args){
        int year=1900;
       System.out.println("the give no :"+year);
        if(year%4 ==0 & year%100==0 & year%400==0 )
        System.out.println("The Given year is an leap year:"+year);
        else
            System.out.println("the given yearis not leap year:"+year);
            
    }
    
}
