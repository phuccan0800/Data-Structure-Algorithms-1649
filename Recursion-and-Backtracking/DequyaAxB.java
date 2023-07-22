import java.io.Console;

public class DequyaAxB {
    static int a = 5;
    static int b = 5;
    static int ab = 0;
    public static void main(String[] args) {
        dequy(b);
        System.out.println(ab);
    }
    public static void dequy(int b){
        if (b < 1) { return;}
        ab +=a;
        dequy(b-1);
    }
}
