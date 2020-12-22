package String.number001;

import static String.number001.Constans.OUT_OF_BOUDS;

/**
 * Created By Arshak on Dec, 2020
 */
public class StringAPI {

    //Number 1

    String getCharAtIndex(String input, int k) {
        if (input == null || input.isEmpty()) {
            return OUT_OF_BOUDS;
        }
        if (k < 0 || k > input.length()) {
            return OUT_OF_BOUDS;
        }
        return String.valueOf(input.charAt(k));
    }

    //Number 2
    String wordsCount(String input) {
        if (input == null || input.isEmpty()) {
            return OUT_OF_BOUDS;
        }

        char[] chars = input.toCharArray();
        int x = 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                x = x + 1;

            }

        }
        return String.valueOf(x);

    }

    //Number 3

    String palindrome(String input) {
        String lowerCase = input.toLowerCase();
        StringBuilder builder = new StringBuilder(lowerCase);
        builder.reverse();
        String result = builder.toString();
        if (result.equals(lowerCase)) {
            return "Word is Palindrome";
        } else return "Is not Palindrome";


    }

    //Number 4

    String brackets(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                count++;
            } else if (input.charAt(i) == '(') {
                count--;
            } else {
                return "Invalid Case";
            }
        }
        if (count == 0) {
            return "Brackets are match";
        } else return "Brackets don't match";
    }

    // Number 5

    String contains(String origin, String specified) {
        String lowerCaseOrigin = origin.toLowerCase();
        String lowerCaseSpecified = specified.toLowerCase();
        if (lowerCaseOrigin.contains(lowerCaseSpecified)) {
            return "Contains";
        } else return "Not Contains";
    }

    // Number 6

    String startsWith(String one, String two) {
        String lowerCase001 = one.toLowerCase();
        String lowerCase002 = two.toLowerCase();
        char[] first = lowerCase001.toCharArray();
        char[] second = lowerCase002.toCharArray();
        for (int i = 0; i < second.length; i++) {
            if (first[0] == second[i]) {
                return "Origin String starts with the contents of another";
            } else return "Not stars";

        }
        return "Not valid";
    }

    // Number 7
    String endsWith(String inputOne, String inputTwo) {
        String lowerCaseInputOne = inputOne.toLowerCase();
        String lowerCaseInputTwo = inputTwo.toLowerCase();
        char[] firstInput = lowerCaseInputOne.toCharArray();
        char[] secondInput = lowerCaseInputTwo.toCharArray();
        for (int i = 0; i < secondInput.length; i++) {
            if (firstInput[firstInput.length - 1] == secondInput[i]) {
                return "Origin String ends with the contents of another";
            } else return "Not ends";

        }
        return "Not valid";
    }

    //Number 8

    String removingDuplicates(String input) {
        char[] arrayNew = input.toCharArray();
        String noDublicates = "";
        for (char value : arrayNew) {
            if (noDublicates.indexOf(value) == -1) {
                noDublicates += value;
            }
        }
        return noDublicates;
    }


}

