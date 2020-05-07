package Controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCsvCustomer {
    public ArrayList<Customer> readCsvCustomer() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Customer.csv"));
        ArrayList<Customer> customers = new ArrayList<>();
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] splitData = line.split(",");
            Customer custom = new Customer(splitData[0], splitData[1], splitData[2], splitData[3], splitData[4],
                    splitData[5], splitData[6], splitData[7]);
            customers.add(custom);
        }
        customers.sort(new NameBirthdayComparator());
        return customers;
    }
}
