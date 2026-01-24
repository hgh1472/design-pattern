package adapter.after

import adapter.after.security.UserDetails

/**
 * Adapter
 */
class AccountUserDetails(
    val account: Account,
) : UserDetails {
    override var username = account.name
    override var password = account.password
}
