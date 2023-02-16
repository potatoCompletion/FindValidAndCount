import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
    }

    private List<List<String>> readCSV() throws IOException {
        List<List<String>> csvList = new ArrayList<>();
        File csv = new File("D:\\myProject\\FindValidAndCount\\comments.csv");
        BufferedReader br = null;
        String line = "";

        br = new BufferedReader(new FileReader(csv));
        while((line = br.readLine()) != null) {
            List<String> aLine;
            String[] lineArr = line.split(",");
            aLine = Arrays.asList(lineArr);
            csvList.add(aLine);
            System.out.println(aLine);
        }

        br.close();

        return csvList;
    }
}