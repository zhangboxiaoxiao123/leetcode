package ת����Сд��ĸ;
//ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str���������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����
class Solution {
    public String toLowerCase(String str) {
        if(str == null) return "null";
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			int a =str.charAt(i);
			if(a>=65&&a<=90)
				a=a+32;
			char n=(char) a;
			str=str.replace(x, n);
		}
		return str;
    }
}