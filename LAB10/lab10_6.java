class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class lab10_6 {
    public static void checkString(String input) throws NoMatchException {
        if (!"India".equals(input)) {
            throw new NoMatchException("No match found for the input: " + input);
        } else {
            System.out.println("Input matches 'India'");
        }
    }

    public static void main(String[] args) {
        try {
            checkString("USA"); // Example: "USA" does not match "India"
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}