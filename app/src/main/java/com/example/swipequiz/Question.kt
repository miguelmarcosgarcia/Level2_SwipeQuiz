package com.example.swipequiz

data class Question(
    var question: String,
    var ok: Boolean
) {
    companion object {
        val QUESTIONS = arrayOf(
            "Spain won the football World cup in 2010 against the Netherlands",
            "Mobile Application Development grants 12 ECTS.",
            "Kotlin is prefered by Google to develop Android apps",
            "Mobile Application Development course is boring"
        )

        val OK = arrayOf(
            true,
            false,
            true,
            false
        )
    }
}