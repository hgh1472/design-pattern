package adapter.after.security

/**
 * Client
 */
interface UserDetailsService {
    fun loadUser(username: String): UserDetails
}
