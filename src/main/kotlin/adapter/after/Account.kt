package adapter.after

import adapter.after.security.UserDetails

/**
 * Adaptee
 * or
 * Adapter가 될 수도 있음 (implements UserDetails)
 */
class Account(
    var name: String = "",
    override var password: String = "",
    var email: String = "",
) : UserDetails {
    override var username = name
}
