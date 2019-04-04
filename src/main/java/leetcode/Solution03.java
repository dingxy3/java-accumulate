package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ============================
 *
 * @version [版本号, 2019/4/4]
 * @Auther: dingxy
 * @Description:输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * @since [产品/模块版本]
 * =============================
 */
public class Solution03 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcc"));
    }
    public  static  int lengthOfLongestSubstring(String s) {

       int n  = s.length() ;
       //拿到所有的子字符串
       Set<String> set = new HashSet<>();
       for (int i = 0 ; i < n ; i ++){
           for (int j = i+1 ; j <= n ; j++){

                 set.add(s.substring(i ,j)) ;
           }
       }
       // abcc  a ab abc abcc b bc bcc c cc
        //去掉有重复的支付串
        int b= 0 ;
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String a = it.next();
            if (!check(a))
            {
                it.remove();
                continue;
            }

                if (a.length() > b)
                {
                    b = a.length() ;
                }


        }
        //求出set里最长字符串

    return b;
    }

    public static boolean check(String str){
        if(str == null){
            throw new IllegalArgumentException("invalid parameters");
        }
        //如果str的长度是0或者1，那么没有重复字符，返回true
        if(str.length() == 0 || str.length() == 1)
        {
            return true;
        }

        //从前向后遍历字符串，对每个字符，调用String.indexOf()看其后面是否有相同的字符，如果有返回false，否则最后返回true
        for(int i = 0; i < str.length()-1; i++)
        {
            if(str.indexOf(str.charAt(i), i+1) != -1)
            {
                return false;
            }
        }

        return true;
    }
}


