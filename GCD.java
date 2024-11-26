public class GCD {
	public long getGCD(int one, int two) {
		long gcd = 1;
        for (int i = 2; i <= Math.min(one, two); i++) {
            if (one % i == 0 && two % i == 0) {
                gcd = i;
            }
        }

		return gcd;
	}

    public String toString(int numOne, int numTwo) {
        return "the gcd of " + numOne + " and " + numTwo + " is " + getGCD(numOne, numTwo);
    }
}