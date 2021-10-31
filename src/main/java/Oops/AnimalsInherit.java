package Oops;

public class AnimalsInherit {

    public void eat(){
        System.out.println("eating");
    }
}

class Dog extends AnimalsInherit{
    public void bark(){
    System.out.println("bark");}

    public static void main(String[] args) {
        AnimalsInherit a =new AnimalsInherit();
        Dog d = new Dog();
        a.eat();
        d.bark();
        d.bark();
    }
}
