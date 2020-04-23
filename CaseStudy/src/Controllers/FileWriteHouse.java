package Controllers;

import Models.House;
import Models.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileWriteHouse {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static void writeCsvFile(String fileName, List<House> abc) {
        Scanner scanner1=new Scanner(System.in);
        String nameService=MainController.inputNameService();
        String typeRent=MainController.inputTypeRent();
        String id=inputID();
        String standardRoom=MainController.inputStandardRoom();
        String descriptionAmenities=MainController.inputDescriptionAmenities();
        int numberFloor=MainController.inputNumberFloor();
        double areaUsed=MainController.inputAreaUsed();
        double rentalFee=MainController.inputRentalFee();
        int maxPeople=MainController.inputMaxPeople();

        House house=new House(nameService, areaUsed, rentalFee, maxPeople, typeRent, id, standardRoom, descriptionAmenities, numberFloor);

        abc.add(house);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName,true);
            for (House country : abc) {
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
                fileWriter.append(standardRoom);
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(descriptionAmenities);
                fileWriter.append(COMMA_DELIMITER );
                fileWriter.append(String.valueOf(numberFloor));
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
            String regex="^(SVHO)-[0-9]{4}$";
            boolean matcher= Pattern.matches(regex,id);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Format House: SVHO-(4 so bat ki). Vui long nhap lai.");
            }
        } while (flag);
        return id;
    }
}
