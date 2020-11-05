package test20201103;

import java.util.Stack;

//901. 股票价格跨度   力扣    https://leetcode-cn.com/problems/online-stock-span/
//这是单调栈的思想，要了解并且理解。

public class TestDemo04 {
}


class StockSpanner {
    Stack<Integer> prices, weights;

    public StockSpanner() {
        prices = new Stack();
        weights = new Stack();
    }

    public int next(int price) {
        int w = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
           /*  *  其他情况， 首先prices存储股票价格， weights 存储对应的股票价格跨度
             *
             *  prices.peek() <= price 为true, 则当天价格比prices栈顶高。此时需要：
             *     1. prices.pop(); 弹出栈顶价格，即前一天，前2天，直到不满足 prices.peek() <= price
             *
             *     2. w += weights.pop() 即为 w = w + weights.pop()
             *        这里要注意的时，每次weights.pop()即弹出prices.pop()对应的 股票价格跨度。
             *
             *        当prices.peek() <= price 不满足时，prices.peek()这个值肯定是比当前price当，
             *        所以prices.peek() 对应的weights.peek() 不再加在 w上。
             */
            prices.pop();
            w += weights.pop();
        }

         /**  3种情况：
         *  1.  情况1：
         *          prices.isEmpty()为true，是第一天，则prices.push(price);
         *          而且w=1表示算上今天;  weights.push(w);
         *
         *  2.  情况2：
         *          不是第一天，但是prices.peek() <= price 为false,即 当天价格 比 前一天 低，则prices.push(price);
         *          而且w=1表示算上今天;  weights.push(w);
         *
         *  3. 情况3：
         *          比之前prices.peek() 大的 price 入栈， 则 prices.push(price)
         *          w 看while循环中注释*/

        prices.push(price);
        weights.push(w);
        return w;
    }
}
