package trappingRainWater;

import java.util.Arrays;

import static java.lang.Math.abs;

public class water {
    static int fillCount = 0;

    public static void main(String[] args) {
        water water = new water();
//        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] arr = {2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2};
        int[] arr1 = water.getNewArray(arr);
        water.checking(arr1);
        System.out.println(fillCount);
    }

    private int[] getNewArray(int[] a) {
        int n = a.length;
        int ind = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                ind = i;
                break;
            }
        }
        int[] b = new int[n - ind];
        System.arraycopy(a, ind, b, 0, n - ind);
        return b;
    }

    private void checking(int[] arr) {
        int firstMaxIndex = getMaxIndex(arr, 0);
        checkMaxIndex(firstMaxIndex, arr, 0);
        int secondMaxIndex = getMaxIndex(arr, firstMaxIndex);
        checkMaxIndex(secondMaxIndex, arr, firstMaxIndex);
        int thirdMaxIndex = getMaxIndex(arr, secondMaxIndex);
        if (thirdMaxIndex == 0) {
            thirdMaxIndex = secondMaxIndex;
            minArray(thirdMaxIndex, arr);

        }
    }

    private void minArray(int thirdMaxIndex, int[] arr) {
        int[] sub = new int[arr.length - thirdMaxIndex];
        System.arraycopy(arr, thirdMaxIndex, sub, 0, arr.length - thirdMaxIndex);
        Arrays.sort(sub);
        int secondMin = sub[sub.length - 2];
        for (int i = thirdMaxIndex + 1; i < arr.length - 1; i++) {
            int jay = abs(secondMin - arr[i]);
            fillCount += jay;
        }

    }

    private void checkMaxIndex(int firstMaxIndex, int[] arr, int i) {
        for (int j = i + 1; j < firstMaxIndex; j++) {
            if (arr[j] != 0 && (arr[j] < arr[i])) {
                fillCount += arr[i] - arr[j];
            } else if (arr[j] == 0) {
                fillCount += abs(arr[i] - arr[j]);
            }
        }
    }

    private int getMaxIndex(int[] arr, int element) {
        int firstMaxIndex = 0;
        for (int j = element; j < arr.length; j++) {
            if (arr[j] > arr[element]) {
                firstMaxIndex = j;
                break;
            }
        }
        return firstMaxIndex;
    }
}