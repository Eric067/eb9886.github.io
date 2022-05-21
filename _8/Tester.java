package _8;


import sun.security.ssl.SSLContextImpl;

/*
 *DayDayStudyDayDayUp!
 *@Author:Eboli
 *@date: 2022/4/9
 *Description:
 *Version:V
 */
public class Tester {
    //main方法，程序入口
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
//        Solution0 s = new Solution0();
        Solution0_1 s = new Solution0_1();


//        Solution2 s = new Solution2();
        System.out.println(s.myAtoi("words and 987"));
        System.out.println(s.myAtoi("+-123-"));
    }
}
