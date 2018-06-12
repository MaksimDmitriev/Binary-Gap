package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void solution_0() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(0));
    }

    @Test
    public void solution_1() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(1));
    }

    @Test
    public void solution_3() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(3));
    }

    @Test
    public void solution_7() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(7));
    }

    @Test
    public void solution_5() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(5));
    }

    @Test
    public void solution_10() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(10));
    }

    @Test
    public void solution_34() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(34));
    }

    @Test
    public void solution_530() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(530));
    }

    @Test
    public void solution_32() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(32));
    }

    @Test
    public void solution_10001001001011100100() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(Integer.parseInt("10001001001011100100", 2)));
    }

    @Test
    public void solution_74901729() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(74901729));
    }

    @Test
    public void solution_1376796946() {
        //
        Solution solution = new Solution();
        assertEquals(5, solution.solution(1376796946));
    }
}