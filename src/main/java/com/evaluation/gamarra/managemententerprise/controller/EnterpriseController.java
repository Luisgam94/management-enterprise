package com.evaluation.gamarra.managemententerprise.controller;

import com.evaluation.gamarra.managemententerprise.model.Enterprise;
import com.evaluation.gamarra.managemententerprise.model.EnterpriseDto;
import com.evaluation.gamarra.managemententerprise.service.EnterpriseService;
import com.evaluation.gamarra.managemententerprise.service.EnterpriseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseController {

  @Autowired
  EnterpriseService enterpriseService;

  @PostMapping("/enterprise")
  public Enterprise saveStudent(@Validated @RequestBody EnterpriseDto enterpriseDto){
    return enterpriseService.saveEnterprise(enterpriseDto);
  }

  @GetMapping("/enterprise")
  public List<EnterpriseDto> getAllStudents(){
    return enterpriseService.getEnterprises();
  }

}
