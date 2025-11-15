package com.meybise.dayone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestContiguousSequence {

	public static int[] findLongestContiguousSequence(Object[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        // Use a HashSet to store integers and remove duplicates
        Set<Integer> set = new HashSet<>();
        for (Object element : arr) {
            if (element instanceof Integer) {
                set.add((Integer) element);
            }
        }

        if (set.isEmpty()) {
            return new int[0];
        }

        // Convert set to array and sort it
        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index++] = num;
        }
        Arrays.sort(uniqueArr);

        // Find the longest contiguous sequence
        int longestStart = 0;
        int longestLength = 1;
        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < uniqueArr.length; i++) {
            if (uniqueArr[i] == uniqueArr[i - 1] + 1) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestStart = currentStart;
                    longestLength = currentLength;
                }
                currentStart = i;
                currentLength = 1;
            }
        }

        // Final check at the end of the loop
        if (currentLength > longestLength) {
            longestStart = currentStart;
            longestLength = currentLength;
        }

        // Prepare the result array
        int[] longestSeq = new int[longestLength];
        for (int i = 0; i < longestLength; i++) {
            longestSeq[i] = uniqueArr[longestStart + i];
        }

        return longestSeq;
    }

    public static void main(String[] args) {
        Object[] arr = {1, 'a', 9, 3, 10, 4, 'b', 20, 2, -1, -2, -3};
        int[] longestSeq = findLongestContiguousSequence(arr);
        System.out.println("Longest contiguous sequence: " + Arrays.toString(longestSeq));
    }
}
