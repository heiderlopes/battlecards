package br.com.heiderlopes.battlecards.model
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

data class Pokemon(
        val numero: String,
        val nome: String,
        val ps: Int,
        val ataque: Int,
        val defesa: Int,
        val ataqueespecial: Int,
        val defesaespecial: Int,
        val velocidade: Int,
        val descricao: String,
        val geracao: Int) {

    val imagem: String
        get() = ServletUriComponentsBuilder.fromCurrentContextPath().toUriString() + "/images/" + String.format("%03d", numero) + ".png"
}