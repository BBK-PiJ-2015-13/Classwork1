/**
 * Created by Tom on 24/01/2017.
 */
import java.lang.Class;
import java.lang.reflect.*;
import java.util.Scanner;
public class Reader {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(java.lang.Class.forName(x));
    }
//
}
