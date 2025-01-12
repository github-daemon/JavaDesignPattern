package template.example2;

public class DoubleBubbleSorter extends BubbleSorter {
    private double[] array = null;

    public int sort(double[] theArray) {
        array = theArray;
        length = array.length;
        return doSort();
    }

    @Override
    protected void swap(int index) {
        double temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }

    @Override
    protected boolean outOfOrder(int index) {
        return (array[index] > array[index + 1]);
    }
}
