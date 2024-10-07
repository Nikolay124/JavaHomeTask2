import java.io.IOException;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

    public class CreateCSV {
        public static void main(String[] args) throws IOException {
            String[] headers = {"Name", "Age", "City"};
            String[][] data = {
                    {"John", "30", "New York"},
                    {"Alice", "25", "Los Angeles"},
                    {"Bob", "35", "Chicago"}
            };

            List<String> csvRows = new ArrayList<>();
            csvRows.add(String.join(",", headers));

            for (String[] rowData : data) {
                csvRows.add(String.join(",", rowData));
            }

            String csvContent = csvRows.stream().collect(Collectors.joining("\n"));
            Files.writeString(Paths.get("output.csv"), csvContent);
        }
    }