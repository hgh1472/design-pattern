package prototype.example

import prototype.after.GithubIssue
import prototype.after.GithubRepository

class ModelMapperExample {
}

fun main() {
    val repository = GithubRepository()
    repository.user = "Whiteship"
    repository.name = "live-study"

    val githubIssue = GithubIssue(repository)
    githubIssue.id = 1
    githubIssue.title = "1주차 과제"

    // TODO ModelMapper
    /**
     * val modelMapper = ModelMapper()
     * val githubIssueData = modelMapper.map(githubIssue, GithubIssueData::class.java)
     * println(githubIssueData)
     */
}
