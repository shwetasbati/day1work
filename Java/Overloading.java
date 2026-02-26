class Student{
    Student(){
        System.out.println("Constructor1");
    }
    Student(double a){
    System.out.println("a:"+a);
    }
     Student(int a,int b){
     System.out.println("a:"+a +" ,"+"b:"+b);
     }
}



public class Overloading {
     public static void main(String[] args) {
        Student s1=new Student();
       Student s2=new Student(2.90);
        Student s3=new Student(2,4);
}
}
