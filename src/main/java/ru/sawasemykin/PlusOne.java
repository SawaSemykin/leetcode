package ru.sawasemykin;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean allDigitsAre9 = true;
        for (int i = 0; i < digits.length && allDigitsAre9; i++)
            if (digits[i] != 9)
                allDigitsAre9 = false;
        if (allDigitsAre9) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        int i;
        for (i = digits.length - 1; digits[i] + 1 == 10; i--)
            digits[i] = 0;
        digits[i] += 1;
        return digits;
    }
}
