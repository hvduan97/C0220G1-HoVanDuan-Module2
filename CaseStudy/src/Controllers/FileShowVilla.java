package Controllers;

import Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileShowVilla {
    private static final String COMMA_DELIMITER = ","; // Split by comma

    public static void showMain(List<Villa> villas) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Villa.csv"));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                printContry(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printContry(List<String> villas) {
        System.out.println(
                "Villa [ Ten dich vu= "
                        + villas.get(0)
                        + ", Dien tich su dung= " + villas.get(1)
                        + " , Chi phi thue= " + villas.get(2)
                        + " , So nguoi toi da= " + villas.get(3)
                        + " , Kieu thue= " + villas.get(4)
                        + " , id= " + villas.get(5)
                        + " , Tieu chuan phong= " + villas.get(6)
                        + " , Mo ta tien nghi khac= " + villas.get(7)
                        + " , Dien tich ho boi= " + villas.get(8)
                        + " , So tang= " + villas.get(9)
                        + "]");
    }
}
