package com.platzi.market.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "clientes")
class Cliente {

    @Id
    @Column( nullable = false, unique = true)
    private var id: String? = null

    private val nombre: String? = null

    private val apellidos: String? = null

    private val celular: Int? = null

    private val direccion: String? = null

    @Column(name = "correo_electronico")
    private val correoElectronico: String? = null

    @OneToMany(mappedBy = "cliente")
    private val compras: List<Compra> = emptyList()
}