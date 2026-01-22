package prototype.before

class GithubIssue(
    var id: Int? = null,
    var title: String? = null,
    var repository: GithubRepository? = null
) {
    fun getUrl(): String {
        return "${repository!!.name}/issues/$id"
    }

    companion object {
        operator fun invoke(repository: GithubRepository): GithubIssue {
            return GithubIssue(repository = repository)
        }
    }
}
