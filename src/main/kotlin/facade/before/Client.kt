package facade.before

// mail 라이브러리 의존성

fun main() {
    val to = "test1@test.com"
    val from = "test2@test.com"
    val host = "127.0.0.1"

    val properties = System.getProperties()
    properties.setProperty("mail.smtp.host", host)

    try {
        // message = new MimeMessage()
//        message.setFrom()
//        message.addRecipient()
//        message.setSubjedcdt()
//        message.setText()
//        Transport.send(message)
    } catch (e: Exception) {
    }
}
