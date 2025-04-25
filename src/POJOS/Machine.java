package POJOS;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Machine implements Serializable{
	private Integer machineId;
    private String machineName;
    private String machineLocation;
    private String machineStatus;
    private LocalDate machineInstallingDate;

    public Machine(Integer machineId, String machineName, String machineLocation, String machineStatus, LocalDate machineInstallingDate) {
        this.machineId = machineId;
        this.machineName = machineName;
        this.machineLocation = machineLocation;
        this.machineStatus = machineStatus;
        this.machineInstallingDate = machineInstallingDate;
    }

    public int getMachineId() {
        return machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public String getMachineLocation() {
        return machineLocation;
    }

    public String getMachineStatus() {
        return machineStatus;
    }

    public LocalDate getMachineInstallingDate() {
        return machineInstallingDate;
    }

    public void setMachineInstallingDate(LocalDate machineInstallingDate) {
        this.machineInstallingDate = machineInstallingDate;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }


    public void setMachineLocation(String machineLocation) {
        this.machineLocation = machineLocation;
    }

    public void setMachineStatus(String machineStatus) {
        this.machineStatus = machineStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machines = (Machine) o;
        return Objects.equals(machineId, machines.machineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(machineId);
    }
}
