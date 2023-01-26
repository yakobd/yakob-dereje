public class Main {

    // stack exercise

    public static void main(String[] args) {
        int y = isStacked(2);
        System.out.println("our function returned " + y);
    }

    public static int isStacked(int n) {
        int x = 0;
        for (int j = 1; j < n; j++) {
            x = +j;
            if (x <= n) {
                if (x == n) {
                    System.out.println("1");
                    return 1;
                }
            }
        }
    return n;
    }
}
