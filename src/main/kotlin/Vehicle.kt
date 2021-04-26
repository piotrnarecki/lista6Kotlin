import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class Vehicle {

    val brand: String
    val model: String
    val date: String
    val engineType: String
    val engineCapacity: String
    val enginePower: String

    constructor(
        brand: String = "Unknown",
        model: String = "Unknown",
        date: String = "Unknown",
        engineType: String = "Unknown",
        engineCapacity: String = "Unknown",
        enginePower: String = "Unknown"
    ) {
        this.brand = brand
        this.model = model
        this.date = date
        this.engineType = engineType
        this.engineCapacity = engineCapacity
        this.enginePower = enginePower
    }

    open fun show(){
        println("""
            PARAMETERS OF YOUR VEHICLE:
            Brand: $brand
            Model: $model
            Date of production: $date
            Engine type: $engineType
            Engine Capacity: $engineCapacity
            Engine Power: $enginePower
            ----------------------------------
        """.trimIndent())
    }

    fun age (){
        val currentDate = LocalDate.now()
        val date1 = currentDate.format(DateTimeFormatter.ofPattern("yyyy"))
        val age = date1.toInt() - date.toInt()
        println("""
            Age of your car: $age
            ----------------------------------""".trimIndent())
    }

}
