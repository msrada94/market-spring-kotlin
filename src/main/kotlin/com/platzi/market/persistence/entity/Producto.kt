package com.platzi.market.persistence.entity

import javax.persistence.*


@Entity
@Table(name = "productos")
class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false, unique = true)
    private val idProducto: Long? = null

    private val nombre: String? = null

    @Column(name = "id_categoria", nullable = false)
    private val IdCategoria: Int? = null

    @Column(name = "codigo_barras")
    private val codigoBarras: String? = null

    @Column(name = "precio_venta")
    private val precioVenta: Double? = null

    @Column(name = "cantidad_stock", nullable = false)
    private val cantidadStock: Int? = null

    private val estado: Boolean? = null

    @ManyToOne
    @JoinColumn(name= "id_categoria" , insertable = false, updatable = false)
    private val categoria: Categoria? = null

    override fun toString(): String {
        return "Item{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", IdCategoria='" + IdCategoria + '\'' +
                ", codigoBarras='" + codigoBarras + '\'' +
                ", precioVenta='" + precioVenta + '\'' +
                ", cantidadStock='" + cantidadStock + '\'' +
                ", estado='" + estado + '\'' +
                '}'
    }
}