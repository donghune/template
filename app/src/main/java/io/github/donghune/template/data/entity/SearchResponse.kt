import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponse<T>(
    @SerialName("total_count") val totalCount: Int,
    @SerialName("incomplete_results") val incompleteResults: Boolean,
    @SerialName("items") val items: List<T>
)

@Serializable
data class RepositoryResponse(
    @SerialName("id") val id: Long,
    @SerialName("node_id") val nodeId: String,
    @SerialName("name") val name: String,
    @SerialName("full_name") val fullName: String,
    @SerialName("private") val isPrivate: Boolean,
    @SerialName("owner") val owner: OwnerResponse,
    @SerialName("html_url") val htmlUrl: String,
    @SerialName("description") val description: String?,
    @SerialName("fork") val isFork: Boolean,
    @SerialName("url") val url: String,
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String,
    @SerialName("pushed_at") val pushedAt: String,
    @SerialName("homepage") val homepage: String?,
    @SerialName("size") val size: Int,
    @SerialName("stargazers_count") val stargazersCount: Int,
    @SerialName("watchers_count") val watchersCount: Int,
    @SerialName("language") val language: String?,
    @SerialName("forks_count") val forksCount: Int,
    @SerialName("open_issues_count") val openIssuesCount: Int,
    @SerialName("master_branch") val masterBranch: String?,
    @SerialName("default_branch") val defaultBranch: String,
    @SerialName("score") val score: Double,
    @SerialName("archived") val isArchived: Boolean,
    @SerialName("disabled") val isDisabled: Boolean
)

@Serializable
data class UserResponse(
    @SerialName("id") val id: Long,
    @SerialName("login") val login: String,
    @SerialName("node_id") val nodeId: String,
    @SerialName("avatar_url") val avatarUrl: String,
    @SerialName("gravatar_id") val gravatarId: String,
    @SerialName("url") val url: String,
    @SerialName("html_url") val htmlUrl: String,
    @SerialName("followers_url") val followersUrl: String,
    @SerialName("following_url") val followingUrl: String,
    @SerialName("gists_url") val gistsUrl: String,
    @SerialName("starred_url") val starredUrl: String,
    @SerialName("subscriptions_url") val subscriptionsUrl: String,
    @SerialName("organizations_url") val organizationsUrl: String,
    @SerialName("repos_url") val reposUrl: String,
    @SerialName("events_url") val eventsUrl: String,
    @SerialName("received_events_url") val receivedEventsUrl: String,
    @SerialName("type") val type: String,
    @SerialName("site_admin") val isSiteAdmin: Boolean,
    @SerialName("score") val score: Double,
    @SerialName("name") val name: String?,
    @SerialName("company") val company: String?,
    @SerialName("blog") val blog: String?,
    @SerialName("location") val location: String?,
    @SerialName("email") val email: String?,
    @SerialName("hireable") val isHireable: Boolean?,
    @SerialName("bio") val bio: String?,
    @SerialName("public_repos") val publicRepos: Int,
    @SerialName("public_gists") val publicGists: Int,
    @SerialName("followers") val followers: Int,
    @SerialName("following") val following: Int,
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String
)

@Serializable
data class OwnerResponse(
    @SerialName("login") val login: String,
    @SerialName("id") val id: Long,
    @SerialName("node_id") val nodeId: String,
    @SerialName("avatar_url") val avatarUrl: String,
    @SerialName("gravatar_id") val gravatarId: String,
    @SerialName("url") val url: String,
    @SerialName("html_url") val htmlUrl: String,
    @SerialName("followers_url") val followersUrl: String,
    @SerialName("following_url") val followingUrl: String,
    @SerialName("gists_url") val gistsUrl: String,
    @SerialName("starred_url") val starredUrl: String,
    @SerialName("subscriptions_url") val subscriptionsUrl: String,
    @SerialName("organizations_url") val organizationsUrl: String,
    @SerialName("repos_url") val reposUrl: String,
    @SerialName("events_url") val eventsUrl: String,
    @SerialName("received_events_url") val receivedEventsUrl: String,
    @SerialName("type") val type: String,
    @SerialName("site_admin") val isSiteAdmin: Boolean
)