package com.bank.branch.Controller;

import com.bank.branch.Model.BranchAccount;
import com.bank.branch.Service.BranchAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BranchAccountController {

    @Autowired
    private BranchAccountService branchAccountService;

    @GetMapping("/accounts")
    public List<BranchAccount> getAll(){
        return branchAccountService.getAll();
    }

    @PostMapping("/account")
    public List<BranchAccount> saveData (@Validated @RequestBody List<BranchAccount> branchAccount){
        return branchAccountService.save(branchAccount);
    }

    @PutMapping("/account/edit/{accountId}")
    public BranchAccount editData(@PathVariable long accountId,@Validated @RequestBody BranchAccount UpdateAccount){
        return branchAccountService.updateData(accountId,UpdateAccount);
    }

    @DeleteMapping("/account/delete/{accountId}")
    public void deleteData(@PathVariable long accountId){
        branchAccountService.deleteById(accountId);
    }
}
