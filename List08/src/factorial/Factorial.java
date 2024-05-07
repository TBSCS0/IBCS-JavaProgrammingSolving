package factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factRec(4));
    }

    static long factIter(int n){
        long total = 1;
        for (int i = n; i > 0 ; i--) {
            total = total * i;
        }
        return total;
    }

    static long factRec(int n){
        if(n == 0) return 1;
        else return n * factRec(n-1);
    }
}
