package factorymethod.java

import java.util.Calendar
import java.util.Locale

class CalendarExample {
}

fun main() {
    println(Calendar.getInstance()::class.java)
    println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH"))::class.java)
    println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP"))::class.java)

    /**
     * IoC컨테이너(빈 팩토리) 또한 팩토리 메서드 패턴이다.
     * val factory = ClassPathXmlApplicationContext("factorymethod/java/beans.xml")
     * val hello = xmlFactory.getBean("hello", String::class.java)
     */
}
