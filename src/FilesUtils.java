import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FilesUtils {
    public static String eliminateDuplications(String file) {
        Map<String,Boolean> map = new HashMap<>();
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null ) {
                line = line.trim();
                Boolean exists = map.get(line) == null ? false: true;
                if(!exists) {
                    map.put(line, true);
                    stringBuilder.append(line);
                    stringBuilder.append("\n") ;
                }
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
