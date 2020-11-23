package test20201122;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//819. 最常见的单词      https://leetcode-cn.com/problems/most-common-word/
/*给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。
题目保证至少有一个词不在禁用列表中，而且答案唯一。
禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。*/
public class TestDemo03 {
    public String mostCommonWord(String paragraph, String[] banned) {
        //把禁用单词列表放进去集合里面
        Set<String> set = new HashSet<>();
        for (String str : banned) {
            set.add(str);
        }
        HashMap<String,Integer> hashMap = new HashMap<>();
        //段落最后可能没有"." 所以首先加上
        paragraph += ".";
        //返回值
        String ans = "";
        //最高次数
        int count = 0;

        StringBuilder sb = new StringBuilder();
        for (char c : paragraph.toCharArray()){
            if (Character.isLetter(c)) {//如果是字母就添加，说明sb永远不会添加标点符号
                sb.append(Character.toLowerCase(c));//由于禁用列表的单词都是小写的。但是段落可能有大写的所以要把所以的字母全部都转一下小写
            } else if (sb.length() > 0){//如果遇见了标点符号并且sb是一个单词(这里的
                //此时的sb就是一个单词了 要把它转为string
                String word = sb.toString();
                if (!set.contains(word)) {//此时这个单词不在禁用列表当中
                    hashMap.put(word,hashMap.getOrDefault(word,0) + 1);//如果有的话就原始的value上加1，没有就默认值0加1.
                    //此时我们应该要把value记录起来，因为我们要的是最多的，但是循环每次都会改变。所以我们要把这个string和value定义在for循环的外面
                    if (hashMap.get(word) > count) {
                        count = hashMap.get(word);
                        ans = word;
                    }
                }
                sb = new StringBuilder();//把sb重置
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
