package uz.ttpu.weatherpatterns.data.repository

import org.junit.Assert.*

class WeatherRepositoryTest {
    private val repository = WeatherRepository(FakeWeatherApi(latencyMs = 0))

    @Test
    fun known_city_returns_success() = runBlocking<Unit> {
        // TODO: ask for "Tashkent"; assert isSuccess and temperatureC == 24
    }

    @Test
    fun unknown_city_returns_failure() = runBlocking<Unit> {
        // TODO: ask for "Atlantis"; assert isFailure
    }

}