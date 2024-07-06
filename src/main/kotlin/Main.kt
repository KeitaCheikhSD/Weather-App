package org.example

import Modele.Modele
import kotlinx.coroutines.runBlocking


fun main() {
    var modele = Modele()
    runBlocking {

        modele.CurrentTime("london")

    }
}