package ru.sawasemykin;

public class AddBinary {
    /**
     *
     * @param a
     * @param b
     * @return sum of a and b as a binary string
     */
    // todo использовать что '1' следует за '0'. Например, (char) (1 + '0') = 1 или (char) (0 + '0') = 0
    // todo использовать StringBuilder
    public String addBinary(String a, String b) {
        int cmp = Integer.compare(a.length(), b.length());
        if (cmp < 0) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        for (int i = y.length - 1; i > -1; i--) {
            x = addBinary(x, i  + x.length - y.length, y[i]);
        }

        return String.valueOf(x);
    }

    private char[] addBinary(char[] x, int i, char v) {
        if (i < 0 && v == '1') {
            char[] xx = new char[x.length + 1];
            xx[0] = '1';
            for (int j = 0; j < x.length; j++)
                xx[j + 1] = x[j];
            return xx;
        }
        if (i < 0)
            return x;

        int a = Character.getNumericValue(x[i]);
        int b = Character.getNumericValue(v);
        if (a + b < 2) {
            x[i] = Character.forDigit(a + b, 10);
            return x;
        }

        x[i] = '0';
        return addBinary(x, i - 1, '1');
    }
}
