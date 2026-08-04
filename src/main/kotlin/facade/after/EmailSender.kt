package facade.after

class EmailSender(
    private val emailSettings: EmailSettings,
) {
    fun sendEmail(emailMessage: EmailMessage) {
    }
}
