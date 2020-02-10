public abstract class calci {
    abstract void addition(int a,int b);
    abstract void subtraction(int a,int b);
    abstract void multiply(int a,int b);
    abstract void division(int a,int b);

}
class operation extends calci {
    @Override
    void addition(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
    @Override
    void subtraction(int a, int b) {
        int c=a-b;
        System.out.println(c);
    }
    @Override
    void multiply(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }

    @Override
    void division(int a, int b) {
        int c=a/b;
        System.out.println(c);
    }

}
