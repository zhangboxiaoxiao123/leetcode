package �ж�·�߳�Ȧ;
//��ʼλ�� (0, 0) ����һ�������ˡ���������һϵ�ж������ж���������˵��ƶ�·���Ƿ��γ�һ��ԲȦ������֮�����ж����Ƿ���ƻص�ԭ����λ�á�
//
//�ƶ�˳����һ���ַ�����ʾ��ÿһ������������һ���ַ�����ʾ�ġ���������Ч�Ķ����� R���ң���L���󣩣�U���ϣ��� D���£������ӦΪ true �� false����ʾ�������ƶ�·���Ƿ��Ȧ��
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
