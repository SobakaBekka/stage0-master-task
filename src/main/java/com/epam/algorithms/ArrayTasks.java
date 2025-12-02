package com.epam.algorithms;

public class ArrayTasks {

    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    public int[] generateNumbers(int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result[index++] = arr[i];
            }
        }
        return result;
    }

    public int[][] sortRaggedArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int[] inner = arr[i];
            for (int j = 0; j < inner.length - 1; j++) {
                for (int k = 0; k < inner.length - 1 - j; k++) {
                    if (inner[k] > inner[k + 1]) {
                        int tmp = inner[k];
                        inner[k] = inner[k + 1];
                        inner[k + 1] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length > arr[j + 1].length) {
                    int[] tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }
}
