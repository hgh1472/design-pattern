package bridge.usage

import java.sql.DriverManager

/**
 * Driver -> 최상위 인터페이스
 * 여러 구현체가 있음 -> H2 등
 * DriverManager, Connection, Statement -> Abstraction
 * Driver -> Implementation
 */
fun main() {
    Class.forName("org.h2.Driver")

    val conn =
        DriverManager
            .getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "")
            .use {
                val sql =
                    """
                    CREATE TABLE ACCOUNT (
                    id integer not null,
                    email varchar(255),
                    password varchar(255),
                    primary key (id)
                    )
                    """.trimIndent()
                val statement = it.createStatement()
                statement.execute(sql)
            }
}
