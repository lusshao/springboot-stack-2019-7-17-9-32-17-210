package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.CaseStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseStructureRepository extends JpaRepository<CaseStructure,Integer> {
}
