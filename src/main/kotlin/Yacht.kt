class Yacht(name: String, length: Double, yearOfProduction: Int) : Boat(name, length, yearOfProduction) {

    var numberOfSails = 1
    var totalSailsArea = 10.0


    init {
        this.name = name
        this.length = length
        this.yearOfProduction = yearOfProduction
    }

    constructor(
        name: String,
        length: Double,
        yearOfProduction: Int,
        numberOfSailsInput: Int,
        totalSailsAreaInput: Double
    ) :
            this(name, length, yearOfProduction) {

        this.name = name
        this.length = length
        this.yearOfProduction = yearOfProduction
        numberOfSails = numberOfSailsInput
        totalSailsArea = totalSailsAreaInput

    }

    override fun printBoat() {
        println("$name")
        println("length: $length ft")
        println("year of production: $yearOfProduction")
        println("$numberOfSails sails")
        println("total sails area $totalSailsArea m2")


    }

    fun calculateOC() {

        var OC = calculateAge() * 10 + 2 * numberOfSails

        println("OC costs $OC $")


    }


    //numberOfSails:Int,totalSailsArea:Double


}