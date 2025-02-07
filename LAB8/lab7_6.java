abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
   
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class lab7_6{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}
