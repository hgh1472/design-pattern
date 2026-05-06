package decorator.before

open class CommentService {
    open fun addComment(comment: String) {
        println(comment)
    }
}
