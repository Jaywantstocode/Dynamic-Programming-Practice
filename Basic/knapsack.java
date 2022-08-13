package Basic;

public class knapsack {

    public static void main(String[] args) {
        System.out.println(solve(6));
    }

    static int solve(int n) {
        // base case
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;

        return solve(n - 1) + solve(n - 3) + solve(n - 5);
    }

    // initialize to -1
    public static int[] dp = new int[100];

    // this function returns the number of
    // arrangements to form 'n'
    static int solve_improved(int n) {
        // base case
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;

        // checking if already calculated
        if (dp[n] != -1)
            return dp[n];

        // storing the result and returning
        return dp[n] = solve(n - 1) + solve(n - 3) + solve(n - 5);
    }

    // This code is contributed by Dharanendra L V.

}