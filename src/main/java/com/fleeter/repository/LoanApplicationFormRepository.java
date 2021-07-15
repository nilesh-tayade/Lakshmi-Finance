package com.fleeter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleeter.entities.applicant.LoanApplicationForm;

@Repository
public interface LoanApplicationFormRepository extends JpaRepository<LoanApplicationForm, Integer> {

}
