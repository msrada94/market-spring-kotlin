package com.platzi.market.persistence.entity

import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "compras")
class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra", nullable = false, unique = true)
    private val idCompra: Int? = null

    @Column(name = "id_cliente", nullable = false)
    private val idCliente: String? = null

    private val fecha: LocalDateTime? = null

    @Column(name = "medio_pago")
    private val medioPago: String? = null

    private val comentario: String? = null

    private val estado: String? = null


    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private val cliente: Cliente? = null

    @OneToMany(mappedBy = "producto")
    private val productos: List<ComprasProducto> = emptyList()

    //todo toString method
}