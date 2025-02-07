interface Animal {
    void makeSound();
}

class Dog implements Animal {
    
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("The dog barks");
        }
    }
}

public class lab7_8 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Calls the overridden method
        dog.makeSound(3); // Calls the overloaded method
    }
}
