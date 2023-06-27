package com.evaluation.gamarra.managemententerprise.repository;

import com.evaluation.gamarra.managemententerprise.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise,Long> {

  @Query(value="SELECT * FROM Enterprise ORDER BY id_enterprise DESC LIMIT 3", nativeQuery = true)
  List<Enterprise> findEnterprises();
}
