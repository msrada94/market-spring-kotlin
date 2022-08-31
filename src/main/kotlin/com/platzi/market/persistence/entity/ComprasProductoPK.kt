package com.platzi.market.persistence.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable


@Embeddable
class ComprasProductoPK : Serializable{
    @Column(name = "id_compra")
    private val idCompra: Int? = null

    @Column(name = "id_producto")
    private val idProducto: Int? = null
}
