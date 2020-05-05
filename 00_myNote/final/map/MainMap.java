package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    
    public static void main(String[] args) {
        Map<String, Integer> map = creatMapformFile("map/SampleScore.txt");
        // name, score
        display(map);
    }

    public static Map<String, Integer> creatMapformFile(String file){
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String line;
        String[] inline;

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            while ((line = in.readLine()) != null) {
                inline = line.trim().split(" ");
                // boolean isnew = true;

                if (inline.length == 2){
                    // for (Map.Entry entry: map.entrySet()){

                    //     int score = (int) entry.getValue();
                    //     String name = (String) entry.getKey();
                        
                    //     if (name.equalsIgnoreCase(inline[1].trim())){
                    //         isnew = false;
                    //         if (score < Integer.parseInt(inline[0].trim())){
                    //             map.remove(name);
                    //             isnew = true;
                    //         }
                    //     }   
                    // }
                    // if (isnew)
                    // map.put(inline[1].trim(), Integer.parseInt(inline[0].trim()));

                    int newScore = Integer.parseInt(inline[0].trim()) ;
                    String newName = inline[1].trim();

                    if (map.containsKey(newName)){
                        map.replace(newName, Math.max(newScore, map.get(newName)));
                    } else {
                        map.put(newName, newScore);
                    }
                }
            }   
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return map;
    }

    public static void display(Map<String, Integer> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getValue()+" got "+entry.getKey());
        }
    }
}