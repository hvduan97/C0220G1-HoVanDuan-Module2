package com.codegym.cms.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
//    @Pattern(regexp = "^(([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/(0[1-9]|[1-9]|1[0-2])\\/[0-9]{4})$",message = "Có dạng: DD/MM/YYYY")
    @Pattern(regexp = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)",message = "Định dạng: dd/mm/yy")
    private String dayBeginContract;
    @NotEmpty
//    @Pattern(regexp = "^(([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/(0[1-9]|[1-9]|1[0-2])\\/[0-9]{4})$",message = "Có dạng: DD/MM/YYYY")
    @Pattern(regexp = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)",message = "Định dạng: dd/mm/yy")
    private String dayEndContract;
//    @NotEmpty
    @Min(value = 1,message = "Giá trị phải lớn hơn 0")
    private Long deposits;
//    @NotEmpty
    @Min(value = 1,message = "Giá trị phải lớn hơn 0")
    private Long sum;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToMany(targetEntity = ContractDetail.class)
    private List<ContractDetail> contractDetails;

    public Contract() {
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDayBeginContract() {
        return dayBeginContract;
    }

    public void setDayBeginContract(String dayBeginContract) {
        this.dayBeginContract = dayBeginContract;
    }

    public String getDayEndContract() {
        return dayEndContract;
    }

    public void setDayEndContract(String dayEndContract) {
        this.dayEndContract = dayEndContract;
    }

    public Long getDeposits() {
        return deposits;
    }

    public void setDeposits(Long deposits) {
        this.deposits = deposits;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
