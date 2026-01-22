package prototype.before

class App {
}

fun main() {
    val githubRepository = GithubRepository()
    githubRepository.user = "whiteship"
    githubRepository.name = "live-study"

    val githubIssue = GithubIssue(githubRepository)
    githubIssue.id = 1
    githubIssue.title = "1주차 과제"

    val url = githubIssue.getUrl()
    println(url)
}
