package Controllers;

import Models.Room;
import Models.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileWriteRoom {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeCsvFile(String fileName, List<Room> abc) {
        Scanner scanner1=new Scanner(System.in);
        String nameService=MainController.inputNameService();
        String typeRent=MainController.inputTypeRent();
        String id=inputID();
        System.out.print("nhap dich vu mien phi: ");
        String freeService=scanner1.nextLine();
        double areaUsed=MainController.inputAreaUsed();
        double rentalFee=MainController.inputRentalFee();
        int maxPeople=MainController.inputMaxPeople();

        Room room=new Room(nameService, areaUsed, rentalFee, maxPeople, typeRent, id, freeService);

        abc.add(room);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName,true);

            for (Room country : abc) {
                fileWriter.append(nameService);
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(String.valueOf(areaUsed));
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(String.valueOf(rentalFee));
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(String.valueOf(maxPeople));
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(typeRent);
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(id);
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(freeService);
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static String inputID() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String id;
        do {
            System.out.print("Nhap vao id: ");
            id = scanner.nextLine();
            String regex="^(SVRO)-[0-9]{4}$";
            boolean matcher= Pattern.matches(regex,id);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Format ROOM: SVRO-(4 so bat ki). Vui long nhap lai.");
            }
        } while (flag);
        return id;
    }
}
