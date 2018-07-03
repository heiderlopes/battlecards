package br.com.heiderlopes.battlecards.model

import org.springframework.web.servlet.support.ServletUriComponentsBuilder

data class Pokemon(
        val numero: Int,
        val nome: String) {

    val imagem: String
        get() = ServletUriComponentsBuilder.fromCurrentContextPath().toUriString() + "/images/" + String.format("%03d", numero) + ".png"
}