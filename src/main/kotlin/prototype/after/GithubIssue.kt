package prototype.after

class GithubIssue(
    var id: Int? = null,
    var title: String? = null,
    var repository: GithubRepository? = null
): Cloneable {
    fun getUrl(): String {
        return "${repository!!.name}/issues/$id"
    }

    @Override
    public override fun clone(): Any {
        // depp copy
        val githubRepository = GithubRepository()
        githubRepository.user = this.repository?.user
        githubRepository.name = this.repository?.name

        val githubIssue = GithubIssue(githubRepository)
        githubIssue.id = this.id
        githubIssue.title = this.title

        return githubIssue

        /**
         * shallow copy
         * return super.clone()
         */
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GithubIssue

        if (id != other.id) return false
        if (title != other.title) return false
        if (repository != other.repository) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + (title?.hashCode() ?: 0)
        result = 31 * result + (repository?.hashCode() ?: 0)
        return result
    }

    companion object {
        operator fun invoke(repository: GithubRepository): GithubIssue {
            return GithubIssue(repository = repository)
        }
    }
}
