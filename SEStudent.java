import java.util.Scanner;

public class SEStudent extends SEprogram{
    int studentid;
    String name;
    int year;


    private SEStudent getname;
    SEStudent bini = new SEStudent( String name ,int year , int Studentid

    public SEStudent(int calculateTotalAssesmentScore) {

    } );
    public static int calculateTotalAssesmentScore(){
        int sum=0;
        System.out.println("pleas enter the number of assesment");
        Scanner numofass = new Scanner(System.in);
        int n = numofass.nextInt();
        System.out.println("please enter the assesments one by one");
        for ( int i=0 ; i<n ; i++){
            Scanner x= new Scanner(System.in);
            sum =+ x.nextInt();
        }
        return sum;

    }
}
