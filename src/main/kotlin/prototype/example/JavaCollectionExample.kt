package prototype.example

import java.util.ArrayList

class JavaCollectionExample {
}

fun main() {
    val whiteship = Student("whiteship")
    val bluewhale = Student("bluewhale")
    val students = mutableListOf<Student>()
    students.add(whiteship)
    students.add(bluewhale)

    val clone = ArrayList(students)
    println(clone)
}
