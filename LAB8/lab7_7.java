class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        super.makeSound();
        System.out.println("The dog barks");
    }
}

public class lab7_7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
