package 反转字符串中的单词III;
//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
class Solution {
    public String reverseWords(String s) {
    String words[] = s.split(" ");
    StringBuilder res=new StringBuilder();
    for (String word: words)
        res.append(new StringBuffer(word).reverse().toString() + " ");
    return res.toString().trim();
}
}