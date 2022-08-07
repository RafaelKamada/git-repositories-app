package me.dio.gitrepositories.domain

import kotlinx.coroutines.flow.Flow
import me.dio.gitrepositories.core.UseCase
import me.dio.gitrepositories.data.model.Repo
import me.dio.gitrepositories.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
): UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}