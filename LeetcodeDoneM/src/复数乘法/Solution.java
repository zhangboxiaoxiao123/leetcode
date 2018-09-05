package 复数乘法;
//给定两个表示复数的字符串。
//
//返回表示它们乘积的字符串。注意，根据定义 i^2 = -1 。
class Solution {
    public String complexNumberMultiply(String a, String b) {
        int aIndex=a.indexOf("+");
        int bIndex=b.indexOf("+");
        String aFront=a.substring(0, aIndex);
        System.out.println(aFront);
        String bFront=b.substring(0, bIndex);
        String aAfter=a.substring(aIndex+1,a.length()-1);
        String bAfter=b.substring(bIndex+1,b.length()-1);
        int af=Integer.parseInt(aFront);
        int bf=Integer.parseInt(bFront);
        int at=Integer.parseInt(aAfter);
        int bt=Integer.parseInt(bAfter);
        System.out.println("af:"+af+" bf:"+bf+" bt:"+bt+" at:"+at);
        int resultY=af*bt+bf*at;
        int resultX=af*bf-at*bt;
        String xString=Integer.toString(resultX);
        String yString=Integer.toString(resultY);
        String result = xString+"+"+yString+"i";
        System.out.println(result);
        return result;
    }
}