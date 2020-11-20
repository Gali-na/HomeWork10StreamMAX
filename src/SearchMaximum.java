import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class SearchMaximum {
    public static int searchMaximumInFile(String file) {
        String dataFtomFile = "";
        try (BufferedReader fileRead = new BufferedReader(new FileReader(file))) {
            while (fileRead.read() != -1) {
                dataFtomFile = dataFtomFile + fileRead.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String rezultString= dataFtomFile.replaceAll("[^0-9 ]","");
        String [] arryStringNumber= rezultString.split(" ");

        return IntStream.range(0,arryStringNumber.length)
                .map(i->Integer.valueOf(arryStringNumber[i]))
                .max()
                .getAsInt();
    }
}
