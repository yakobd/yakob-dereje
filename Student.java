import java.util.*;
public class Student{
    int id;
    String Student_name;
    String Fathers_name;
    int age;
    String department;
    int year;
    public static void isSquare(){
        int a;
        int b;
        int c;
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("insert the number to check for square ");
        a=input.nextInt();
        for (i=2;i <100;i++){
            if(a%(i*i)==0){
                System.out.println(1);
                break;
            }
            else {
                continue;
            }

        }
        if(a%(i*i)!=0){
            System.out.println(0);}
    }
 public  Student(String Student_name,String Fathers_name,String department,int year,int id){
     this.Student_name=Student_name;
     this.Fathers_name=Fathers_name;
     this.id=id;
     this.department=department;
     this.year=year;
     System.out.println("hello"+ Student_name +" "+Fathers_name);
     System.out.println(Student_name+"you are "+year+" "+" year");
     System.out.println(Student_name+"your id is"+id);
     System.out.println(Student_name+" your department is"+department);

 }
    public static void main(String[] args)
    {
        int id;
        String Student_name;
        String Fathers_name;
        int age;
        String department;
        int year;
        Scanner input= new Scanner(System.in);
        System.out.println("insert your name");
        Student_name=input.nextLine();
        System.out.println("insert you father name");
        Fathers_name=input.nextLine();
        System.out.println("insert your department");
        department=input.nextLine();
        System.out.println("insert your year");
        year=input.nextInt();
        System.out.println("insert your id");
        id=input.nextInt();
Student Student= new Student(Student_name,Fathers_name,department, year, id);
   isSquare();
    }
}