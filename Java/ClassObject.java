class Student{
    int id;
    String name;
    void display(int roll){
        System.out.println( "Roll no:"+ roll + " ," +"Id:"+id +" ,"  +"Name:"  +name);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=101;
        s1.name="Shweta";
        s1.display(23);

     Student s2=new Student();
        s2.id=102;
        s2.name="Soumya";
        s2.display(34);
        
        
    }

    
}
