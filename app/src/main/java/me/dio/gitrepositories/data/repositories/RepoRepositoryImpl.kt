package me.dio.gitrepositories.data.repositories

import kotlinx.coroutines.flow.flow
import me.dio.gitrepositories.core.RemoteException
import me.dio.gitrepositories.data.services.GitHubService
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possível fazer a busca no momento!")
        }
    }
}