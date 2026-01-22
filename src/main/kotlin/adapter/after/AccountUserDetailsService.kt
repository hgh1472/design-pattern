package adapter.after

import adapter.after.security.UserDetails
import adapter.after.security.UserDetailsService

/**
 * Adapter
 */
class AccountUserDetailsService(
    private val accountService: AccountService,
) : UserDetailsService {
    override fun loadUser(username: String): UserDetails {
        val account = accountService.findAccountByUsername(username)
        return AccountUserDetails(account)
    }
}
