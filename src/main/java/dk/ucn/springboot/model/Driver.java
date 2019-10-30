package dk.ucn.springboot.model;

import dk.ucn.springboot.enumerated.TaxationType;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String address;
    private String fatherName;
    @Column(unique = true)
    @NotBlank
    private String personalNr;
    @Column(unique = true)
    @NotBlank(message = "ID Serial Number cannot be blank")
    private String idSerialNr;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TaxationType taxationType;
    private String bankNumber;
    @Email
    private String email;

    public Driver() {
    }

    public Driver(long id, String fullName, String address, String fatherName, String personalNr, String idSerialNr, TaxationType taxationType, String bankNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.fatherName = fatherName;
        this.personalNr = personalNr;
        this.idSerialNr = idSerialNr;
        this.taxationType = taxationType;
        this.bankNumber = bankNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPersonalNr() {
        return personalNr;
    }

    public void setPersonalNr(String personalNr) {
        this.personalNr = personalNr;
    }

    public String getIdSerialNr() {
        return idSerialNr;
    }

    public void setIdSerialNr(String idSerialNr) {
        this.idSerialNr = idSerialNr;
    }

    public TaxationType getTaxationType() {
        return taxationType;
    }

    public void setTaxationType(TaxationType taxationType) {
        this.taxationType = taxationType;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    @PostPersist
    public void postPersist() {
        System.out.println("New driver has been hired: " + this.getFullName());
    }

    @PostRemove
    public void postRemove() {
        System.out.println("Driver has been deleted: " + this.getFullName());
    }
}
