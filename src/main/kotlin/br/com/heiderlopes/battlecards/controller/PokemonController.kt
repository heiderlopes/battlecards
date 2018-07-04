package br.com.heiderlopes.battlecards.controller

import br.com.heiderlopes.battlecards.model.Pokemon
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("pokemon")
class NoteController {

    @GetMapping
    fun all(): Pokemon? {
        //return Pokemon(150, "Mewtwo")
        return null
    }

    @PostMapping
    fun save(@RequestBody pokemon: Pokemon?): String {
        return "Gravado com sucesso"
    }
}