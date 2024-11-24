import java.util.Arrays;

public class ArraysHomeWork {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 0, 1, 1, 1, 0, 0};
        int[][] doubleArray = {
                {4, 93, 9, 11, 38},
                {22, 79, 199, 77, 30},
                {4, 43, 13, 98, 27},
                {4, 5, 9, 20, 60},
                {10, 33, 77, 63, 69},
        };

        change0to1AndViceVersa(array);

        print100Numbers();

        printChangedArray();

        replaceMainDiagonalElementsTo1(doubleArray);

        replaceMainAndAdditionalDiagonalElementsTo1(doubleArray);

        System.out.println(Arrays.toString(initArrayWithSpecifiedLength(5, 100)));
        System.out.println("------------------------------------");

        findMaxMinElementInArray();

        findBalance();

    }

    static void change0to1AndViceVersa(int array[]) {
        int[] newArray = new int[array.length];
        System.out.print("New changed array = ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1: 0;
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    static void print100Numbers() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
            System.out.print(array[i] + 1 + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    static void printChangedArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                newArray[i] = array[i] * 2;
            } else {
                newArray[i] = array[i];
            }
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    static void replaceMainDiagonalElementsTo1(int[][] array) {
        int[][] newArray = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    newArray[i][j] = 1;
                }
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }

    static void replaceMainAndAdditionalDiagonalElementsTo1(int[][] array) {
        int[][] newArray = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    newArray[i][j] = 1;
                }
                for (int k = 0; k < array.length; k++) {
                    for (int l = array[i].length - 1; l >= 0; l--) {
                        if (l - k == 2 || k - l == 2 || l - k == array.length - 1 || k - l == array.length - 1) {
                            newArray[k][l] = 1;
                        }
                    }
                }
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }

    static int[] initArrayWithSpecifiedLength(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    static void findMaxMinElementInArray() {
        int[] array = {4, 5, 3, 17, 11, 4, 12, 3, 19, 8, 9, 1};
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min :" + min);
        System.out.println("------------------------------------");
    }

    static void findBalance() {
        int[] array = {1, 1, 10, 1, 2, 2};
        int sum = 0;
        int sumOfLeftSide = 0;
        int sumOfRightSide = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int sumOfEachSideOfArray = sum / 2;
        for (int i = 0; i < array.length; i++) {
            sumOfLeftSide += array[i];
            if (sumOfLeftSide == sumOfEachSideOfArray) {
                index = i;
                break;
            }
        }
        for (int i = index+1; i < array.length; i++) {
            sumOfRightSide += array[i];
        }
        System.out.println("index " + index);
        System.out.println("sumOfLeftSide " + sumOfLeftSide);
        System.out.println("sumOfRightSide " + sumOfRightSide);
        if (sumOfLeftSide == sumOfRightSide) {
            System.out.print("TRUE");
        } else System.out.print("FALSE");
    }
}
