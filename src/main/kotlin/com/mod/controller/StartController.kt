package com.mod.controller

import tornadofx.*

class StartController : Controller() {
    // TODO: Get these from config file
    val gameOptions = arrayListOf("1830", "1822")
    val minNumPlayers = 2
    val maxNumPlayers = 7

    fun setGame(game :String?) {
        println("Game set to: $game")
    }

}


