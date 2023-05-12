import java.io.File;
import java.util.Arrays;

import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        File iris = new File("Iris.csv");
        try {

            if (iris.exists()) {
                System.out.println("file exist......");

            } else {
                System.out.println("file not exist........");
                if (iris.createNewFile()) {
                    System.out.println("file created........");

                } else {
                    System.out.println("file creation error........");
                }
            }
        } catch (Exception e) {
            // TO DO: handle exception
            System.out.println("Error..." + e);
        }

        try {
            Scanner scanfile = new Scanner(iris);

            String[] alldata = new String[1024];
            int y = 0;
            while (scanfile.hasNextLine()) {
                alldata[y] = scanfile.nextLine();// store all data in single variable
                y = y + 1;
            }
            int c = 1;
            for (int i = 1; i < alldata.length - 1; i++) {
                if (alldata[i] != null) {
                    c = c + 1; // split data and store in array
                }

            }
            String[][] raw = new String[c][6];

            for (int i = 0; i < raw.length; i++) {
                if (alldata[i] != null) {
                    raw[i] = alldata[i].split(","); // split data and store in array
                }

            }
            opration(raw);
            // callin g function

        } catch (Exception e) {
            // TO DO: handle exception
            System.out.println("Error..." + e);
        }
    }

    static void opration(String[][] data) {
        String[][] min = new String[6][2];
        String[][] max = new String[6][2];
        String[][] mean = new String[6][2];
        String[][] median = new String[6][2];
        String[][] sumof = new String[6][2];
        String[][] mode = new String[6][2];

        sumof[0][0] = min[0][0] = max[0][0] = mean[0][0] = data[0][0];
        sumof[1][0] = min[1][0] = max[1][0] = mean[1][0] = data[0][1];
        sumof[2][0] = min[2][0] = max[2][0] = mean[2][0] = data[0][2];
        sumof[3][0] = min[3][0] = max[3][0] = mean[3][0] = data[0][3];
        sumof[4][0] = min[4][0] = max[4][0] = mean[4][0] = data[0][4];
        sumof[5][0] = min[5][0] = max[5][0] = mean[5][0] = data[0][5];
        System.out.println("Summary\t\t"+"Mean\t"+"Median\t"+"Mode\t"+"Min\t"+"Max\t");
        for (int i = 1; i < (max.length - 1); i++) {
            sumof[i][1] = "0";
            max[i][1] = String.valueOf(data[1][1]);
            min[i][1] = String.valueOf(data[1][1]);
            median[i][1] = Median(data, i);
            mean[i][1]= Mean(data, i);
            mode[i][1]= mode(data, i);
            if (i >= 1) {
                for (int j = 1; j < (data.length - 1); j++) {
                    Double a = Double.parseDouble(sumof[i][1]) + Double.parseDouble(data[j][i]);
                    max[i][1] = max(Double.parseDouble(data[j][i]), Double.parseDouble(max[i][1]));
                    min[i][1] = min(Double.parseDouble(data[j][i]), Double.parseDouble(min[i][1]));

                    sumof[i][1] = Double.toString(a);
                }
            }
            System.out.print(sumof[i][0] + "\t");
            
            System.out.print(String.format("%.4f", Double.parseDouble(mean[i][1])) + "\t");
            System.out.print(String.format("%.4f", Double.parseDouble(median[i][1])) + "\t");
            System.out.print(String.format("%.4f", Double.parseDouble(mode[i][1])) + "\t");
            System.out.print(String.format("%.4f", Double.parseDouble(min[i][1])) + "\t");
            System.out.println(String.format("%.4f", Double.parseDouble(max[i][1])) + "\t");
        }
        
    }

    static String max(double data, double x) {
        double temp = data;
        if (temp > x) {
            x = temp;
        }
        String a = String.valueOf(x);
        return a;
    }

    static String min(double data, double x) {
        double temp = data;
        if (temp < x) {
            x = temp;
        }
        String a = String.valueOf(x);
        return a;
    }

    static String Median(String[][] data, int i) {
        float[] nd = new float[data.length - 1];
        for (int x = 1; x < data.length; x++) {
            nd[x - 1] = Float.parseFloat(data[x][i]);
        }
        Arrays.sort(nd);
        float md;
        if (nd.length % 2 == 0) {
            md = (nd[(nd.length + 1) / 2]);
        } else {
            md = (nd[nd.length / 2] + nd[(nd.length / 2) + 1]) / 2;
        }

        String a = String.valueOf(md);
        return a;
    }

    static String Mean(String[][] data, int i) {
        float[] nd = new float[data.length - 1];
        for (int x = 1; x < data.length; x++) {
            nd[x - 1] = Float.parseFloat(data[x][i]);
        }
        
        float md = 0;
        for (int x = 0; x < nd.length; x++) {
            md = md + nd[x];
        }
        md = md / nd.length;
        String a = String.valueOf(md);
        
        return a;
    }

    public static String mode(String[][] data,int a) {
        float[] arr = new float[data.length - 1];
        for (int x = 1; x < data.length; x++) {
            arr[x - 1] = Float.parseFloat(data[x][a]);
        }
        int maxCount = 0, count = 0;
        Float value, mode = 0.0f;
    
        for (int i = 0; i < arr.length; i++) {
    
            value = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (value == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                mode = value;
                count = maxCount;
            }
        }
        String b = String.valueOf(mode);
        
        return b;
    }
}
