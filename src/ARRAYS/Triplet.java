package ARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Triplet {
    public static List<List<Integer>> threeSum(int nums[]) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer> ();

                        triplet.add(nums[i]);

                        triplet.add(nums[j]);

                        triplet.add(nums [k]);

                        Collections.sort(triplet);

                        result.add(triplet);
                    }

                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(result));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0,-2,  1, 2, -1, -4}));
    }
}