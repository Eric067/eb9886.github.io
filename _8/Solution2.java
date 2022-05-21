package _8;

import java.util.ArrayList;
import java.util.List;

/*
 *DayDayStudyDayDayUp!
 *@Author:Eboli
 *@date: 2022/4/10
 *Description:
 *Version:V
 */
public class Solution2 {
    public int myAtoi(String s) {
        s = s.trim();
        List<Character> list = new ArrayList<>();
        //三种状态-1为默认，1为正，0为负
        int symbol = -1;
        boolean getnum = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (list.size()>10) break;
            if ( getnum&&(ch < '0' || ch > '9') ) break;//开始录入数字字符后出现飞数字字符，停止
            if (!getnum&&!Character.isDigit(ch) && ch != '+' && ch !='-') return 0;//数字前有非正负号字符
            if (!getnum&&symbol != -1 &&(ch == '+' || ch =='-'))return 0;// 数字前正负号字符出现两次（相同或不同）
            if (!getnum &&symbol == -1) {
                if (ch == '-') symbol = 0;
                if (ch == '+') symbol =  1;
            }
            //第一次遇到1-9开始采集数字,如果已经开始，就不再判断
            if (!getnum && ch >= '0' && ch <= '9') getnum = true;
            if (getnum && ch >= '0' && ch <= '9') {
                if (list.size()==1&&list.get(0) =='0')list.set(0,ch);
                else list.add(ch);
            }

        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }
        if (symbol == 0) list.add(0, '-');
        if (str.length() == 0) return 0;
        long temp = 0L;
        System.out.println(temp);
        if (symbol != 0) {
            temp = Long.valueOf(str);
          temp = temp <= Integer.MAX_VALUE ? temp : Integer.MAX_VALUE;
        } else{
            temp= Long.valueOf("-" + str);
            temp = temp >= Integer.MIN_VALUE ? temp : Integer.MIN_VALUE;
        }
        return (int)temp;
    }
}
