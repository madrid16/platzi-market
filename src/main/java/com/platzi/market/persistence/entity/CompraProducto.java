package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "compras_productos")
public class CompraProducto {

    @Id
    @Column(name = "id_compra")
    private Integer idCompra;

    @Id
    @Column(name = "id_producto")
    private Integer idProducto;

    private String cantidad;

    private Double total;

    private Boolean estado;
}
