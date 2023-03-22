package Arrays;

import java.util.Scanner;
import java.lang.Math;

public class NextPermutation {
    static Scanner input = new Scanner(System.in);
    static int[] numArray;

    static void printArray(int[] array) {
        for (int x : array) {
            System.out.print(x);
        }
    }

    static void swap(int index1, int index2) {
        int temp = numArray[index1];
        numArray[index1] = numArray[index2];
        numArray[index2] = temp;

    }

    static void findNextPermutation() {
        int index = 0;
        int index2 = 0;
        for (int i = numArray.length - 1; i > 0; i--) {
            if (numArray[i] > numArray[i - 1]) {
                index = i;
                break;
            }
        }
        if (index != 0) {
            int num = index + 1;
            for (int i = num; i < numArray.length; i++) {
                if (numArray[i] > numArray[index - 1] &&  numArray[i] <=numArray[index] ) {
                    index2 = i;
                }

            }

            swap((index - 1), index2);


        }
        int mid = (int) Math.ceil((index + numArray.length) / 2);
        int j = numArray.length - 1;
        for (int i = index; i < mid; i++) {
            int temp = numArray[i];
            numArray[i] = numArray[j];
            numArray[j] = temp;
            j--;
        }
        printArray(numArray);

    }

    public static void main(String[] args) {

        System.out.println("Enter size of array");
        int size = input.nextInt();
        numArray = new int[size];

        System.out.println("Enter elements");
        for (int i = 0; i < size; i++) {
            numArray[i] = input.nextInt();
        }

        findNextPermutation();
    }
}
