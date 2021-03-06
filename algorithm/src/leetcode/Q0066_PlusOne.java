package leetcode;

import leetcode.common.Pass;

@Pass
public  class Q0066_PlusOne {
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        int carry = 0;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=carry;
            carry = digits[i]/10;
            digits[i] = digits[i]%10;
        }
        if(carry==0){
            return digits;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = carry;
        for(int i=0;i<digits.length;i++){
            newDigits[i+1] = digits[i];
        }
        return newDigits;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        plusOne(a);
    }
}
