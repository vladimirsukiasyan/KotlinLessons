import kotlin.math.sqrt

class Human(
        val name: String, // неизменяемое свойство. Для него будут созданы поле и метод чтения get()
        var city: String //изменяемое свойство: поле, методы чтеня и записи get(), set()
)

class Rectangle(val height:Int, val width:Int){
    val isSquare: Boolean
    get(){
        return height == width
    }
}