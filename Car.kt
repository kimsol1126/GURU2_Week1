open class Car{ //상속을 위한 open
    var color : String = ""
    var speed : Int = 0

    constructor(color: String, speed: Int){
        this.color = color
        this.speed = speed
        carCount++
    }

    constructor(speed: Int){
        this.speed = speed
        carCount++
    }

    constructor(color: String){
        this.color = color
        carCount++
    }

    constructor(){}

    companion object{
        var carCount: Int = 0
        const val MAXSPEED: Int = 200
        const val MINSPEED: Int = 0
        fun currentCarCount(): Int{
            return carCount
        }
    }

    open fun upSpeed(value: Int){
        if (speed + value >= 200)
            speed = 200
        else
            speed = speed + value
    }
    fun downSpeed(value: Int){
        if (speed - value <= 0)
            speed = 0
        else
            speed = speed - value
    }
}

class Automobile: Car{ //서브클래스
    var seatNum: Int = 0

    constructor(){}

    fun countSeatNum(): Int{
        return seatNum
    }

    override fun upSpeed(value: Int){
        if (speed + value >= 300)
            speed = 300
        else
            speed = speed + value
    }
}

fun main(){
    var myCar1 : Car = Car("빨강",0)    //생성자
    var myCar2 : Car = Car("노랑",0)    //생성자
    var myCar3 : Car = Car("파랑",0)    //생성자
    var auto:  Automobile = Automobile()
    auto.upSpeed(250)
    println("승용차의 속도는 " + auto.speed + "km입니다..")

    myCar1.upSpeed(30)
    println("자동차1의 색상은 " + myCar1.color + "이며, 속도는 " + myCar1.speed + "입니다.")
    myCar2.upSpeed(100)
    println("자동차2의 색상은 " + myCar2.color + "이며, 속도는 " + myCar2.speed + "입니다.")
    myCar3.upSpeed(250)
    println("자동차3의 색상은 " + myCar3.color + "이며, 속도는 " + myCar3.speed + "입니다.")

    println("생산된 차의 대수(정적 필드) ==> " + Car.carCount)
    println("생산된 차의 대수(정적 메소드) ==> " + Car.currentCarCount())
    println("차의 최고 제한 속도 ==> " + Car.MAXSPEED)

    println("PI의 값 ==> " + Math.PI)
    println("3의 5제곱 ==> " + Math.pow(3.0, 5.0))


}