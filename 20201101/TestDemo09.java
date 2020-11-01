package test20201101;
/*LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,
他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。*/
import java.util.Arrays;

public class TestDemo09 {
    public boolean isContinuous(int [] numbers) {
        int zero_num = 0;
        int sum = 0;
        int len = numbers.length;
        if (len != 5) {
            return false;
        }
        //这里考虑的是五张牌都合法了，（其实还要判断有没有负数和是不是五张一样的，和是不是大于13了，这样就比较麻烦，以后再优化）
        Arrays.sort(numbers);
        for (int i = 0; i < len-1; i++) {
            if (numbers[i] == 0) {
                zero_num++;
                continue;//这个要注意，0的情况
            }
            if (numbers[i] == numbers[i+1]) {
                return false;
            }
            sum += numbers[i+1] - numbers[i]-1;
        }
        return zero_num >= sum;
    }
}