package �Ҳ�ͬ;
//���������ַ��� s �� t������ֻ����Сд��ĸ��
//
//�ַ��� t ���ַ��� s ������ţ�Ȼ�������λ�����һ����ĸ��
//
//���ҳ��� t �б���ӵ���ĸ��
class Solution {
    public char findTheDifference(String s, String t) {
    	int result1=0,result2=0;
        for (int i = 0; i < s.length(); i++) {
			char temp=s.charAt(i);
			result1=result1^temp;
		}
        for (int i = 0; i < t.length(); i++) {
			char temp=t.charAt(i);
			result2=result2^temp;
		}
        char result=(char) (result1^result2);
        return result;
    }
}
