package adapter.after

import adapter.after.security.LoginHandler

fun main() {
    val accountService = AccountService()
    val userDetailsService = AccountUserDetailsService(accountService)
    val loginHandler = LoginHandler(userDetailsService)
    val login = loginHandler.login("gunha", "gunha")
    println(login)
}
