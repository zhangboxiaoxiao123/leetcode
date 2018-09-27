package Ñî»ÔÈı½Ç;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		result.add(list);
		if (numRows == 1)
			return result;
		list = new ArrayList<>();
		list.add(1);
		list.add(1);
		result.add(list);
		if (numRows == 2)
			return result;
		List<Integer> templist = list;
		System.out.println(list);
		for (int i = 3; i < numRows + 1; i++) {
			list = new ArrayList<>();
			list.add(1);
			for (int index = 1; index < i - 1; index++) {
				list.add(templist.get(index - 1) + templist.get(index));
			}
			list.add(1);
			result.add(list);
			templist = list;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().generate(5));
	}
}