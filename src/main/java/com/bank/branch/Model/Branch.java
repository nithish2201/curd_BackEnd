package com.bank.branch.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table( name = "branch_details")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private long branchId;

    @Column(name = "branch_code", nullable = false)
    private String branchCode;

    @Column(name = "branch_name", nullable = false)
    private String branchName;

    @Column(name = "branch_short_name",nullable = false)
    private String branchShortName;

    @Column(name = "branch_no")
    private String doorNo;

    @Column(name = "street")
    private String street;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "locality", nullable = false)
    private String locality;

    @Column(name = "pincode", nullable = false)
    private int pincode;

    @Column(name = "state",nullable = false)
    private String state;

    @Column(name = "pan_no")
    private long panNo;

    @Column(name = "gst_in")
    private String gstIn;

    @Column(name = "branch_type", nullable = false)
    private String branchType;

    @Column(name = "vehicle_type", nullable = false)
    private String vehicleType;

    @Column(name = "contact_no", nullable = false)
    private long contactNo;

    @Column(name = "alt_number")
    private long altNumber;

    @Column(name = "whatsapp_number")
    private long whatsappNumber;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "incharge_name")
    private String inchargeName;

    @Column(name = "incharge_contact_no")
    private long inchargeContactNo;

    @Column(name = "incharge_alt_number")
    private long inchargeAltNumber;

    @Column(name = "incharge_whatsapp_number")
    private String inchargeWhatsappNumber;

    @Column(name = "incharge_email_id")
    private String inchargeEmailId;

    @Column(name = "contact_person_name")
    private String conPersonName;

    @Column(name = "contact_person_number")
    private long conPersonNumber;

    @Column(name = "contact_person_altnumber")
    private long conPersonAltNumber;

    @Column(name = "contact_person_whatsapp_no")
    private long contactPersonWhatsappNumber;

    @Column(name = "contact_email_id")
    private String contactEmailId;

    @Column(name = "opening_balance")
    private long openingBalance;

    @Column(name = "opening_date")
    @Temporal(TemporalType.DATE)
    private Date openingDate;

    @Column(name = "minimum_amount")
    private int minimumAmount ;

    @Column(name = "maximum_amount")
    private int maximumAmount;

    @Column(name = "monthly_maximum_mount")
    private long monthlyMaximumAmount;

    @Column(name = "maximum_unallocated_amount")
    private long maximumUnallocatedAmount;

    @Column(name = "effective_number")
    @Temporal(TemporalType.DATE)
    private Date effectiveDate;

    @Column(name = "status", columnDefinition = "VARCHAR(25) DEFAULT 'Active'")
    private String status = "Active";

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchShortName() {
        return branchShortName;
    }

    public void setBranchShortName(String branchShortName) {
        this.branchShortName = branchShortName;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPanNo() {
        return panNo;
    }

    public void setPanNo(long panNo) {
        this.panNo = panNo;
    }

    public String getGstIn() {
        return gstIn;
    }

    public void setGstIn(String gstIn) {
        this.gstIn = gstIn;
    }

    public String getBranchType() {
        return branchType;
    }

    public void setBranchType(String branchType) {
        this.branchType = branchType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public long getAltNumber() {
        return altNumber;
    }

    public void setAltNumber(long altNumber) {
        this.altNumber = altNumber;
    }

    public long getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(long whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getInchargeName() {
        return inchargeName;
    }

    public void setInchargeName(String inchargeName) {
        this.inchargeName = inchargeName;
    }

    public long getInchargeContactNo() {
        return inchargeContactNo;
    }

    public void setInchargeContactNo(long inchargeContactNo) {
        this.inchargeContactNo = inchargeContactNo;
    }

    public long getInchargeAltNumber() {
        return inchargeAltNumber;
    }

    public void setInchargeAltNumber(long inchargeAltNumber) {
        this.inchargeAltNumber = inchargeAltNumber;
    }

    public String getInchargeWhatsappNumber() {
        return inchargeWhatsappNumber;
    }

    public void setInchargeWhatsappNumber(String inchargeWhatsappNumber) {
        this.inchargeWhatsappNumber = inchargeWhatsappNumber;
    }

    public String getInchargeEmailId() {
        return inchargeEmailId;
    }

    public void setInchargeEmailId(String inchargeEmailId) {
        this.inchargeEmailId = inchargeEmailId;
    }

    public String getConPersonName() {
        return conPersonName;
    }

    public void setConPersonName(String conPersonName) {
        this.conPersonName = conPersonName;
    }

    public long getConPersonNumber() {
        return conPersonNumber;
    }

    public void setConPersonNumber(long conPersonNumber) {
        this.conPersonNumber = conPersonNumber;
    }

    public long getConPersonAltNumber() {
        return conPersonAltNumber;
    }

    public void setConPersonAltNumber(long conPersonAltNumber) {
        this.conPersonAltNumber = conPersonAltNumber;
    }

    public long getContactPersonWhatsappNumber() {
        return contactPersonWhatsappNumber;
    }

    public void setContactPersonWhatsappNumber(long contactPersonWhatsappNumber) {
        this.contactPersonWhatsappNumber = contactPersonWhatsappNumber;
    }

    public String getContactEmailId() {
        return contactEmailId;
    }

    public void setContactEmailId(String contactEmailId) {
        this.contactEmailId = contactEmailId;
    }

    public long getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(long openingBalance) {
        this.openingBalance = openingBalance;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public int getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(int minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public long getMonthlyMaximumAmount() {
        return monthlyMaximumAmount;
    }

    public void setMonthlyMaximumAmount(long monthlyMaximumAmount) {
        this.monthlyMaximumAmount = monthlyMaximumAmount;
    }

    public long getMaximumUnallocatedAmount() {
        return maximumUnallocatedAmount;
    }

    public void setMaximumUnallocatedAmount(long maximumUnallocatedAmount) {
        this.maximumUnallocatedAmount = maximumUnallocatedAmount;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + branchId +
                ", branchCode='" + branchCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", branchShortName='" + branchShortName + '\'' +
                ", doorNo='" + doorNo + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", locality='" + locality + '\'' +
                ", pincode=" + pincode +
                ", state='" + state + '\'' +
                ", panNo=" + panNo +
                ", gstIn='" + gstIn + '\'' +
                ", branchType='" + branchType + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", contactNo=" + contactNo +
                ", altNumber=" + altNumber +
                ", whatsappNumber=" + whatsappNumber +
                ", emailId='" + emailId + '\'' +
                ", inchargeName='" + inchargeName + '\'' +
                ", inchargeContactNo=" + inchargeContactNo +
                ", inchargeAltNumber=" + inchargeAltNumber +
                ", inchargeWhatsappNumber='" + inchargeWhatsappNumber + '\'' +
                ", inchargeEmailId='" + inchargeEmailId + '\'' +
                ", conPersonName='" + conPersonName + '\'' +
                ", conPersonNumber=" + conPersonNumber +
                ", conPersonAltNumber=" + conPersonAltNumber +
                ", contactPersonWhatsappNumber=" + contactPersonWhatsappNumber +
                ", contactEmailId='" + contactEmailId + '\'' +
                ", openingBalance=" + openingBalance +
                ", openingDate=" + openingDate +
                ", minimumAmount=" + minimumAmount +
                ", maximumAmount=" + maximumAmount +
                ", monthlyMaximumAmount=" + monthlyMaximumAmount +
                ", maximumUnallocatedAmount=" + maximumUnallocatedAmount +
                ", effectiveDate=" + effectiveDate +
                ", status='" + status + '\'' +
                '}';
    }
}
