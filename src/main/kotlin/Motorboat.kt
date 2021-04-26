class Motorboat(name: String, length: Double, yearOfProduction: Int) : Boat(name, length, yearOfProduction) {

    var engineType = ""
    var enginePower = 0


    init {
        this.name = name
        this.length = length
        this.yearOfProduction = yearOfProduction
    }

    constructor(
        name: String,
        length: Double,
        yearOfProduction: Int,
        engineTypeInput: String,
        enginePowerInput: Int
    ) :
            this(name, length, yearOfProduction) {

        this.name = name
        this.length = length
        this.yearOfProduction = yearOfProduction
        engineType = engineTypeInput
        enginePower = enginePowerInput

    }

    override fun printBoat() {
        println("$name")
        println("length: $length ft")
        println("year of production: $yearOfProduction")
        println("engine type: $engineType ")
        println("power $enginePower kw")


    }


    fun calculateOC() {

        var OC = calculateAge() + enginePower

        println("OC costs $OC $")


    }


}