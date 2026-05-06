package decorator.after

class SpamFilteringCommentDecorator(
    commentService: CommentService,
) : CommentDecorator(commentService) {
    override fun addComment(comment: String) {
        if (isNotSpam(comment)) {
            super.addComment(comment)
        }
    }

    private fun isNotSpam(comment: String): Boolean = !comment.contains("http")
}
