import kotlin.math.E

abstract class Animal {
    var name: String = ""
    abstract fun move()
}

class Tiger: Animal(){
    var age: Int = 0
    override fun move(){
        println("네 발로 이동한다.")
    }
}

class Eagle: Animal(){
    var home: String = ""
    override fun move(){
        println("날개로 날아간다.")
    }
}

fun main(){
    //var tiger1 = Tiger()
    //var eagle1 = Eagle()

    //tiger1.move()
    //eagle1.move()

    var animal : Animal //Animal() 이 아님.

    animal = Tiger()
    animal.move()   //Tiger.move()

    animal = Eagle()
    animal.move()   //Eagle.move
}