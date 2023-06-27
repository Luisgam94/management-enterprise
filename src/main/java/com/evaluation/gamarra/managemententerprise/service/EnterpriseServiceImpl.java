package com.evaluation.gamarra.managemententerprise.service;

import com.evaluation.gamarra.managemententerprise.model.Enterprise;
import com.evaluation.gamarra.managemententerprise.model.EnterpriseDto;
import com.evaluation.gamarra.managemententerprise.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnterpriseServiceImpl implements EnterpriseService{

  @Autowired
  EnterpriseRepository enterpriseRepository;

  @Override
  public Enterprise saveEnterprise(EnterpriseDto enterpriseDto) {

    Enterprise enterprise = new Enterprise();
    enterprise.setAddress(enterpriseDto.getAddress());
    enterprise.setBusinessName(enterpriseDto.getBusinessName());
    enterprise.setRuc(enterpriseDto.getRuc());
    enterprise.setState(enterpriseDto.isState());

    return enterpriseRepository.save(enterprise);

  }

  @Override
  public List<EnterpriseDto> getEnterprises() {
    List<Enterprise> enterprises = enterpriseRepository.findEnterprises();

    return enterprises.stream().map((i) -> {
      EnterpriseDto enterpriseDto = new EnterpriseDto();
      enterpriseDto.setIdEnterprise(i.getIdEnterprise());
      enterpriseDto.setRuc(i.getRuc());
      enterpriseDto.setAddress(i.getAddress());
      enterpriseDto.setBusinessName(i.getBusinessName());
      enterpriseDto.setState(i.isState());
      return enterpriseDto;
    }).collect(Collectors.toList());

  }

}
