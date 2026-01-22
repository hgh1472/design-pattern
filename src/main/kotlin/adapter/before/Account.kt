package adapter.before

/**
 * 다른 어플리케이션은 name이 아닌 다른 것을 쓸 수도 있음
 */
class Account(
    var name: String = "",
    var password: String = "",
    var email: String = "",
)
