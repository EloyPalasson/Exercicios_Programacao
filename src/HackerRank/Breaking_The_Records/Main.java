package HackerRank.Breaking_The_Records;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        System.out.println(breakingRecords(scores));

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        int lowest = scores.get(0);
        int lowestRecord = 0;
        int highest = scores.get(0);
        int highestRecord = 0;

        for (int i = 0; i < scores.size(); i++) {
                if (scores.get(i) < lowest){
                    lowest = scores.get(i);
                    lowestRecord++;
                }

                if (scores.get(i) > highest){
                    highest = scores.get(i);
                    highestRecord++;
                }
        }

        List<Integer> records = new ArrayList<Integer>();
        records.add(highestRecord);
        records.add(lowestRecord);
        return records;
    }
}
