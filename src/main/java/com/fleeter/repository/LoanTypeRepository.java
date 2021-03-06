package com.fleeter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleeter.entities.applicant.LoanType;

@Repository
public interface LoanTypeRepository extends JpaRepository<LoanType, Integer> {

}
