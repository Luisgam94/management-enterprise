package com.evaluation.gamarra.managemententerprise.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "enterprise")
public class Enterprise {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_enterprise", nullable = false)
  private Long idEnterprise;

  @Column(name = "ruc", length = 11, nullable = false)
  private Long ruc;

  @Column(name = "business_name", nullable = false)
  private String businessName;

  @Column(name = "address", nullable = false)
  private String address;

  @Column(name = "state", nullable = false)
  private boolean state;
}
