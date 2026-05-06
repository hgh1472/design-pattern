package decorator.after

class TrimmingCommentDecorator(
    commentService: CommentService,
) : CommentDecorator(commentService) {
    override fun addComment(comment: String) {
        super.addComment(trim(comment))
    }

    private fun trim(comment: String): String = comment.replace("...", "")
}
