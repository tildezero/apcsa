package u8.p2;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int l1[] = {1, 2, 3, 4, 5, 6};
        int l2[] = reverse(l1);
        System.out.println(Arrays.toString(l2));
    }

    public static int[] reverse(int[] li) {
        int[] res = new int[li.length];
        for (int i = 0; i < li.length; i++) {
            res[li.length - 1 - i] = li[i];
        }
        return res;
    }

}