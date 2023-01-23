public class Casting {

    // casting practice

    // casting is converting one datatype to another
    // there are two types of casting implicit and explicit.
    // in implicit casting conversion is made automatically.
    // but n explicit casting conversion is made by the programmer.

    // implicit casting
    double e = 4;
    double f = 4.5F;
    long d = 3;

    // explicit casting

    public static void main(String[] args) {
        int i = (int) 4.5; // if the expression (int) wasn't there then we would have got an error.
        System.out.println(i);
        float x = (float) 4.5; // if the expression (float) wasn't there then we would have got an error.
        System.out.println(x);

    }
}
