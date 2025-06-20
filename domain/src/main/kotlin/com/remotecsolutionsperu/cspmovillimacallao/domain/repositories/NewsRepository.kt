package com.remotecsolutionsperu.cspmovillimacallao.domain.repositories

import com.remotecsolutionsperu.cspmovillimacallao.domain.entities.news.News

interface NewsRepository {
    suspend fun getAllNews(): List<News>
    suspend fun getNewsDetail(newsId: String): News
}