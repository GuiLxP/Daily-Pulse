package com.guilxp.dailypulse.di

import com.guilxp.dailypulse.articles.di.articleModule

val sharedKoinModules = listOf(
    articleModule,
    networkModule,
)