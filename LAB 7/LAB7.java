import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LAB7 {
    public static void main(String[] args) {
        String csvFile = "Iris.csv";
        String line;
        String cvsSplitBy = ",";

        List<List<String>> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(cvsSplitBy);
                data.add(Arrays.asList(attributes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Perform calculations for overall summary statistics

        // Calculate mean, median, mode, min, max for each attribute (column)
        // Store the results in variables or data structures of your choice

        // Perform calculations for summary statistics by species

        // Calculate mean, median, mode, min, max for each attribute (column) for each species
        // Store the results in variables or data structures of your choice

        // Write the results to a file (e.g., results.txt)
        try (FileWriter writer = new FileWriter("results.txt")) {
            // Write the results to the file using appropriate formatting
            writer.write("Summary statistics for the attributes:\n");
            writer.write("Mean: ...\n");
            writer.write("Median: ...\n");
            writer.write("Mode: ...\n");
            writer.write("Min: ...\n");
            writer.write("Max: ...\n");

            writer.write("\nSummary statistics by species:\n");
            writer.write("Species: Iris-setosa\n");
            writer.write("Mean: ...\n");
            writer.write("Median: ...\n");
            writer.write("Mode: ...\n");
            writer.write("Min: ...\n");
            writer.write("Max: ...\n");

            // Repeat the above block for Iris-versicolor and Iris-virginica

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
