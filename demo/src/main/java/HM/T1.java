package HM;

public class T1 {
    public static void main(String[] args) {
        System.out.println(f(49,63));

        System.out.println(gcd(49,63));
    }
    static int f(int a,int b){

        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                return i;
            }
        }

        return -1;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
