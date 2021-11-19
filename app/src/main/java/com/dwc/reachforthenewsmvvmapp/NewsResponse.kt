package com.dwc.reachforthenewsmvvmapp

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)