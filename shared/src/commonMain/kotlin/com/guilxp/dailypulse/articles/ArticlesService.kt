package com.guilxp.dailypulse.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(private val httpClient: HttpClient) {

    private val country = "us"
    private val category = "technology"
    private val apiKey = "b3f984981b9b4bfbb242e63c2aea8a69"

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse = httpClient.get("https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey").body()
        return response.articles
    }
}