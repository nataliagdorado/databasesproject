package POJOS;
import java.io.Serializable;
import java.util.Objects;
import java.util.TreeSet;

public class Clinique implements Serializable{
	
	private Integer cliniqueId;
	private String cliniquePassword;
	private String cliniqueUsername;
	private String cliniqueMail;
	private TreeSet<Machine> machines;
	private String cliniqueCEO;
	
    public void addMachine(Machine machine){
        machines.add(machine);
    }
    public void removeMachine(Machine machine) {
    	machines.remove(machine);
    }
    public Clinique(Integer cliniqueId, String cliniquePassword, String cliniqueUsername, String cliniqueMail, String cliniqueCEO) {
        this.cliniqueId = cliniqueId;
        this.cliniquePassword = cliniquePassword;
        this.cliniqueUsername = cliniqueUsername;
        this.cliniqueMail = cliniqueMail;
        this.cliniqueCEO = cliniqueCEO;
        this.machines=new TreeSet<Machine>();
    }
    public Integer getCliniqueId() {
        return cliniqueId;
    }

    public void setCliniqueId(Integer cliniqueId) {
        this.cliniqueId = cliniqueId;
    }

    public String getCliniquePassword() {
        return cliniquePassword;
    }

    public void setCliniquePassword(String cliniquePassword) {
        this.cliniquePassword = cliniquePassword;
    }

    public String getCliniqueUsername() {
        return cliniqueUsername;
    }

    public void setCliniqueUsername(String cliniqueUsername) {
        this.cliniqueUsername = cliniqueUsername;
    }

    public String getCliniqueMail() {
        return cliniqueMail;
    }

    public void setCliniqueMail(String cliniqueMail) {
        this.cliniqueMail = cliniqueMail;
    }

    public String getCliniqueCEO() {
        return cliniqueCEO;
    }

    public void setCliniqueCEO(String cliniqueCEO) {
        this.cliniqueCEO = cliniqueCEO;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clinique clinique = (Clinique) o;
        return Objects.equals(cliniqueId, clinique.cliniqueId) && Objects.equals(cliniquePassword, clinique.cliniquePassword) && Objects.equals(cliniqueUsername, clinique.cliniqueUsername) && Objects.equals(cliniqueMail, clinique.cliniqueMail) && Objects.equals(machines, clinique.machines) && Objects.equals(cliniqueCEO, clinique.cliniqueCEO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliniqueId, cliniquePassword, cliniqueUsername, cliniqueMail, machines, cliniqueCEO);
    }
    

	

}
