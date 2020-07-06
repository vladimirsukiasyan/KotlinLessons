class User5(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    val user = User5("Alice")
    //вызовет set() и передаст value
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}
