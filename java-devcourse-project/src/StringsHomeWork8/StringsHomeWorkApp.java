package StringsHomeWork8;

public class StringsHomeWorkApp {
    public static void main(String[] args) {
        String str = "Happy new year, guYs!";
        char ch = 'y';
        System.out.println("String : '" + str + "' contains " + findSymbolOccurance(str, ch) + " chars '" + ch + "'");
        System.out.println("===================");
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println("===================");
        stringReverse("Hello");
        System.out.println("===================");
        System.out.print(isPalindrome("abba"));


    }

    static int findSymbolOccurance(String str, char ch) {
        int counter = 0;
        char[] charArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch) {
                counter++;
            }
        }
        return counter;
    }

    static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    static String stringReverse(String str) {
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        System.out.println("Original String : " + str + " . Reversed str : " + reversedStr);
        return reversedStr.toString();
    }

    static boolean isPalindrome(String str) {
        String reversedString = stringReverse(str);
        return str.equals(reversedString);
    }
}
