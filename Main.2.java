public class Main {

// string exercise

    public static void main(String[] args) {
        String fName = " yakob dereje negash";
        String department = " SOFTWARE ENGINEERING ";

        // changing a string to uppercase

        System.out.println(" before translaton = " + fName);
        System.out.println(" after trnslation = " + fName.toUpperCase());

        // changing a string to lowercase

        System.out.println(" before translaton = " + department);
        System.out.println(" after translaton = " + department.toLowerCase());

        // to know the length of our string

        System.out.println("length of the string fName = " + fName.length());
        System.out.println("length of the string department = " + department.length());

        // to check whether our string is empty or not

        System.out.println(fName.isEmpty());
        System.out.println(department.isEmpty());

        // to print a given index character from the string

        System.out.println(fName.charAt(9));
        System.out.println(department.charAt(15));

        // to print the index of a given character in a string

        System.out.println(fName.indexOf('d'));
        System.out.println(department.indexOf('E'));

        // if there are same characters and we want to see the last character's index

        System.out.println(fName.lastIndexOf('e'));
        System.out.println(department.lastIndexOf('E'));

        // adding a string to an orignal string

        System.out.println(fName.concat(" jimma "));
        System.out.println(department.concat(" DEPARTMENT "));

    }
}