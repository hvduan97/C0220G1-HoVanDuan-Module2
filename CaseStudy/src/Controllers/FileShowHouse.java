package Controllers;

import Models.House;
import Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileShowHouse {
    private static final String COMMA_DELIMITER = ","; // Split by comma

    public static void showMain(List<House> houses) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\CodegymMD2\\CaseStudy\\src\\Data\\House.csv"));

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

    private static void printContry(List<String> houses) {
        System.out.println(
                "House [ Ten dich vu= "
                        + houses.get(0)
                        + ", Dien tich su dung= " + houses.get(1)
                        + " , Chi phi thue= " + houses.get(2)
                        + " , So nguoi toi da= " + houses.get(3)
                        + " , Kieu thue= " + houses.get(4)
                        + " , id= " + houses.get(5)
                        + " , Tieu chuan phong= " + houses.get(6)
                        + " , Mo ta tien nghi khac= " + houses.get(7)
                        + " , So tang= " + houses.get(8)
                        + "]");
    }
}
