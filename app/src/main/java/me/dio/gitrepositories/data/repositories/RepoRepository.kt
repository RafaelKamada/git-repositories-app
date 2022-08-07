package me.dio.gitrepositories.data.repositories

import kotlinx.coroutines.flow.Flow
import me.dio.gitrepositories.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>
}