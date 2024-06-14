package src.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class NumberOfBeams2125 {

    public int numberOfBeams(String[] bank) {
        int result = 0;
        HashSet<Integer> beamsBankPerLine = new HashSet<>();
        for (String line : bank) {
            //line1 = "1"
            //line2 = "1"

            int beamsLine = 0;
            for (int i = 0; i < line.length(); i++) {
                beamsLine += Character.getNumericValue(line.charAt(i));
            }
            beamsBankPerLine.add(beamsLine);
        }
       List<Integer> listInteger = beamsBankPerLine.stream().toList();
        for (int i = 0 ; i < listInteger.size() - 1 ; i++) {

            result += Math.multiplyExact( listInteger.get(i), listInteger.get(i+1));
        }
        return result;
    }

}
