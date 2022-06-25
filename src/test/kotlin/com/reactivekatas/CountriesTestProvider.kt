package com.reactivekatas


object CountriesTestProvider {
    const val CURRENCY_EUR = "EUR"
    const val CURRENCY_PLN = "PLN"
    const val CURRENCY_GBP = "GBP"
    const val CURRENCY_UAH = "UAH"
    const val CURRENCY_CHF = "CHF"
    val countries = listOf(
        Country("Germany", CURRENCY_EUR, 80620000)
        ,Country("France", CURRENCY_EUR, 66030000)
        ,Country("United Kingdom", CURRENCY_GBP, 64100000)
        ,Country("Poland", CURRENCY_PLN, 38530000)
        ,Country("Ukraine", CURRENCY_UAH, 45490000)
        ,Country("Austria", CURRENCY_EUR, 8474000)
        ,Country("Switzerland", CURRENCY_CHF, 8081000)
        ,Country("Luxembourg", CURRENCY_EUR, 576249)
    )

    fun countriesPopulationMoreThanOneMillion() = countries
        .filter { it.population > 10_00_000 }

    fun populationOfCountries() = countries.map { it.population }

    fun namesOfCountries() = countries.map { it.name }

    fun sumPopulationOfAllCountries() = countries.sumOf { it.population }
}
