package Modele

import kotlinx.serialization.Serializable


@Serializable
data class Condition(
    var text:String,
    var icon : String,
    var code : Int
)