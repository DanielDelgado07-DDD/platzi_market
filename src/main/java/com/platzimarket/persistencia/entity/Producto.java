package com.platzimarket.persistencia.entity;

import javax.persistence.*;

@Entity //anotacion para definir una entidad de la base de datos
@Table(name="productos") // cuando el nombre de la tabla es diferente al de la clase
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generar ese valor de identidad de manera automatica
    @Column(name = "id_producto") //cuando el nombre de la variable es distinto al de la tabla
    private Integer idProducto;

    private String nombre;
    @Column(name ="id_categoria")
    private Integer idCategoria;
    @Column(name = "codigo_barras")
    private String codigoBarra;
    @Column(name ="precio_venta")
    private  double precioVenta;
    @Column (name ="cantidad_stock")
    private Integer cantidadStock;
    private boolean estado;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
