package com.app;

public class Solution {

    public int solution(int N) {
        // write your code in Java SE 8
        int mask = 1;
        int count = 0;
        int maxCount = 0; // 100010010
        boolean oneHit = false; // 10001001001011100100
        while (mask != 0) {
            int res = (N & mask);
            if (res == 0) {
                if (oneHit) {
                    count++;
                }
            } else {
                oneHit = true;
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
            mask = (mask << 1);
        }
        return maxCount;
    }
}
