package com.proyecto1.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Producto {

  private Integer IdPro;
  private String Nombre;
  private Double Valor;
  private Integer Cantidad;

}
