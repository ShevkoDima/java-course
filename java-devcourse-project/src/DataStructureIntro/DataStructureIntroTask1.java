package DataStructureIntro;

import java.util.Arrays;

public class DataStructureIntroTask1 {
    public static void main(String[] args) {
        int index = 3;
        var array = arrayInit(6);
        System.out.println(Arrays.toString(array));
        AddToArray(array, 6);
        System.out.println("Value by index " + index + " : " + (getValueByIndex(array, index)));
    }

    static int[] arrayInit(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    static void addToArray(int array[], int newValue) {
        int sizeOfNewArray = array.length + 1;
        int[] newArray = new int[sizeOfNewArray];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = array[i];
        }
        newArray[sizeOfNewArray - 1] = newValue;
        System.out.println(Arrays.toString(newArray));
    }

    static int getValueByIndex(int[] array, int index) {
        System.out.println(Arrays.toString(array));
        return array[index];
    }

}
