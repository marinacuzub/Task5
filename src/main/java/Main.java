

public class Main {
    int a=5;
    int b=9;

    @Override
    public String toString() {
        return "Main{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    int F= (int) 2.58f;
// This is a constructor
    public Main(int a, int b) {
        this.a = a;
        this.b = b;

    }
}