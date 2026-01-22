package adapter.before.security

/**
 * Client
 */
interface UserDetailsService {
    fun loadUser(username: String): UserDetails
}
