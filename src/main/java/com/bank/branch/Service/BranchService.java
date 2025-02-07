package com.bank.branch.Service;

import com.bank.branch.Model.Branch;
import com.bank.branch.Repository.BranchRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public List<Branch> findAll() {
        return branchRepository.findAll();
    }

    public String save(Branch branch) {
        try {
            branchRepository.save(branch);
            return "stored";
        } catch (Exception e) {
            return String.valueOf(e);
        }

    }

    public Branch updateBranch(long branchId, Branch branchDetails) {
        return branchRepository.findByBranchId(branchId).map(branch -> {
            branch.setBranchCode(branchDetails.getBranchCode());
            branch.setBranchName(branchDetails.getBranchName());
            branch.setBranchShortName(branchDetails.getBranchShortName());
            branch.setDoorNo(branchDetails.getDoorNo());
            branch.setStreet(branchDetails.getStreet());
            branch.setCity(branchDetails.getCity());
            branch.setLocality(branchDetails.getLocality());
            branch.setPincode(branchDetails.getPincode());
            branch.setState(branchDetails.getState());
            branch.setPanNo(branchDetails.getPanNo());
            branch.setGstIn(branchDetails.getGstIn());
            branch.setBranchType(branchDetails.getBranchType());
            branch.setVehicleType(branchDetails.getVehicleType());
            branch.setContactNo(branchDetails.getContactNo());
            branch.setAltNumber(branchDetails.getAltNumber());
            branch.setWhatsappNumber(branchDetails.getWhatsappNumber());
            branch.setEmailId(branchDetails.getEmailId());
            branch.setInchargeName(branchDetails.getInchargeName());
            branch.setInchargeContactNo(branchDetails.getInchargeContactNo());
            branch.setInchargeAltNumber(branchDetails.getInchargeAltNumber());
            branch.setInchargeWhatsappNumber(branchDetails.getInchargeWhatsappNumber());
            branch.setInchargeEmailId(branchDetails.getInchargeEmailId());
            branch.setConPersonName(branchDetails.getConPersonName());
            branch.setConPersonNumber(branchDetails.getConPersonNumber());
            branch.setConPersonAltNumber(branchDetails.getConPersonAltNumber());
            branch.setContactPersonWhatsappNumber(branchDetails.getContactPersonWhatsappNumber());
            branch.setContactEmailId(branchDetails.getContactEmailId());
            branch.setOpeningBalance(branchDetails.getOpeningBalance());
            branch.setOpeningDate(branchDetails.getOpeningDate());
            branch.setMinimumAmount(branchDetails.getMinimumAmount());
            branch.setMaximumAmount(branchDetails.getMaximumAmount());
            branch.setMonthlyMaximumAmount(branchDetails.getMonthlyMaximumAmount());
            branch.setMaximumUnallocatedAmount(branchDetails.getMaximumUnallocatedAmount());
            branch.setEffectiveDate(branchDetails.getEffectiveDate());
            branch.setStatus(branchDetails.getStatus());
            return branchRepository.save(branch);
        }).orElse(null);
    }

    public Branch deleteById(long branchId) {
        return branchRepository.deleteByBranchId(branchId);
    }

    public byte[] generateExcelFromDatabase() throws IOException {

        List<Branch> branches = branchRepository.findAll();


        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Branches");


        String[] headers = {
                 "Branch Code", "Branch Name", "Branch Short Name", "Door Number",
                "Street", "City", "Locality", "Pincode", "State", "PAN Number", "GSTIN",
                "Branch Type", "Vehicle Type", "Contact Number", "Alternate Contact Number",
                "WhatsApp Number", "Email ID", "Incharge Name", "Incharge Contact Number",
                "Incharge Alternate Number", "Incharge WhatsApp Number", "Incharge Email ID",
                "Contact Person Name", "Contact Person Number", "Contact Person Alternate Number",
                "Contact Person WhatsApp Number", "Contact Person Email ID", "Opening Balance",
                "Opening Date", "Minimum Amount", "Maximum Amount", "Monthly Maximum Amount",
                "Maximum Unallocated Amount", "Effective Date", "Status"
        };


        Row headerRow = sheet.createRow(1);
        int headerIndex = 0;
        for (String header : headers) {
            Cell cell = headerRow.createCell(headerIndex++);
            cell.setCellValue(header);
        }


        int rowIndex = 1;
        for (Branch branch : branches) {
            Row row = sheet.createRow(rowIndex++);
            row.createCell(1).setCellValue(branch.getBranchCode());
            row.createCell(2).setCellValue(branch.getBranchName());
            row.createCell(3).setCellValue(branch.getBranchShortName());
            row.createCell(4).setCellValue(branch.getDoorNo());
            row.createCell(5).setCellValue(branch.getStreet());
            row.createCell(6).setCellValue(branch.getCity());
            row.createCell(7).setCellValue(branch.getLocality());
            row.createCell(8).setCellValue(branch.getPincode());
            row.createCell(9).setCellValue(branch.getState());
            row.createCell(10).setCellValue(branch.getPanNo());
            row.createCell(11).setCellValue(branch.getGstIn());
            row.createCell(12).setCellValue(branch.getBranchType());
            row.createCell(13).setCellValue(branch.getVehicleType());
            row.createCell(14).setCellValue(branch.getContactNo());
            row.createCell(15).setCellValue(branch.getAltNumber());
            row.createCell(16).setCellValue(branch.getWhatsappNumber());
            row.createCell(17).setCellValue(branch.getEmailId());
            row.createCell(18).setCellValue(branch.getInchargeName());
            row.createCell(19).setCellValue(branch.getInchargeContactNo());
            row.createCell(20).setCellValue(branch.getInchargeAltNumber());
            row.createCell(21).setCellValue(branch.getInchargeWhatsappNumber());
            row.createCell(22).setCellValue(branch.getInchargeEmailId());
            row.createCell(23).setCellValue(branch.getConPersonName());
            row.createCell(24).setCellValue(branch.getConPersonNumber());
            row.createCell(25).setCellValue(branch.getConPersonAltNumber());
            row.createCell(26).setCellValue(branch.getContactPersonWhatsappNumber());
            row.createCell(27).setCellValue(branch.getContactEmailId());
            row.createCell(28).setCellValue(branch.getOpeningBalance());
            row.createCell(29).setCellValue(branch.getOpeningDate() != null ? branch.getOpeningDate().toString() : "");
            row.createCell(30).setCellValue(branch.getMinimumAmount());
            row.createCell(31).setCellValue(branch.getMaximumAmount());
            row.createCell(32).setCellValue(branch.getMonthlyMaximumAmount());
            row.createCell(33).setCellValue(branch.getMaximumUnallocatedAmount());
            row.createCell(34).setCellValue(branch.getEffectiveDate() != null ? branch.getEffectiveDate().toString() : "");
            row.createCell(35).setCellValue(branch.getStatus());
        }


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        workbook.write(byteArrayOutputStream);
        workbook.close();

        return byteArrayOutputStream.toByteArray();
    }
}
