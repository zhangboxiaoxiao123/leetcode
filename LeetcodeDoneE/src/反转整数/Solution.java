package ��ת����;
//����һ�� 32 λ�з����������������е����ֽ��з�ת��
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
