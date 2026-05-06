package decorator.after

class App(
    var enabledSpamFilter: Boolean,
    var enabledTrimming: Boolean,
) {
    fun run() {
        var commentService: CommentService = DefaultCommentService()

        // 데코레이터가 데코레이터를 감싸면서 추가됨
        if (enabledSpamFilter) {
            commentService = SpamFilteringCommentDecorator(commentService)
        }
        if (enabledTrimming) {
            commentService = TrimmingCommentDecorator(commentService)
        }

        val client = Client(commentService)
        client.writeComment("오징어 게임")
        client.writeComment("보는게 하는거보다 재밌을 수가 없지...")
        client.writeComment("http://~")
    }
}
