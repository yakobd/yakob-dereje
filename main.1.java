import com.sun.tools.jconsole.JConsoleContext;

public class Main {
    public static void main(String[] args) {
        String text = "java is a programming language";
        System.out.println(" #6.a " + text.substring(0, 4));
        System.out.println(" #6.b " + text.length());
        System.out.println(" #6.c " + text.substring(8, 12));
        System.out.println(" #6.d " + text.charAt(7));
        System.out.println(" #6.e " + text.indexOf('a'));
        //System.out.println(" #6.f " + concat(text,"family"));//
        System.out.println(" #6.g " + text.indexOf("programming"));
        System.out.println(" #6.h " + text.substring(0, 1) + text.substring(7, 9));
        System.out.println(" #6.i " + text.substring(5, 6) + text.substring(text.length() - 3, text.length()));
    }
}
    }
