package Modele

import io.ktor.client.*
import io.ktor.client.call.*
import org.example.Modele.Astro
import org.apache.http.HttpHost
import io.ktor.client.engine.apache.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import org.json.JSONObject
import java.io.File




import kotlinx.serialization.json.Json


class Modele {
    var lieux = Lieux()
    lateinit var condition : Condition
    var temps = Temps()
    var astro = Astro()
    lateinit var heure: Hours
    lateinit var weatherData : WeatherData
    var APIKey: String = "21cec8299302457083c140208242506"
    var Aqi = Boolean
    var Alerts = Boolean


    suspend fun CurrentTime(location: String) {
        val client = HttpClient(Apache) {
            engine {
            }
        }
        try {
            val response =
                client.get("http://api.weatherapi.com/v1/current.json?key=${APIKey}&q=${location}&aqi=${Aqi}")
            val result = JSONObject(response.bodyAsText())
            result.get()
            println(result)
        } catch (e: Exception) {
            println("Error: ${e.message}")
        } finally {
            client.close()
        }


    }
}