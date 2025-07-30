package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Stay Informed",
        description = "Get the latest breaking news and trending stories from around the world, all in one place.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Personalized For You",
        description = "Choose your interests and we'll show you the stories that matter most to you.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Fast & Reliable",
        description = "Enjoy a clean, fast, and reliable news reading experience anytime, anywhere.",
        image = R.drawable.onboarding3
    )
)