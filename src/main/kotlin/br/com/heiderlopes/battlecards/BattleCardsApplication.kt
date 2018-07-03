package br.com.heiderlopes.battlecards

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BattleCardsApplication

fun main(args: Array<String>) {
    runApplication<BattleCardsApplication>(*args)
}
