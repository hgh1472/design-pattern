package decorator.before

class SpamFilteringCommentService : CommentService() {
    @Override
    override fun addComment(comment: String) {
        super.addComment(comment)
    }
}
