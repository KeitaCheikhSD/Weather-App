package Modele

import kotlinx.serialization.Serializable

@Serializable

data class WeatherData (

        val hour: List<Hours>
)

