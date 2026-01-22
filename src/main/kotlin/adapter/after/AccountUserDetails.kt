package adapter.after

import adapter.after.security.UserDetails

/**
 * Adapter
 */
class AccountUserDetails(
    val account: Account,
) : UserDetails {
    override val username = account.name
    override val password = account.password
}
