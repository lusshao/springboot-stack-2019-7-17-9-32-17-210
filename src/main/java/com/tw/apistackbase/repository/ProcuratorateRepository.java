package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Procuratorate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcuratorateRepository extends JpaRepository<Procuratorate,Integer> {
}