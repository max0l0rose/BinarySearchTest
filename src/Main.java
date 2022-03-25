
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    public static int binarySearch(int[] array, int X)
    {
        int center, left = 0, right = array.length-1;

        do {
            center = (left+right) / 2;
            if (X < array[center])
                right = center;
            else
                left = center;

            if (array[center] == X)
                return center;
        } while((right-left) > 1);

        return array[left] == X ? left : right;
    }

    public static void main(String[] args)
    {
        int res;
        System.out.println(res = binarySearch(new int[] {-2,-1,0,3,4,10}, -1));
        //assert (res == 1);
        //assertThat(res);
        assertTrue(res == 1);
    }
}
