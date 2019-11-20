package com.meganpaffrath;

/**
 * You're given strings:
 *     J representing the types of stones that are jewels,
 *     S representing the stones you have.
 *
 * Each character in S is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 *     Input: J = "aA", S = "aAAbbbb"
 *     Output: 3
 * Example 2:
 *     Input: J = "z", S = "ZZ"
 *     Output: 0
 * Note:
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */

public class Prob771_JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int count = 0;

        for (int stonePos = 0; stonePos < S.length(); stonePos++) {
            for (int jewelPos = 0; jewelPos < J.length(); jewelPos++) {
                if (J.charAt(jewelPos) == S.charAt(stonePos)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

/**
 * public class Main {
 *
 *     public static void main(String[] args) {
 *         Prob771_JewelsAndStones problemJS = new Prob771_JewelsAndStones();
 *
 *         int retVal1 = problemJS.numJewelsInStones("z", "ZZz");
 *         System.out.println(retVal1);
 *
 *         int retVal2 = problemJS.numJewelsInStones("zAc", "ZZaaAz");
 *         System.out.println(retVal2);
 *     }
 * }
 *
 * --------------------------------------
 *
 * Output:
 * 1
 * 2
 */