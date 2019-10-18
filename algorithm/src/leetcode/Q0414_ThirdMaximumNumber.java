package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer fir = null, sec = null, thi = null;
        for (int i = 0; i < nums.length; i++) {
            if (fir == null) {
                fir = nums[i];
            } else {
                if (nums[i] > fir) {
                    thi = sec;
                    sec = fir;
                    fir = nums[i];
                } else if (nums[i] == fir) {
                    continue;
                } else {
                    if (sec == null) {
                        sec = nums[i];
                    } else {
                        if (nums[i] > sec) {
                            thi = sec;
                            sec = nums[i];
                        } else if (nums[i] == sec) {
                            continue;
                        } else {
                            if (thi == null) {
                                thi = nums[i];
                            }
                            if (nums[i] > thi) {
                                thi = nums[i];
                            }
                        }
                    }
                }
            }

        }
        return thi == null ? fir : thi;
    }
}
