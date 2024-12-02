package Lesson6;

import java.util.Arrays;

public class ArrayCopyRealizationHomeWork {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayCopy()));
    }

    static int[] arrayCopy(){
        int[] source = {1,2,3,4};
        int[] secondSource = {5,6,7};
        int[] target = new int[source.length+secondSource.length];
        for (int i = 0; i < secondSource.length; i++) {
            target[i] = secondSource[i];
        }
        for (int i = 0; i < source.length; i++) {
            target[secondSource.length + i] = source[i];
        }
        return target;
    }
}
