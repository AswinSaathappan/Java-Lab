interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class lab8_1a{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        
        Animal cat = new Cat();
        cat.sound();
    }
}
