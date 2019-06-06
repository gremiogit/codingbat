package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }

//    ***************************************************************************************************
//                            CODINGBAT CHALLENGES (https://codingbat.com/java)
//                          **STRINGBUFFER AND STRINGBUILDER APIs will not be used for Strings**
//    ***************************************************************************************************

//    Challenge without2

//    Given a string, if a length 2 substring appears at both its beginning and end,
//    return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
//    The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
//
//
//    without2("HelloHe") → "lloHe"
//    without2("HelloHi") → "HelloHi"
//    without2("Hi") → ""

    public static String without2(String str) {
        if (str.length() >= 2) {
            String front = str.substring(0, 2);
            String back = str.substring(str.length() - 2, str.length());

            if (front.equals(back)) {
                return str.substring(2, str.length());
            } else {
                return str;
            }
        } else {
            return str;
        }
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge deFront


//    Given a string, return a version without the first 2 chars.
//    Except keep the first char if it is 'a' and keep the second char if it is 'b'.
//    The string may be any length. Harder than it looks.
//
//
//    deFront("Hello") → "llo"
//    deFront("java") → "va"
//    deFront("away") → "aay"

    public static String deFront(String str) {
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        } else if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
            return 'a' + str.substring(2, str.length());
        } else if (str.charAt(0) != 'a' && str.charAt(1) == 'b') {
            return 'b' + str.substring(2, str.length());
        } else {
            return str.substring(2, str.length());
        }
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge startWord


//    Given a string and a second "word" string,
//    we'll say that the word matches the string if it appears at the front of the string,
//    except its first char does not need to match exactly. On a match, return the front of the string,
//    or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi"
//    and "xip" returns "hip". The word will be at least length 1.


//    startWord("hippo", "hi") → "hi"
//    startWord("hippo", "xip") → "hip"
//    startWord("hippo", "i") → "h"

    public String startWord(String str, String word) {
        if (str.isEmpty()) {
            return "";
        } else if (word.length() == 1) {
            return String.valueOf(str.charAt(0));
        } else if (str.substring(1, str.length()).startsWith(word.substring(1, word.length()))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge frontTimes

//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
//    or whatever is there if the string is less than length 3.
//    Return n copies of the front
//
//
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"

    public String frontTimes(String str, int n) {

        String front = "";
        String result = "";
        if (str.length() <= 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge make2

//    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
//    the elements from a followed by the elements from b. The arrays may be any length, including 0,
//    but there will be 2 or more elements available between the 2 arrays.
//
//
//    make2([4, 5], [1, 2, 3]) → [4, 5]
//    make2([4], [1, 2, 3]) → [4, 1]
//    make2([], [1, 2]) → [1, 2]

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (b.length == 0) {
            result[0] = a[0];
            result[1] = a[1];
        } else if (a.length == 0) {
            result[0] = b[0];
            result[1] = b[1];
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else {
            result[0] = a[0];
            result[1] = a[1];
        }
        return result;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge front11


//    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
//    If either array is length 0, ignore that array.
//
//
//    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
//    front11([1], [2]) → [1, 2]
//    front11([1, 7], []) → [1]

    public int[] front11(int[] a, int[] b) {
        int[] resultA = new int[0];
        int[] resultB = new int[1];
        int[] resultC = new int[2];

        if (a.length == 0 && b.length == 0) {
            return resultA;
        } else if (a.length >= 1 && b.length == 0) {
            resultB[0] = a[0];
            return resultB;
        } else if (a.length == 0) {
            resultB[0] = b[0];
            return resultB;
        } else {
            resultC[0] = a[0];
            resultC[1] = b[0];
            return resultC;
        }
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge countEvens


//    Return the number of even ints in the given array.
//    Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//
//
//    countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0

    public int countEvens(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge bigDiff


//    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
//    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
//
//
//    bigDiff([10, 3, 5, 6]) → 7
//    bigDiff([7, 2, 10, 9]) → 8
//    bigDiff([2, 10, 7, 2]) → 8

    public int bigDiff(int[] nums) {
        int large = 0;
        int small = nums[0];

        for (int num : nums) {
            large = Math.max(large, num);
            small = Math.min(small, num);
        }
        return large - small;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge mapBully


//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
//    and set the key "a" to have the value "". Basically "b" is a bully,
//    taking the value and replacing it with the empty string.


//    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
//    mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
//    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge mapShare


//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
//    In all cases remove the key "c", leaving the rest of the map unchanged.
//
//
//    mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
//    mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
//    mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("c")) {
            map.remove("c");
        }
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge mapAB


//    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
//    If both keys are present, append their 2 string values together and store the result under the key "ab".
//
//
//    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//    mapAB({"a": "Hi"}) → {"a": "Hi"}
//    mapAB({"b": "There"}) → {"b": "There"}

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a").concat(map.get("b")));
        }
        return map;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge topping1


//    Given a map of food keys and topping values, modify and return the map as follows:
//    if the key "ice cream" is present, set its value to "cherry".
//    In all cases, set the key "bread" to have the value "butter".
//
//
//    topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
//    topping1({}) → {"bread": "butter"}
//    topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge topping2


//    Given a map of food keys and their topping values, modify and return the map as follows:
//            if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
//    If the key "spinach" has a value, change that value to "nuts".
//
//
//    topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
//    topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
//    topping2({"yogurt": "salt"}) → {"yogurt": "salt"}

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge teaParty


//    We are having a party with amounts of tea and candy.
//    Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
//    A party is good (1) if both tea and candy are at least 5.
//    However, if either tea or candy is at least double the amount of the other one, the party is great (2).
//    However, in all cases, if either tea or candy is less than 5, the party is always bad (0).


//    teaParty(6, 8) → 1
//    teaParty(3, 8) → 0
//    teaParty(20, 6) → 2

    public int teaParty(int tea, int candy) {
        if(tea < 5 || candy < 5){
            return 0;
        }else if(tea >= candy * 2 || candy >= tea * 2){
            return 2;
        }else{
            return 1;
        }
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge fizzString


//    Given a string str, if the string starts with "f" return "Fizz".
//    If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
//    In all other cases, return the string unchanged. (See also: FizzBuzz Code)


//    fizzString("fig") → "Fizz"
//    fizzString("dib") → "Buzz"
//    fizzString("fib") → "FizzBuzz"

    public String fizzString(String str) {
        boolean f = str.startsWith("f");
        boolean b = str.endsWith("b");

        if(f && b){
            return "FizzBuzz";
        }else if(f){
            return "Fizz";
        }else if(b){
            return "Buzz";
        }else{
            return str;
        }
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge fizzString2


//    Given an int n, return the string form of the number followed by "!".
//    So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number,
//    and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
//    Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
//    What will the remainder be when one number divides evenly into another?

//    fizzString2(1) → "1!"
//    fizzString2(2) → "2!"
//    fizzString2(3) → "Fizz!"

    public String fizzString2(int n) {
        if(n % 5 == 0 && n % 3 == 0){
            return "FizzBuzz!";
        }else if(n % 5 == 0){
            return "Buzz!";
        }else if(n % 3 == 0){
            return "Fizz!";
        }else{
            return Integer.toString(n) + "!";
        }
    }


//    ***************************************************************************************************
//    ***************************************************************************************************

//    Challenge lessBy10


//    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
//
//
//    lessBy10(1, 7, 11) → true
//    lessBy10(1, 7, 10) → false
//    lessBy10(11, 1, 7) → true
//

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }

}