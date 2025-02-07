import java.util.Iterator;

class CardIterator implements Iterator<Integer> {
    private int current = 2;

    public boolean hasNext() {
        return current <= 14;
    }

    public Integer next() {
        return current++;
    }
}

public class lab8_3 {
    public static void main(String[] args) {
        CardIterator cards = new CardIterator();
        while (cards.hasNext()) {
            System.out.println(cards.next());
        }
    }
}
