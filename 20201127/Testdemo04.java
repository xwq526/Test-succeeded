package test20201127;
import java.util.*;
public class Testdemo04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] strArr = str.split(" ");
            int[] array = new int[4];
            for(int i = 0; i < 4; i++) {
                array[i] = Integer.parseInt(strArr[i]);
            }
            //此时拿到了4个数
            if (array[0] + array[1] != array[2] -array[3]){
                System.out.println("NO");
            }else {
                int a = (array[0] + array[2])/2;
                int b1 = (array[1] + array[3])/2;
                int c1 = array[3]-b1;
                System.out.printf("%s %s %s",a,b1,c1);
            }
           /* int a = (array[0] + array[2])/2;
            int b1 = a -array[0];
            int b2 = array[1] + array[3]/2;
            int c1 = b1 - array[1];
            int c2 = array[3] - b1;
            if(b1 != b2 || c1 != c2 ) {
                System.out.println("No");
            }else {
                System.out.printf("%s %s %s",a,b1,c1);

            }*/

        }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            String[] strArray = str.split(" ");
            int[] array = new int[strArray.length];
            for(int i = 0; i < strArray.length;i++){
                array[i] = Integer.parseInt(strArray[i]);
            }
            int count = 1;
            int ans = array[0];
            for (int i = 1; i < array.length; i++) {
                if (ans == array[i]){
                    count++;
                }else {
                    count--;
                    if (count == 0) {  //若count为0，更换候选人
                        ans = array[i];
                        count++;
                    }
                }
            }
            System.out.println(ans);
        }


    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            String[] strArray = str.split(" ");
            int[] array = new int[strArray.length];
            for(int i = 0; i < strArray.length;i++){
                array[i] = Integer.parseInt(strArray[i]);
            }
            //此时array放好了。
            Arrays.sort(array);
            System.out.println(array[array.length/2]-1);
        }
    }
}
