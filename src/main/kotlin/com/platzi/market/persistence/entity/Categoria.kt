package com.platzi.market.persistence.entity

import javax.persistence.*


@Entity
@Table(name = "categorias")
class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false, unique = true)
    private val idCategoria: Int? = null

    @Column(nullable = false)
    private val descripcion: String? = null

    @Column(nullable = false)
    private val estado: Boolean? = null

    @OneToMany(mappedBy = "categoria")
    private val productos: List<Producto> = emptyList()
}