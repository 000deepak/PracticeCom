package com.Happiest;

public class Practice {

    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) throws CustomException {
        int age = 17;
        try  {
            voterCheck(age);
        } catch (CustomException ex) {
            System.out.println(ex);
            System.out.println("normal termination");
        }
    }

    public static void voterCheck(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("you are underage",CustomException.AgeException.UNDERAGE);
        } else {
            System.out.println("You can vote");
        }
    }
}
