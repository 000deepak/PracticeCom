package Oops;

public class Polymorphism {
    public void eat() {
        System.out.println("Polymorphism is  eating");
    }

    public void eat(String who){
        System.out.println(who+"is eating");
    }

    /*public static void main(String[] args) {
        Polymorphism p = new Polymorphism();

        //Overloading
        p.eat();
        p.eat("dog");
       }*/
}

class Animal extends Polymorphism{

    @Override
    public void eat(){
        super.eat();           //calls the parent class method
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {
        Polymorphism a = new Animal();

        //Overriding
        a.eat();
    }
}