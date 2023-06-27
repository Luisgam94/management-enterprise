package com.evaluation.gamarra.managemententerprise.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class EnterpriseDto {

  private Long idEnterprise;

  @NotNull
  private Long ruc;

  @NotNull
  private String businessName;

  @NotNull
  private String address;

  @NotNull
  private boolean state;
}
