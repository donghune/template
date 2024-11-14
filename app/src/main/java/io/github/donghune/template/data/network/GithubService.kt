package io.github.donghune.template.data.network

import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {
    /**
     * search repository
     * "https://api.github.com/search/repositories?q={query}{&page,per_page,sort,order}"
     */
    @GET("search/repositories")
    fun searchRepository(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int,
        @Query("sort") sort: Int,
        @Query("order") order: Int,
    )

    /**
     * repository detail
     * "https://api.github.com/repos/{owner}/{repo}"
     */
    @GET("repos/{owner}/{repo}")
    fun getRepositoryDetail(
        @Field("owner") owner: String,
        @Field("repo") repo: String,
    )

    /**
     * search user
     * "https://api.github.com/search/users?q={query}{&page,per_page,sort,order}"
     */
    @GET("search/users")
    fun searchUser(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int,
        @Query("sort") sort: Int,
        @Query("order") order: Int,
    )

    /**
     * user detail
     * "https://api.github.com/users/{user}"
     */
    @GET("users/{user}")
    fun getUserDetail(
        @Field("user") user: String,
    )
}