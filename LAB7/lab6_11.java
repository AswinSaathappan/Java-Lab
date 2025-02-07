import java.util.Vector;

public class VectorVsArray {
    public static void vectorVsArray() {
        int[] array = new int[5];
        array[0] = 1;
        System.out.println("Array size: " + array.length);

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        System.out.println("Vector size: " + vector.size());
    }

    public static void main(String[] args) {
        vectorVsArray();
    }
}