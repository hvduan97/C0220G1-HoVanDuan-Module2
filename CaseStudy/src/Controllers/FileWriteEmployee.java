package Controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileWriteEmployee {
    // Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    // CSV file header
    private static final String FILE_HEADER = "Name, Age, Address";



    public static void writeCsvFile() {
        // Create new Countrys objects
        Employee employee1=new Employee("Nguyen Van A","30","Da Nang");
        Employee employee2=new Employee("Nguyen Van B","30","Da Nang");
        Employee employee3=new Employee("Nguyen Van C","30","Da Nang");
        Employee employee4=new Employee("Nguyen Van D","30","Da Nang");
        Employee employee5=new Employee("Nguyen Van E","30","Da Nang");
        Employee employee6=new Employee("Nguyen Van F","30","Da Nang");
        Employee employee7=new Employee("Nguyen Van G","30","Da Nang");
        Employee employee8=new Employee("Nguyen Van H","30","Da Nang");
        Employee employee9=new Employee("Nguyen Van I","30","Da Nang");
        Employee employee10=new Employee("Nguyen Van K","30","Da Nang");

        // Create a new list of Country objects
        List<Employee> employees=new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Emloyee.csv",true);

            for (Employee country : employees) {
                fileWriter.append(country.getNameEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getAgeEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getAddressEmployee());
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
}
