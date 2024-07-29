package HackerRank.Subarray_Division;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> s = new ArrayList<>();
        //s.add(1);
        //s.add(2);
        //s.add(1);
        //s.add(3);
        //s.add(2);

        s.add(4);

        int d = 4;
        int m = 1;

        System.out.println(birthday(s,d,m));    }
    public static int birthday (List<Integer> s, int d, int m) {

        int ans = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum = sum + s.get(i + j);
            }
            if (sum == d){
                ans++;
            }
        }
        return ans;
    }
}
