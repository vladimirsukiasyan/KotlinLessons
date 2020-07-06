/**
 * Так как в Java нет параметров по умолчанию и там приходится использовать перегрузку
 * констркуторов(множество конструкторов с разным наобором пареметров), то Kotlin класс с
 * параметрами по умолчанию после компиляции в байт-код при условии пометки конструктора аннтоцией @JvmOverloads
 * превращается в класс с несколькими конструкторами
 *
 * В виртуальной машине JVM компилятор генерирует дополнительный конструктор
 * без параметров в случае, если все параметры основного конструктора имеют значения по умолчанию.
 */
class User3 @JvmOverloads constructor(val nickname: String, val city: String = "Moscow", val sex: Char = 'M')
class User4 (val nickname: String = "", val city: String = "Moscow", val sex: Char = 'M')

fun main() {
    val user = User4("Nicky")
    val userFromSacramento = User4("Nicky", sex = 'F', city = "Sacramento")
}