class User6(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

class LengthCounter {
    //get() сгегерирован по умолчанию
    var counter: Int = 0
        private set


    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val user = User6("Alice")
    //вызовет set() и передаст value
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}
