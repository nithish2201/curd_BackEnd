package com.bank.branch.Repository;

import com.bank.branch.Model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Long> {
    Branch deleteByBranchId(long id);

    Optional<Branch> findByBranchId(long branchId);
}
