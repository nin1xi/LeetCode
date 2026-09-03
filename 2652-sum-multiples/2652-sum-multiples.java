    class Solution {
    public int sumOfMultiples(int n) {
        return sumDivisibleBy(n, 3)
             + sumDivisibleBy(n, 5)
             + sumDivisibleBy(n, 7)
             - sumDivisibleBy(n, 15)
             - sumDivisibleBy(n, 21)
             - sumDivisibleBy(n, 35)
             + sumDivisibleBy(n, 105);
    }

    private int sumDivisibleBy(int n, int d) {
        int k = n / d;
        return d * k * (k + 1) / 2;
    }
}