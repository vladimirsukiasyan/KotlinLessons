fun main(){
    val user = User("Patrick")
    val user1 = User1("Patrick")
    val user2 = User2("Patrick")
}

class User constructor(_nickname: String){
    val nickname: String

    init {
        nickname = _nickname
    }
}

class User1 constructor(_nickname: String){
    val nickname = _nickname
}

class User2 constructor(val nickname: String)