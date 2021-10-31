package Oops;

public class Abstraction extends Abstract implements interf {
    public static void main(String[] args) {

        Abstraction a = new Abstraction();
        a.add(5,6);
        a.multiply(5,6);

    }

    @Override
    int add(int a, int b) {
        return a+b;

    }

    @Override
    public int muitplyTwo(int a, int b) {
        return a*b;
    }
}

abstract class Abstract{
    abstract int add(int a, int b);

    int multiply(int a, int b){return a*b;}
}

interface interf{
    int muitplyTwo(int a,int b);
}