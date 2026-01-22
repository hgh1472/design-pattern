package prototype.after

class App {
}

fun main() {
    val githubRepository = GithubRepository()
    githubRepository.user = "whiteship"
    githubRepository.name = "live-study"

    val githubIssue = GithubIssue.Companion(githubRepository)
    githubIssue.id = 1
    githubIssue.title = "1주차 과제"

    val url = githubIssue.getUrl()
    println(url)

    val clone = githubIssue.clone() as GithubIssue
    println(clone.getUrl())

    githubRepository.name = "Hwang"

    println(clone !== githubIssue)
    println(clone.equals(githubIssue))
    println(clone::class.java == githubIssue::class.java)
    println(clone.repository == githubIssue.repository)

    println(clone.getUrl())
}
