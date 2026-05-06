package decorator.before

class TrimmingCommentService : CommentService() {
    @Override
    override fun addComment(comment: String) {
        super.addComment(trim(comment))
    }

    private fun trim(comment: String): String = comment.replace("...", "")
}
