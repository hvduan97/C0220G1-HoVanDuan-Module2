package Controllers;

import Models.Room;
import Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileShowRoom {
    private static final String COMMA_DELIMITER = ","; // Split by comma

    public static void showMain(List<Room> rooms) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Room.csv"));

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

    private static void printContry(List<String> rooms) {
        System.out.println(
                "Room [ Ten dich vu= "
                        + rooms.get(0)
                        + ", Dien tich su dung= " + rooms.get(1)
                        + " , Chi phi thue= " + rooms.get(2)
                        + " , So nguoi toi da= " + rooms.get(3)
                        + " , Kieu thue= " + rooms.get(4)
                        + " , id= " + rooms.get(5)
                        + " , Dich vu mien phi= " + rooms.get(6)
                        + "]");
    }
}