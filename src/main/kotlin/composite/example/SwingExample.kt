package composite.example

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextField

fun main() {
    // composite
    val frame = JFrame()

    // leaf
    val textField = JTextField()
    textField.setBounds(200, 200, 200, 40)
    frame.add(textField)

    // leaf
    val button = JButton("click")
    button.setBounds(200, 100, 60, 40)
    button.addActionListener { textField.text = "Hello Swing" }

    frame.add(button)

    frame.setSize(600, 400)
    frame.layout = null
    frame.isVisible = true
}
