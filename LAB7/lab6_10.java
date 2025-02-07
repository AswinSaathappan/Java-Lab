public class StringVsStringBuffer {
    public static void stringVsStringBuffer() {
        String str = "Hello";
        str = str.concat(" World");
        System.out.println("String: " + str);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer: " + sb.toString());
    }

    public static void main(String[] args) {
        stringVsStringBuffer();
    }
}