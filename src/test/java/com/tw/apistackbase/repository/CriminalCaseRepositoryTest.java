package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.model.CaseStructure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@SpringBootTest
public class CriminalCaseRepositoryTest {

    @Autowired
    CriminalCaseRepository criminalCaseRepository;
    @Autowired
    CaseStructureRepository caseStructureRepository;

    @Test
    public void should_return_all_case_message(){
        CriminalCase criminalCase1 = new CriminalCase();
        criminalCase1.setId(1);
        criminalCase1.setCaseName("贩毒");
        criminalCase1.setCaseTime(new Date().getTime());
        criminalCase1.setCaseStructure(new CaseStructure("需要钱","需要更多的钱"));

        criminalCaseRepository.save(criminalCase1);

        Optional<CriminalCase> case2 =criminalCaseRepository.findById(criminalCase1.getId());
        System.out.println(case2.get().getCaseName()+ case2.get().getCaseStructure().getSubjectiveEssentials());
        assertThat(case2.get().getCaseName()).isEqualTo("贩毒");
    }


}
