package POJOS;
import java.io.Serializable;
import java.util.Objects;
import java.util.TreeSet;

public class Hospital implements Serializable{
	private Integer hospitalId;
	private String hospitalUsername;
	private String hospitalPassword;
	private String hospitalMail;
	private TreeSet<Machine> machines;
	
	public Hospital(Integer hospitalId, String hospitalUsername, String hospitalPassword, String hospitalMail) {
        this.hospitalId = hospitalId;
        this.hospitalUsername = hospitalUsername;
        this.hospitalPassword = hospitalPassword;
        this.hospitalMail = hospitalMail;
        this.machines=new TreeSet<Machine>();
    }
    public void addMachine(Machine machine){
        machines.add(machine);
    }
    public void removeMachine(Machine machine) {
    	machines.remove(machine);
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalUsername() {
        return hospitalUsername;
    }

    public void setHospitalUsername(String hospitalUsername) {
        this.hospitalUsername = hospitalUsername;
    }

    public String getHospitalPassword() {
        return hospitalPassword;
    }

    public void setHospitalPassword(String hospitalPassword) {
        this.hospitalPassword = hospitalPassword;
    }

    public String getHospitalMail() {
        return hospitalMail;
    }

    public void setHospitalMail(String hospitalMail) {
        this.hospitalMail = hospitalMail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(hospitalId, hospital.hospitalId) && Objects.equals(hospitalUsername, hospital.hospitalUsername) && Objects.equals(hospitalPassword, hospital.hospitalPassword) && Objects.equals(hospitalMail, hospital.hospitalMail) && Objects.equals(machines, hospital.machines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hospitalId, hospitalUsername, hospitalPassword, hospitalMail, machines);
    }



}
