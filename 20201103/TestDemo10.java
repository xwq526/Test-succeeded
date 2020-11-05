package test20201103;
//CM17 猫狗收容所  牛客      https://www.nowcoder.com/practice/6235a76b1e404f748f7c820583125c50?tpId=8&&tqId=11010&rp=3&ru=/activity/oj&qru=/ta/cracking-the-coding-interview/question-ranking




import java.util.*;

/*public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {//已经通过
        // write code here
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < ope.length; i++) {
            //分为2种情况
            switch (ope[i][0]) {
                case 1://只有一种情况
                    input.add(ope[i][1]);
                    break;
                case 2://有三种情况
                    if (ope[i][1] == 0) {//第二个元素若为0则出最先入栈的那个数，这里判空不判空都没有报错
                        output.add(input.get(0));
                        input.remove(0);
                    }else if (ope[i][1] == 1) {//为1则出最先入栈的正数
                        for (int j = 0; j < input.size(); j++) {
                            if (input.get(j) > 0) {
                                output.add(input.get(j));
                                input.remove(j);
                                break;
                            }
                        }
                    }else if (ope[i][1] == -1){//为-1则出最先入栈的负数
                        for (int j = 0; j < input.size(); j++) {
                            if (input.get(j) < 0) {
                                output.add(input.get(j));
                                input.remove(j);
                                break;
                            }
                        }
                    }
            }
        }
        return output;
    }
}*/









public class TestDemo10 {
}
