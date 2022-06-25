package com.reactivekatas

import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import reactor.test.StepVerifier
import java.util.*
import kotlin.math.exp
import kotlin.test.assertEquals

internal class CountriesExercisesTest {


    private val countriesService = CountriesExercisesReactor()
    private val countriesServiceCoroutine = CountriesExercisesCoroutine()
    private val allCountries = CountriesTestProvider.countries

    @Test
    internal fun `country name in capitals reactor way`() {
        val testCountry = CountriesTestProvider.countries.get(0)
        val expected = testCountry.name.uppercase(Locale.US)
        val actual = countriesService.countryNameInCapitals(testCountry)

        StepVerifier.create(actual)
            .expectNext(expected)
            .verifyComplete()
    }

    @Test
    fun `country name in capitals coroutine way`() {
        val testCountry = CountriesTestProvider.countries.get(0)
        val expected = testCountry.name.uppercase(Locale.US)
        runTest {
            val actual = countriesServiceCoroutine.countryNameInCapitals(testCountry)
            assertEquals(expected, actual)
        }

    }


}