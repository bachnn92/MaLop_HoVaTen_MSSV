package practice00;

public class Incremental {
    static int count = 0;
 
    static void p(int n) {
        count++;
        if (count <= n) {
            System.out.println("hello " + count);
            p(n);
        }
    }
 
    public static void main(String[] args) {
        p(9);
    }
}