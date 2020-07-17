package com.bytebasics;

import java.lang.Math;

public class BinaryConverter {

    public String convertBinToDec(String binaryNum) {
        String binNumReversed = new StringBuilder(binaryNum).reverse().toString();
        int answer = 0;
        for(int i = 0; i < binNumReversed.length(); i++) {
            checkIsValidBinaryChar(binNumReversed.charAt(i));
            if(binNumReversed.charAt(i) == '1') {
                answer += Math.pow(2, i);
            }
        }
        return Integer.toString(answer);
    }

    private void checkIsValidBinaryChar(char charToCheck) {
        if(charToCheck != '0' &&  charToCheck != '1') {
            throw new IllegalArgumentException("Your input argument is not a valid binary number it " +
                    "contains the character: " + charToCheck);
        }
    }
}
