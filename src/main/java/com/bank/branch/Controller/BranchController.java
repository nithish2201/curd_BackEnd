package com.bank.branch.Controller;

import com.bank.branch.Model.Branch;
import com.bank.branch.Service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/branches")
    public List<Branch> getAllBranch(){
        return branchService.findAll();
    }

    @PostMapping("/save")
    public String saveData(@Validated @RequestBody Branch branch){
        return  branchService.save(branch);
    }

    @PutMapping("/edit/{branchId}")
    public Branch updateData(@PathVariable long branchId, @RequestBody Branch updatbranch){
        return branchService.updateBranch(branchId,updatbranch);
    }

    @DeleteMapping("/delete/{branchId}")
    public void deleteData(@PathVariable long branchId){
        branchService.deleteById(branchId);
    }

    @GetMapping("/download/excel")
    public ResponseEntity<byte[]> downloadExcel() throws IOException {

        byte[] excelData = branchService.generateExcelFromDatabase();

        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=Branch_data.xlsx");

        return new ResponseEntity<>(excelData, headers, HttpStatus.OK);
    }
}
