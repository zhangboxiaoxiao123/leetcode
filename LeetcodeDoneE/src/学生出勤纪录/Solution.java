package ѧ�����ڼ�¼;
//����һ���ַ���������һ��ѧ���ĳ��ڼ�¼�������¼���������������ַ���
//
//'A' : Absent��ȱ��
//'L' : Late���ٵ�
//'P' : Present������
//���һ��ѧ���ĳ��ڼ�¼�в�����һ��'A'(ȱ��)���Ҳ���������������'L'(�ٵ�),��ô���ѧ���ᱻ���͡�
//
//����Ҫ�������ѧ���ĳ��ڼ�¼�ж����Ƿ�ᱻ���͡�
class Solution {
    public boolean checkRecord(String s) {
    	int timeA=0,timeL=0;
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='L') 
			{
				if(timeL<2) timeL++;
				else 
					return false;
			}
			else if(s.charAt(i)=='A')
			{
				timeL=0;
				if(timeA==0) timeA++;
				else return false;
			}
			else {
				timeL=0;
			}
		}
        return true;
    }
}