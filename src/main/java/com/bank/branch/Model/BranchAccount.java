package com.bank.branch.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "branch_account")
public class BranchAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;

    @Column(name = "account_number", nullable = false)
    private long accountNumber;

    @Column(name = "holder_name", nullable = false)
    private String holderName;

    @Column(name = "ifsc_code", nullable = false)
    private String ifscCode;

    @JoinColumn(name = "branch_id")
    @OneToOne
    private Branch branchId;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "branch_name")
    private String branchName;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public long getBranchId() {
        return branchId != null ? branchId.getBranchId() : null;
    }

    public void setBranchId(Branch branchId) {
        this.branchId = branchId;
    }

    @Override
    public String toString() {
        return "BranchAccount{" +
                "accountId=" + accountId +
                ", accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", branchId= " + branchId +
                ", ifscCode='" + ifscCode + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
