package com.dwc.reachforthenewsmvvmapp.models

import com.dwc.reachforthenewsmvvmapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)