package bridge.usage

import com.sun.org.slf4j.internal.LoggerFactory

class Example

/**
 * 어떤 Logger를 쓰던 상관없이 Slf4j의 인터페이스 사용
 */
fun main() {
    val logger = LoggerFactory.getLogger(Example::class.java)

    logger.warn("")
}
