package POJOS;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.TreeSet;

import Enums.Gender;

public class Customer implements Serializable{
	 private Integer customerId;
	    private String customerPassword;
	    private String customerUsername;
	    private String customerName;
	    private Gender customerGender;
	    private LocalDate customerDateOfBirth;
	    private Integer customerAge;
	    private String customerMail;
	    private TreeSet<Machine> machines;
	    private String hospital;//**ONLY IF TE CUTSOMER IS A HOSPITAL OR A CLINIQUE

	    public Customer(Integer customerId, String customerPassword, String customerUsername, String customerName, Gender customerGender, LocalDate customerDateOfBirth, Integer customerAge, String customerMail, String hospital) {
	        this.customerId = customerId;
	        this.customerPassword = customerPassword;
	        this.customerUsername = customerUsername;
	        this.customerName = customerName;
	        this.customerGender = customerGender;
	        this.customerDateOfBirth = customerDateOfBirth;
	        this.customerAge = customerAge;
	        this.customerMail = customerMail;
	        this.machines = new TreeSet<>();
	        this.hospital = hospital;
	    }

	    public void addMachine(Machine machine){
	        machines.add(machine);
	    }
	    public void removeMachine(Machine machine) {
	    	machines.remove(machine);
	    }
	    public void setCustomerPassword(String customerPassword) {
	        this.customerPassword = customerPassword;
	    }
	    public void setCustomerUsername(String customerUsername) {
	        this.customerUsername = customerUsername;
	    }
	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }
	    public void setCustomerGender(Gender customerGender) {
	        this.customerGender = customerGender;
	    }
	    public void setCustomerDateOfBirth(LocalDate customerDateOfBirth) {
	        this.customerDateOfBirth = customerDateOfBirth;
	    }
	    public void setCustomerMail(String customerMail) {
	        this.customerMail = customerMail;
	    }
	    public void setHospital(String hospital) {
	        this.hospital = hospital;
	    }
	    public void setCustomerId(int customerId) {
	        this.customerId = customerId;
	    }

	    public int getCustomerAge() {
	        return customerAge;
	    }

	    public void setCustomerAge(int customerAge) {
	        this.customerAge = customerAge;
	    }

	    public int getCustomerId() {
	        return customerId;
	    }

	    public String getCustomerPassword() {
	        return customerPassword;
	    }

	    public String getCustomerUsername() {
	        return customerUsername;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public Gender getCustomerGender() {
	        return customerGender;
	    }

	    public LocalDate getCustomerDateOfBirth() {
	        return customerDateOfBirth;
	    }

	    public String getCustomerMail() {
	        return customerMail;
	    }

	    public String getHospital() {
	        return hospital;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Customer customer = (Customer) o;
	        return Objects.equals(customerId, customer.customerId);
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(customerId);
	    }
}
