package com.example.skycast.model

import com.example.skycast.model.remote.WeatherForecastResponse
import com.example.skycast.model.remote.current.CurrentWetherResponse
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {

    suspend fun getWeatherForecast(lat: Double, lon: Double, lang: String , units: String): WeatherForecastResponse
    suspend fun getCurrentWeather(lat: Double, lon: Double, lang: String, units: String): CurrentWetherResponse
    suspend fun getCurrentWeatherByCity(cityName: String, lang: String, units: String): CurrentWetherResponse


    suspend fun insertWeather(weather: WeatherForecastResponse)
    suspend fun getAllWeather(): Flow<List<WeatherForecastResponse>>
    suspend fun getWeatherById(id: Int): WeatherForecastResponse?
    suspend fun deleteWeather(weather: WeatherForecastResponse)
    suspend fun updateWeather(weather: WeatherForecastResponse)

    suspend fun insertWeather(current : CurrentWetherResponse)
    suspend fun getAllCurrent(): Flow<List<CurrentWetherResponse>>
    suspend fun getCurrentWeatherById(id: Int): CurrentWetherResponse?
    suspend fun deleteCurrentWeather(current : CurrentWetherResponse)
    suspend fun updateCurrentWeather(current : CurrentWetherResponse)

}