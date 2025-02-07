package com.bank.branch.Repository;

import com.bank.branch.Model.BranchAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchAccountRepository extends JpaRepository <BranchAccount,Long> {
    Optional<BranchAccount> findByAccountId(long accountId);

    void deleteByAccountId(long accountId);
}
