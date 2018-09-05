package 反转字符串;
//编写一个函数，其作用是将输入的字符串反转过来。
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
