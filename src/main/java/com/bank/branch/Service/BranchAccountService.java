package com.bank.branch.Service;

import com.bank.branch.Model.BranchAccount;
import com.bank.branch.Repository.BranchAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchAccountService {
    @Autowired
    private BranchAccountRepository branchAccountRepository;

    public List<BranchAccount> save(List<BranchAccount> branchAccount) {
        return branchAccountRepository.saveAll(branchAccount);
    }

    public List<BranchAccount> getAll() {
        return branchAccountRepository.findAll();
    }

    public BranchAccount updateData(long accountId, BranchAccount updateAccount) {
        return branchAccountRepository.findByAccountId(accountId).map(branchAccount -> {
            branchAccount.setAccountNumber(updateAccount.getAccountNumber());
            branchAccount.setBranchName(updateAccount.getBranchName());
            branchAccount.setHolderName(updateAccount.getHolderName());
            branchAccount.setIfscCode(updateAccount.getIfscCode());
            return branchAccountRepository.save(branchAccount);
        }).orElse(null);
    }

    public void deleteById(long accountId) {
        branchAccountRepository.deleteByAccountId(accountId); ;
    }
}
