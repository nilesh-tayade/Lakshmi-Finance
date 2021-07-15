package com.fleeter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleeter.entities.applicant.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {

	public Applicant findByUsernameAndPassword(String username , String password);
}
