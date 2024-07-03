package strategy.example2;

public class DoubleSortHandler implements SortHandler {
    private double[] array = null;

    @Override
    public void swap(int index) {
        double temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }

    @Override
    public void setArray(Object array) {
        this.array = (double[]) array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public boolean outOfOrder(int index) {
        return (array[index] > array[index + 1]);
    }
}
