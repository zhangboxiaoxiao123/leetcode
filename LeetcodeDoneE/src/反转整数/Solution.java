package 反转整数;
//给定一个 32 位有符号整数，将整数中的数字进行反转。
class Solution {
    public int reverse(int n) {
        int res = 0;
        while(n != 0){
            int val = n % 10;
            int tmp = res;
            res = tmp * 10 + val;
            n = n / 10;
            if(res / 10 != tmp) return 0;
        }
        return res;
    }
}
