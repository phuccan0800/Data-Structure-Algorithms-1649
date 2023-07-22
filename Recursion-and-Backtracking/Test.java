public class Test {
    public static void main(String[] args){
        System.out.println(writeSequence(14));
    }
    public static String starString(int x){
        if (x<0) {
            throw new IllegalArgumentException();
        }
        else if (x==0) {
            return "*";

        }else {
            return  starString(x - 1) + starString(x-1);
        }
    }
    public static String writeNums(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1");
        } else {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
        return "";
    }
    static boolean check = false;
    public static String writeSequence(int n) {
        if (check==false) {
            check = true;
            if (n%2!=0) n = (n+1) /2;
            else n= n/2;
        }
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1 && n /2 == ) {
            System.out.print("1");
        } else {
            System.out.print(n+" ");
            writeSequence(n - 1);
            System.out.print(" " + n);

        }
        return "";
    }
}
