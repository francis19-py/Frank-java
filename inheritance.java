class Animal{
    void eat(){
        System.out.println("this animal eats grass");

    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}

public class inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();// ingerited method
        d.bark(); //own method
    }
}