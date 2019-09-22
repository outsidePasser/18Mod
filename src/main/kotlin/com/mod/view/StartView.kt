package com.mod.view

import com.mod.app.Styles
import com.mod.controller.*
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import javafx.collections.FXCollections

class StartView : View() {
    val controller: StartController by inject()
    val gameOptions = FXCollections.observableArrayList(controller.gameOptions)
    var selectedGame = SimpleStringProperty()
    val playerOptions = FXCollections.observableArrayList("2", "3", "4", "5", "6", "7")

    init {
        selectedGame.onChange { controller.setGame(it) }
    }

    override val root = vbox() {
        label("18Mod") {
            addClass(Styles.heading)
        }
        label("Game") {}
        combobox(selectedGame, gameOptions) {
            selectionModel.select(0)
        }
        label("Number of Players") {}
        combobox<String> { items = playerOptions }
    }
}

