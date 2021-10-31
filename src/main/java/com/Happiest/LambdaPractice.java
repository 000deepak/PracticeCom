package com.Happiest;

public class LambdaPractice {
    public static void main(String[] args) {
        funInterf interf = (int a,int b)->a+b;
        System.out.println(interf.add1(5,6));
    }
}

@FunctionalInterface
interface funInterf{
    int add1(int a, int b);

}
