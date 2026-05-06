package decorator.after

class DefaultCommentService : CommentService {
    override fun addComment(comment: String) {
        println(comment)
    }
}
