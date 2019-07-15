package leftjoin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeftJoin {

    public String[][] leftJoin(HashMap<String, String> synonymMap, HashMap<String, String> antonymMap) {

        String[][] outputArr = new String[synonymMap.size()][3];

        int i = 0;
        for (Map.Entry<String, String> entry : synonymMap.entrySet()) {
            outputArr[i][0] = entry.getKey();
            outputArr[i][1] = entry.getValue();

            if (antonymMap.containsKey(entry.getKey())) {
                outputArr[i][2] = antonymMap.get(entry.getKey());
            } else {
                outputArr[i][2] = "NULL";
            }
            System.out.println(Arrays.toString(outputArr[i]));


            i++;
        }

        return outputArr;
    }
}
