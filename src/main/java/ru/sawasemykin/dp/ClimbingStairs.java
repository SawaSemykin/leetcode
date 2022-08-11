package ru.sawasemykin.dp;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] waysCounts = new int[n + 1];
        waysCounts[0] = 1;
        for (int i = 1; i <= n; i++) {
            waysCounts[i] = waysCounts[i - 1];
            if (i - 2 >= 0)
                waysCounts[i] += waysCounts[i - 2];
        }
        return waysCounts[n];
    }
}
