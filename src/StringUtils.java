import java.util.ArrayList;

public class StringUtils {
    private static int TOTAL_ASCII_CHARS_NUMBER=256;
    public static ArrayList<String> merge(String[] words1, String[] words2) {
        ArrayList<String> res = new ArrayList<>();
        for(String word: words1) res.add(word);
        for(String word: words2) res.add(word);

        return res;
    }

    public static boolean isUnique(String str) {
        boolean[] allChars = new boolean[TOTAL_ASCII_CHARS_NUMBER];
        for(int i=0 ; i < TOTAL_ASCII_CHARS_NUMBER ;i++) allChars[i] = false;
        char[] chars = str.toCharArray();

        for(char c: chars) {
            int charVal = (int) c;
            if(allChars[charVal]) return false;
            allChars[charVal] = true;
        }

        return true;
    }


}
