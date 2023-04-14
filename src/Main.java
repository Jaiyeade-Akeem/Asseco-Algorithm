import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,3,3,7};
        System.out.println(solution2(1041));
        System.out.println(solution1(arr));

    }

    public static int solution1(int[] A){
        String out = "";
        for (int num : A){
            out += num;
        }
        for (int i = 0; i< out.length(); i++){
            if (out.indexOf(out.charAt(i)) == out.lastIndexOf(out.charAt(i))){
                return Integer.parseInt(String.valueOf(out.charAt(i)));
            }
        }
        return 0;
    }
    public static int solution2(int N){
        String binNumber = Integer.toBinaryString(N);
        List<String> listOfBinaryNumbers = List.of(binNumber.split("1"));
        List<Integer> st = new ArrayList<>();
        int num = 0;
        for (String s : listOfBinaryNumbers){
            st.add(s.trim().length());
        }
        for (int d : st){
            if (d > num){
                num = d;
            }
        }
        return num;

    }
//    public static int solution3(int[] arr){
//        List<Integer> output = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i]%2 != 0){
//                output.add()
//            }
//        }
//
//    }

}