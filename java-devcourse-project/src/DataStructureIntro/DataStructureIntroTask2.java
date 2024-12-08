package DataStructureIntro;

import java.util.Arrays;

public class DataStructureIntroTask2 {
    public static void main(String[] args) {
        int size = 5;
        var queue = queueInit(size);
        System.out.println(Arrays.toString(queue));
        addToEnd(queue, 10);
        System.out.println("Retrieved value from queue is " + retrieveFromQueue(queue));
    }

    static int[] queueInit(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    static void addToEnd(int array[], int valueToAdd) {
        int sizeOfNewArray = array.length + 1;
        int[] newArray = new int[sizeOfNewArray];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = array[i];
        }
        newArray[sizeOfNewArray - 1] = valueToAdd;
        System.out.println(Arrays.toString(newArray));
    }

    static int retrieveFromQueue(int array[]) {
        int valueToRetrieve = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return valueToRetrieve;
    }

}
