package POJOS;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
public class MaintainanceRecord implements Serializable{
	 //TODO ¿idPieza? Pieza ya tiene las maintainance dates; Pieza tendra que tener el Id de su maintainance
    //TODO ¿Actual State?
    private Integer maintainanceId;
    private LocalDate maintainanceDate;
    private String description;
  

    public MaintainanceRecord(Integer maintainanceId, LocalDate maintainanceDate, String description) {
        this.maintainanceId = maintainanceId;
        this.maintainanceDate = maintainanceDate;
        this.description = description;
    }

    public Integer getMaintainanceId() {
        return maintainanceId;
    }

    public void setMaintainanceId(Integer maintainanceId) {
        this.maintainanceId = maintainanceId;
    }

    public LocalDate getMaintainanceDate() {
        return maintainanceDate;
    }

    public void setMaintainanceDate(LocalDate maintainanceDate) {
        this.maintainanceDate = maintainanceDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaintainanceRecord that = (MaintainanceRecord) o;
        return Objects.equals(maintainanceId, that.maintainanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maintainanceId);
        //, description
    }
}
