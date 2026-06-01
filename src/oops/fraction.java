package oops;

public class fraction {
    public static int gcd(int a, int b) {
        int main = Math.min(a, b);
        for(int i = main; i >= 1; i--) {
            if(a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static class Fraction{
        int num;
        int den;
        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
        }
        public void simplyfy() {
            // TODO Auto-generated method stub
           int hcf = gcd(num, den);
           num = num /hcf;
           den = den / hcf;
            throw new UnsupportedOperationException("Unimplemented method 'simplyfy'");
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction( 1,  2);
        System.out.println(f1.num + "/" + f1.den);
        f1.simplyfy();
        // Fraction f2 = new Fraction( 3,  4);
        // System.out.println(f2.num + "/" + f2.den);
    }
}
