package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Procurator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcuratorRepository extends JpaRepository<Procurator,Integer> {
}
