package adapter.after

import adapter.after.security.UserDetails
import adapter.after.security.UserDetailsService

/**
 * Adaptee
 * or
 * Adapter가 될 수도 있음 (implements UserDetailsService)
 */
class AccountService : UserDetailsService {
    fun findAccountByUsername(username: String): Account {
        val account = Account()
        account.name = username
        account.password = username
        account.email = username
        return account
    }

    fun createAccount(account: Account) {
    }

    fun updateAccount(account: Account) {
    }

    override fun loadUser(username: String): UserDetails = findAccountByUsername(username)
}
