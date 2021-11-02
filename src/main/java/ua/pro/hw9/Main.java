package ua.pro.hw9;


import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int sum = 7;
        String text = "lol ok an kek o";
        CalculateWords(text);

        MethodOne(arr, n, sum);
        MethodTwo methodTwo = new MethodTwo();
        System.out.println(methodTwo.findAllPairs( arr, sum));



    }

    private static void CalculateWords(String text) {
        String[] arr=text.split(" ");
        Map<Integer,Integer> lengthMap=new HashMap<>();
        for(String i:arr){
            Integer val=lengthMap.get(i.length());
            if(val==null){
                val=0;
            }
            lengthMap.put(i.length(),val+1);
        }
        for(Map.Entry<Integer,Integer> i:lengthMap.entrySet()){
            System.out.println("Количество Стрингов длиной "+i.getKey()+" их штук "+i.getValue());
        }
    }

    static void MethodOne(int[] arr,
                          int n, int sum) {

        HashMap<Integer, Integer> mp = new HashMap<>();


        for (int i = 0; i < n; i++) {


            int rem = sum - arr[i];
            if (mp.containsKey(rem)) {
                int count = mp.get(rem);

                for (int j = 0; j < count; j++)
                    System.out.print("(" + rem +
                            ", " + arr[i] +
                            ")" + "\n");
            }
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
    }


}
