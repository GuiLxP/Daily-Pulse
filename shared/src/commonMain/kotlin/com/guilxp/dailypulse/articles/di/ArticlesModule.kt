package com.guilxp.dailypulse.articles.di

import com.guilxp.dailypulse.articles.ArticlesService
import com.guilxp.dailypulse.articles.ArticlesUseCase
import com.guilxp.dailypulse.articles.ArticlesViewModel
import org.koin.dsl.module

val articleModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}