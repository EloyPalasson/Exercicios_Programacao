package HackerRank.Divisible_Sum_Pairs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);

        int n = 6;
        int k = 3;

        System.out.println(divisibleSumPairs(n, k, ar));

    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar){

        int total = 0;
        for (int i = 0; i <= (ar.size() - 1); i++) {
            for (int j = 0; j < i; j++) {

            }
            int sum = ar.get(i) + ar.get(i + 1);

            if (sum % k == 0){
                total++;
            }
        }

        return 0;
    }
}
