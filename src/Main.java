package src;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] bank = {
                "1",
                "1"
        };

        Main mainInstance = new Main();
        int result = mainInstance.numberOfBeams(bank);
        System.out.println("Number of beams: " + result);
    }

    public int numberOfBeams(String[] bank) {
        int result = 0;
        List<Integer> beamsBankPerLine = new ArrayList<>();
        for (String line : bank) {
            int beamsLine = 0;
            for (int i = 0; i < line.length(); i++) {
                beamsLine += Character.getNumericValue(line.charAt(i));
            }
            if (beamsLine > 0) {
                beamsBankPerLine.add(beamsLine);
            }
        }
        for (int i = 0; i < beamsBankPerLine.size() - 1; i++) {
            result += Math.multiplyExact(beamsBankPerLine.get(i), beamsBankPerLine.get(i + 1));
        }
        return result;
    }
}

