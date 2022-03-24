public class Main {

    public static int binarySearch(int[] array, int X) throws Exception {
        int center, left = 0;
        int right = array.length-1;

        do {
            center = (int)Math.round((double) (left+right) / 2);
            if (X < array[center])
                right = center;
            else
                left = center;
        } while(array[center] != X
                        && left < right);

        if (left == right)
            throw new Exception();

        return center;
    }

    public static void main(String[] args) throws Exception
    {
        int res = binarySearch(new int[] {1,2,3}, 3);
        int a = 1;
    }
}
