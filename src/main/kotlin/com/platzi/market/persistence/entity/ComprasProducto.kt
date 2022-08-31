package com.platzi.market.persistence.entity

import javax.persistence.*


@Entity
@Table(name = "compras_productos")
class ComprasProducto {
    @EmbeddedId
    private val id: ComprasProductoPK? = null

    private val cantidad: Int? = null

    private val total: Double? = null

    private val estado: Boolean? = null

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private val compra: Compra? = null


    @ManyToOne
    @JoinColumn(name = "id_producto",  insertable = false, updatable = false)
    private val producto: Producto? = null
}
