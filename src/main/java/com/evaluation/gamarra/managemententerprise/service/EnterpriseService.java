package com.evaluation.gamarra.managemententerprise.service;

import com.evaluation.gamarra.managemententerprise.model.Enterprise;
import com.evaluation.gamarra.managemententerprise.model.EnterpriseDto;

import java.util.List;

public interface EnterpriseService {

  Enterprise saveEnterprise(EnterpriseDto enterpriseDto);
  List<EnterpriseDto> getEnterprises();
}
