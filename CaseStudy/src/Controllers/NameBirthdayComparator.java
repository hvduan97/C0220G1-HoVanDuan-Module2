package Controllers;

import java.util.Comparator;

public class NameBirthdayComparator implements Comparator<Customer> {
    public int compare(Customer ct1, Customer ct2) {
        String[] nameCustomer1 = ct1.getNameCustomer().split(" ");
        String[] nameCustomer2 = ct2.getNameCustomer().split(" ");
        if (!nameCustomer1[nameCustomer1.length - 1].equals(nameCustomer2[nameCustomer2.length - 1])) {
            return nameCustomer1[nameCustomer1.length - 1].compareTo(nameCustomer2[nameCustomer2.length - 1]);
        } else if (!ct1.getNameCustomer().equals(ct2.getNameCustomer())) {
            return ct1.getNameCustomer().compareTo(ct2.getNameCustomer());
        } else {
            String[] birthdayCustomer1 = ct1.getBirthDay().split("/");
            String[] birthdayCustomer2 = ct2.getBirthDay().split("/");
            int monthCustomer1 = Integer.parseInt(birthdayCustomer1[1]);
            int yearCustomer1 = Integer.parseInt(birthdayCustomer1[2]);
            int monthCustomer2 = Integer.parseInt(birthdayCustomer2[1]);
            int yearCustomer2 = Integer.parseInt(birthdayCustomer2[2]);
            if (yearCustomer1 != yearCustomer2) {
                return birthdayCustomer1[2].compareTo(birthdayCustomer2[2]);
            } else {
                if (monthCustomer1 != monthCustomer2) {
                    return birthdayCustomer1[1].compareTo(birthdayCustomer2[1]);
                } else {
                    return birthdayCustomer1[0].compareTo(birthdayCustomer2[0]);
                }
            }
        }
    }
}
