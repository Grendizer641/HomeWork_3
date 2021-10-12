package HomeWork_3;

public class HomeWork_3 {

    public static void main(String[] args) {

//        createArrayReplacement();
//        createArrayFill();
//        createArrayMulti();
//        createSquareDiagonal();
//        createArray(5,33);
//        findMaxMin();
        int[] numbs = {0, 7, 3, 1, 5, 2, 9, 1};
//        sumLeftRight(numbs);
        moveArrayElem(numbs, -2);

    }

    public static void createArrayReplacement() {

        int[] binaries = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < binaries.length; i++) {
            if (binaries[i] == 1) {
                binaries[i] = 0;
            } else {
                binaries[i] = 1;
            }
        }

    }

    public static void createArrayFill() {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
    }

    public static void createArrayMulti() {

        int[] numbs = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] < 6) {
                numbs[i] = numbs[i] * 2;
            }
        }

    }

    public static void createSquareDiagonal() {

        int[][] square = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            for (int j = i; j == i; j++) {
                square[i][j] = 1;
            }
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = square.length - 1 - i; j == square.length - 1 - i; j++) {
                square[i][j] = 1;
            }
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {

        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void findMaxMin() {

        int[] numbs = {6, 5, 6, 3, 8, 9, 4,};
        int min = numbs[0];
        int max = numbs[0];
        for (int i = 0; i < numbs.length; i++) {
            if (min > numbs[i]) {
                min = numbs[i];
            }
            if (max < numbs[i]) {
                max = numbs[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }

    public static boolean sumLeftRight(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < array.length; i++) {
            sumLeft = sumLeft + array[i];
            for (int j = array.length - 1; j > i; j--) {
                sumRight = sumRight + array[j];
            }
            if (sumLeft == sumRight) {
                return true;
            }
            sumRight = 0;
        }
        return false;
    }

    public static void moveArrayElem(int[] array, int n) {

        while (n > 0) {
            int numb = array[array.length - 1];
            for (int i = array.length - 1; i >= 0; i--) {
                if (i == 0) {
                    array[i] = numb;
                } else {
                    array[i] = array[i - 1];
                }
            }
            n--;
        }
        while (n < 0) {
            int numb = array[0];
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    array[i] = numb;
                } else {
                    array[i] = array[i + 1];
                }
            }
            n++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
