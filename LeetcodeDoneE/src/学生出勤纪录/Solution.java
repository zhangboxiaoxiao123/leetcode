package 学生出勤纪录;
//给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：
//
//'A' : Absent，缺勤
//'L' : Late，迟到
//'P' : Present，到场
//如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
//
//你需要根据这个学生的出勤纪录判断他是否会被奖赏。
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