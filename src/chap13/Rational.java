package chap13;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        if (denominator == 0)
            throw new ArithmeticException("The denominator cannot be 0!");
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    public Rational add(Rational r) {
        long newN = numerator * r.getDenominator() + denominator * r.getNumerator();
        long newD = denominator * r.getDenominator();
        return new Rational(newN, newD);
    }

    public Rational subtract(Rational r) {
        long newN = numerator * r.getDenominator() - denominator * r.getNumerator();
        long newD = denominator * r.getDenominator();
        return new Rational(newN, newD);
    }

    public Rational multiply(Rational r) {
        long newN = numerator * r.getNumerator();
        long newD = denominator * r.getDenominator();
        return new Rational(newN, newD);
    }

    public Rational divide(Rational r) {
        if (r.getNumerator() == 0)
            throw new ArithmeticException("The divider cannot be zero!");
        long newN = numerator * r.getDenominator();
        long newD = denominator * r.getNumerator();
        return new Rational(newN, newD);
    }

    @Override
    public int compareTo(Rational o) {
        return Double.compare(doubleValue(), o.doubleValue());
    }

    @Override
    public String toString() {
        if (numerator == 0)
            return 0 + "";
        else if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    private static long gcd(long n, long d) {
        n = Math.abs(n);
        d = Math.abs(d);
        long gcd = 1;
        for (int i = 1; i <= Math.min(n, d); ++i) {
            if (n % i == 0 && d % i == 0)
                gcd = i;
        }

        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }
}
