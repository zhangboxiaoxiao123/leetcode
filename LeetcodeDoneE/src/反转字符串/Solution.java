package ��ת�ַ���;
//��дһ���������������ǽ�������ַ�����ת������
class Solution {
    public String reverseString(String s) {
         if(s==null) {
	    	return null;
	    }
	    int len=s.length();
		char[] ch=new char[len];
		int i,j;
		for(i=0,j=len-1;i<len;i++,j--) {
			ch[i]=s.charAt(j);
		}
		String str=new String(ch);
		return str;
    }
}
