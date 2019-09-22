package com.mod.view

import com.mod.app.Styles
import com.mod.controller.*
import tornadofx.*
import javafx.collections.FXCollections

class StartView : View() {
    val controller: StartController by inject()
    val gameOptions = FXCollections.observableArrayList(controller.gameOptions)
    val playerOptions = FXCollections.observableArrayList("2", "3", "4", "5", "6", "7")

    override val root = vbox() {
        label("18Mod") {
            addClass(Styles.heading)
        }
        label("Game") {}
        combobox<String> {
            items = gameOptions
        }
        label("Number of Players") {}
        combobox<String> { items = playerOptions }
    }
}

