package 转换成小写字母;
//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
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