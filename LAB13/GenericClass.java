// Generic Class with Two Type Parameters and Generic Constructor
class GenericClass<T, U> {

    private T first;
    private U second;

    // Generic constructor
    public GenericClass(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }

    public static void main(String[] args) {
    
        GenericClass<Integer, String> example = new GenericClass<Integer,String>(42, "Hello, Generics!");

        
        example.display();
    }
}
