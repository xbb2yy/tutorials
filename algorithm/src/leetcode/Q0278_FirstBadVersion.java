package leetcode;

public class Q0278_FirstBadVersion {

    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                if (mid == 1) return 1;
                if (!isBadVersion(mid - 1)) {
                    return mid;
                } else {
                    hi = mid;
                }
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    private boolean isBadVersion(int n) {
        return false;
    }
}
