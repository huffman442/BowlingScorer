import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int bowlingScore(String frames) {
        List<String> framesAsList = ingestFrames(frames);
        return framesAsList.size();
    }

    private static List<String> ingestFrames(String s) {
        List<String> result = Arrays.asList(s.split(" "));
        return result;
    }

    private static int calcStrikes() {
        return 0;
    }

    private static int calcSpares() {
        return 0;
    }
}