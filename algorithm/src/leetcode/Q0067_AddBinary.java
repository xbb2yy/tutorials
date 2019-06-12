package leetcode;

import java.math.BigInteger;

@Pass
public class Q0067_AddBinary {

    public String addBinary(String a, String b) {
        return (new BigInteger(a, 2)).add(new BigInteger(b, 2)).toString(2);
    }
}
