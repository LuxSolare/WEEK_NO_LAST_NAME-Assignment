import java.util.*;

import java.lang.*;

public class WEEK_NO_LAST_NAME {
    static Random random = new Random();

    static int arrayLength = random.nextInt(11);

    static int target = random.nextInt(21);
    static int[] nums = new int[arrayLength];

    public static void main(String[] args) {

        int i;
        for (i = 0; i < arrayLength; i++) { // give array elements values 1 - 9
            nums[i] = 1 + i;
        }

        System.out.println("Target sum: " + target);
        System.out.print("Addends: [");

        for (i = 0; i < arrayLength; i++) { // print array values
            System.out.print(nums[i] + ", ");
        }
        System.out.println("]"); // end of array

        System.out.print("Addends to Target sum: [");
        // return an array, do not add individual variables
        addArrayElements(0, 0);
        System.out.println(addArrayElements(0,0)[0] + ", " + addArrayElements(0,0)[1] + "]");


    } // end of main method

    public static int[] addArrayElements(int f, int c) { // computing target addends
            /* Target sum: 12
            Addends: [1, 2, 3, 4, 5, 6, 7, 8, 9, ]
            Addends to Target sum: [3, 9] */

        int[] finalAddends = new int[2];
            f = nums[0]; // fixed index
            c = nums[0]; // changing index
            int lastNum = nums[nums.length-1];
        while (f + c != target) {
            if (c == lastNum) {
                f++;
            }
            c++;
        }
        finalAddends[0] = f;
        finalAddends[1] = c;
        return finalAddends;
    }


} // end of main class