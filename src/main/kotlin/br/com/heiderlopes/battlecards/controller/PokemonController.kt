package br.com.heiderlopes.battlecards.controller

import br.com.heiderlopes.battlecards.model.Pokemon
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("pokemon")
class NoteController {

    @GetMapping
    fun all(): Pokemon {
        return Pokemon(150, "Mewtwo")
    }
}