package _8;

/*
 *DayDayStudyDayDayUp!
 *@Author:Eboli
 *@date: 2022/4/10
 *Description:
 *Version:V
 */
public class Solution0_1 {
    public int myAtoi(String s) {
        if (s == null) return 0;
        int n = s.length();
        if (n == 0) return 0;
        int i = 0;
        while (s.charAt(i) == ' ') {  //把指针移动到前面空格的后一位
            // 仅包含空格
            if (++i == n) return 0;
        }
        int sign = 1;
        if (s.charAt(i) == '-') sign = -1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') ++i;
        int res = 0, flag = Integer.MAX_VALUE / 10;
        for (; i < n; ++i) {
            // 非数字，跳出循环体
            if (s.charAt(i) < '0' || s.charAt(i) > '9') break;//我这里的逻辑有问题，出现+或者-后，录入数字之前，出现任何非数字字符就可以退出
            // 溢出判断
            if (res > flag || (res == flag && s.charAt(i) > '7')) return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (s.charAt(i) - '0');
        }
        return sign * res;
    }
}
