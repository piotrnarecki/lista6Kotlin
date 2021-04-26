import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.function.DoubleToLongFunction

open class Boat (var name:String,var length:Double, var yearOfProduction:Int){



    init {
        this.name=name
        this.length = length
        this.yearOfProduction = yearOfProduction

    }

    open fun printBoat(){
        println("$name")
        println("length: $length ft")
        println("year of production: $yearOfProduction")

    }


    open fun calculateAge():Int{
        val date = this.yearOfProduction
        val currentDate = LocalDate.now()
        val today = currentDate.format(DateTimeFormatter.ofPattern("yyyy"))
        val age = today.toInt() - date.toInt()

        return age
    }

}