package AbstractC_Interface;

// INTERFACE AS PARAMETER --------------
interface Sortable {
    void sort();
}

class BubbleSorter implements Sortable {
    @Override
    public void sort() {
        System.out.println("I am a bubble sort!");
    }
}

class QuickSorter implements Sortable {
    @Override
    public void sort() {
        System.out.println("I am a Quick sort!");
    }
}


public class In_practice2 {

    public static void performSort(Sortable s) {
        s.sort();
    }

    public static void main(String[] args) {
        BubbleSorter b = new BubbleSorter();
        QuickSorter q = new QuickSorter();

        performSort(b);
        performSort(q);
    }
    
}
