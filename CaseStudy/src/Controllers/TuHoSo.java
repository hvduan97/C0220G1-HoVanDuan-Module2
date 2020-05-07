package Controllers;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class TuHoSo {
    public String demso(int dem){
        if (dem==1){
            return "001";
        }
        else if (dem==2){
            return "002";
        }
        else if (dem==3){
            return "003";
        }
        else if (dem==4){
            return "004";
        }
        else if (dem==5){
            return "005";
        }
        else if (dem==6){
            return "006";
        }
        else if (dem==7){
            return "007";
        }
        else if (dem==8){
            return "008";
        }
        else if (dem==9){
            return "009";
        }
        else {
            return "010";
        }

    }
    public void readCsvEmployee() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Emloyee.csv"));
        Map<String, Employee> mapEmployee = new TreeMap<>();
        Stack<String> stringStack=new Stack<String>();
        String line;
        int dem=1;

        while ((line = fileReader.readLine()) != null) {
            String[] splitData = line.split(",");
            Employee employee = new Employee(splitData[0], splitData[1], splitData[2]);
            mapEmployee.put(demso(dem),employee);

            dem++;
        }

        for (Map.Entry<String, Employee> entry : mapEmployee.entrySet()) {
            stringStack.push(entry.getKey());
        }
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap ma ho so cua nhan vien muon tim : ");
        String nhap=scanner.nextLine();
        System.out.println("-------------------------------------");
        System.out.print("Ho so nam o vi tri thu: "+stringStack.search(nhap)+" trong Tu Ho So \n"+
                mapEmployee.get(nhap));
        System.out.println("-------------------------------------");
    }
}

