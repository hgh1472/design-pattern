package adapter.before

/**
 * Adaptee
 */
class AccountService {
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
}
