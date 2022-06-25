package com.reactivekatas

import reactor.core.publisher.Mono
import java.util.*

class CountriesExercisesCoroutine {

    suspend fun countryNameInCapitals (country: Country): String {
		return country.name.uppercase(Locale.US)
	}
}