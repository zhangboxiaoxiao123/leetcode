package 找不同;
//给定两个字符串 s 和 t，它们只包含小写字母。
//
//字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
//
//请找出在 t 中被添加的字母。
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
