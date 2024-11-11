public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumInRange(5, 16));
        isPositiveOrNegative(1);
        System.out.println(isPositiveOrNegativeBoolean(5));
        printStrNTimes("str", 5);
        System.out.println(isLeapYear(100));
    }

    static void printThreeWords(String firstWord, String secondWord, String thirdWord) {
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
    }

    static void checkSumSign() {
        int a, b;
        a = 5;
        b = -10;
        int sum = a + b;
        if (a + b >= 0) {
            System.out.println("The sum of " + a + " and " + b + " = " + sum + " and it is positive");
        } else {
            System.out.println("The sum of " + a + " and " + b + " = " + sum + " and it is negative");
        }
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("RED");
        } else if (value > 0 && value <= 100) {
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN");
        }
    }

    static void compareNumbers() {
        int a, b;
        a = 15;
        b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void isPositiveOrNegative(int a) {
        if (a < 0) {
            System.out.println(a + " is negative");
        } else {
            System.out.println(a + " is positive");
        }
    }

    static boolean isPositiveOrNegativeBoolean(int b) {
        if (b < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void printStrNTimes(String str, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(str);
        }
    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}