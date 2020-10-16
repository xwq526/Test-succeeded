package Test20201015;
//手写Arrays.toString（）方法
public class TestDemo01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = null;
        int[] c = {};
        System.out.println(myToString(a));
        System.out.println(myToString(b));
        System.out.println(myToString(c));
    }
//    public  static void myToString(int [] a){
//        for (int i = 0; i <a.length ; i++) {
//           if (i==0){
//               System.out.print("["+a[i]+",");
//           } else if (i==(a.length-1)){
//                System.out.print(a[i]+"]");
//           }else {
//               System.out.print(a[i]+",");
//           }
//        }
//    }
    public  static String myToString(int [] a){
        if(a==null){//NullPointerException
            return "";
        }
        if(a.length==0){//ArithmeticException
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < a.length; i++) {
            str+=a[i];
            if (i!=a.length-1){
                str+=",";
            }
        }
        String ret = str+"]";
        return ret;
    }

}
