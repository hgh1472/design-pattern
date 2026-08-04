package facade.after

fun main() {
    val emailSettings = EmailSettings("127.0.0.1")
    val emailSender = EmailSender(emailSettings)
    val emailMessage = EmailMessage("me", "you", "test", "test")
    emailSender.sendEmail(emailMessage)
}
