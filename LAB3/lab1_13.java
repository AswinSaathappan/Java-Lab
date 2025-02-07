public class lab1_13 {

    // Function to search the word "Web" in the given string
    public static boolean searchWord(String text, String word) {
        return text.contains(word);
    }

    public static void main(String[] args) {
        String text = "Programming the World Wide Web java program";
        String word = "Web";

        // Call the function to search the word
        boolean found = searchWord(text, word);

        // Display the result
        if (found) {
            System.out.println("The word \"" + word + "\" is found in the string.");
        } else {
            System.out.println("The word \"" + word + "\" is not found in the string.");
        }
    }
}