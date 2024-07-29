package HackerRank.Between_Two_Sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(6);

        List<Integer> b = new ArrayList<>();
        b.add(24);
        b.add(36);

        System.out.println(getTotalX(a,b));

    }

    public static int getTotalX(List<Integer> a, List<Integer> b){

        Collections.sort(a);
        Collections.sort(b);

        int star = a.get(a.size() - 1);
        int end = b.get(0);

        int qtd = 0;

        for (int i = star; i <= end; i++) {
            boolean interacao1 = false;
            boolean interacao2 = false;

            for (int n : a){
                if (i % n == 0){
                    interacao1 = true;
                } else {
                    interacao1 = false;
                    break;
                }
            }

            if (interacao1);
            for (int n : b){
                if (n % i == 0){
                    interacao2 = true;
                } else {
                    interacao2 = false;
                    break;
                }
            }

            if (interacao1 && interacao2) qtd ++;
        }

        return qtd;
    }
}
