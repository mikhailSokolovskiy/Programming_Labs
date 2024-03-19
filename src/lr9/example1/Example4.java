package lr9.example1;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        int res;
        if (n == 1) return 1;
        else{
            res = fact(n - 1) * n;
            return res;
        }
    }
}
