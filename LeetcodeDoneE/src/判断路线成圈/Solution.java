package 判断路线成圈;
//初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断这个机器人的移动路线是否形成一个圆圈，换言之就是判断它是否会移回到原来的位置。
//
//移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。机器人有效的动作有 R（右），L（左），U（上）和 D（下）。输出应为 true 或 false，表示机器人移动路线是否成圈。
class Solution {
    public boolean judgeCircle(String moves) {
    boolean bool=true;
		int result_x = 0;
		int result_y = 0;
		for(int i=0;i<moves.length();i++)
		{
			switch (moves.charAt(i)) {
			case 'R':
				result_x=result_x+1;
				break;
			case 'L':
				result_x=result_x-1;
				break;
			case 'U':
				result_y=result_y+1;
				break;
			case 'D':
				result_y=result_y-1;
				break;
			default:
				break;
			}
		}
		if(result_x!=0||result_y!=0)
			bool=false;
		return bool;    
    }
}
