package com.reactivekatas

import reactor.core.publisher.Mono
import java.util.*

class CountriesExercisesReactor {

    fun countryNameInCapitals (country: Country): Mono<String> {
		return Mono.just(country.name.uppercase(Locale.US))
	}
}

data class Country(val name: String, val currency: String, val population: Long)
