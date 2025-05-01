package POJOS;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.TreeSet;

import Enums.AccessoryType;

public class Piece implements Serializable{
	private Integer accesoryId;
    private LocalDate last_Maintainance_Date;
    private LocalDate next_Maintainance_Date;
    private String material;
    private AccessoryType accesoryType;
    private Integer lifeSpan;
    private Byte[] piecePhoto;
    private TreeSet<Machine> machines;

    public Piece(Integer accesoryId, LocalDate last_Maintainance_Date, LocalDate next_Maintainance_Date, String material, AccessoryType accesoryType, Integer lifeSpan) {
        this.accesoryId = accesoryId;
        this.last_Maintainance_Date = last_Maintainance_Date;
        this.next_Maintainance_Date = next_Maintainance_Date;
        this.material = material;
        this.accesoryType = accesoryType;
        this.lifeSpan = lifeSpan;
        this.machines=new TreeSet<Machine>();
    }

    public AccessoryType getAccesoryType() {
        return accesoryType;
    }

    public void setAccesoryType(AccessoryType accesoryType) {
        this.accesoryType = accesoryType;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public int getAccesoryId() {
        return accesoryId;
    }

    public void setAccesoryId(Integer accesoryId) {
        this.accesoryId = accesoryId;
    }


    public LocalDate getLast_Maintainance_Date() {
        return last_Maintainance_Date;
    }

    public void setLast_Maintainance_Date(LocalDate last_Maintainance_Date) {
        this.last_Maintainance_Date = last_Maintainance_Date;
    }

    public LocalDate getNext_Maintainance_Date() {
        return next_Maintainance_Date;
    }

    public void setNext_Maintainance_Date(LocalDate next_Maintainance_Date) {
        this.next_Maintainance_Date = next_Maintainance_Date;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece pieces = (Piece) o;
        return Objects.equals(accesoryId, pieces.accesoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accesoryId);
    } 
}
