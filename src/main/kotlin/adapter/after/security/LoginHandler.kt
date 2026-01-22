package adapter.after.security

class LoginHandler(
    private val userDetailsService: UserDetailsService,
) {
    fun login(
        username: String,
        password: String,
    ): String {
        val userDetails = userDetailsService.loadUser(username)
        if (userDetails.password == password) {
            return userDetails.username
        }
        throw RuntimeException("Invalid credentials")
    }
}
