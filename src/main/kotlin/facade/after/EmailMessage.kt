package facade.after

class EmailMessage(
    val from: String,
    val to: String,
    val subject: String,
    val body: String,
    val cc: String? = null,
    val bcc: String? = null,
)
