package lr6;

public class Example5 {
    public static int SummOfSqrd(int num){
        int res = 0;
        for (int i = 1; i <= num; i++){
            res += (int) Math.pow(i, 2);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(SummOfSqrd(3));
    }
}
