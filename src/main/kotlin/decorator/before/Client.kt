package decorator.before

class Client(
    commentService: CommentService,
) {
    private var commentService: CommentService = commentService

    fun writeComment(comment: String) {
        commentService.addComment(comment)
    }
}

fun main() {
    val client = Client(TrimmingCommentService())
    client.writeComment("오징어게임")
    client.writeComment("보는게 하는 것 보다 재밌을 수가 없지...")
}
