class Truck:Vehicle {

    var ownerNameSurname: String
    var numberOfAccidents: Int
    var towingCapacity: Int

    constructor(ownerNameSurname: String = "Unknown", numberOfAccidents: Int = 0, towingCapacity: Int = 2) {
        this.ownerNameSurname = ownerNameSurname
        this.numberOfAccidents = numberOfAccidents
        this.towingCapacity = towingCapacity
    }

    override fun show() {
        println("Owner's Name and Surname: $ownerNameSurname")
        if (this.numberOfAccidents == 0) {
            println("""No accidents in history found
                |-------------------------------------""".trimMargin())
        } else if (this.numberOfAccidents > 0) {
            println("""Number of accidents in history: $numberOfAccidents
                |-------------------------------------""".trimMargin())
        } else{
            this.numberOfAccidents = 0
            println("Number of accidents cannot be negative. Automatically changed to 0")
        }
        if (this.towingCapacity >= 0){
            println("""Towing capacity: $numberOfAccidents
                |-------------------------------------""".trimMargin())
        }else{
            this.towingCapacity = 0
            println("Towing capacity cannot be negative. Automatically changed to 0")
        }
    }

    fun changeOwner(newOwner: String){
        this.ownerNameSurname = newOwner
    }

    fun changeAccidents (newAccidents: Int){
        this.numberOfAccidents = newAccidents
    }

    fun cashOC(vehicle: Vehicle): Double {

        var price = 0.0
        if (this.numberOfAccidents == 0) {
            if (this.engineType == "electric") {
                price = (500.0 + (this.date.toDouble() / 10.0) + this.towingCapacity * 100) * 0.6
            } else if (this.engineType == "hybrid") {
                price =
                    (350.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100) * 0.6
            } else if (this.engineType == "diesel") {
                price =
                    (150.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100) * 0.6
            } else if (this.engineType == "petrol") {
                price =
                    (250.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100) * 0.6
            }

        } else if (this.numberOfAccidents < 2) {
            if (this.engineType == "electric") {
                price = (500.0 + (this.date.toDouble() / 10.0) + this.towingCapacity * 100) * 0.8
            } else if (this.engineType == "hybrid") {
                price =
                    (350.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100) * 0.8
            } else if (this.engineType == "diesel") {
                price =
                    (150.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100) * 0.8
            } else if (this.engineType == "petrol") {
                price =
                    (250.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100) * 0.8
            }

        } else if (this.numberOfAccidents > 2) {
            if (this.engineType == "electric") {
                price = 500.0 + (this.date.toDouble() / 10.0) + this.towingCapacity * 100
            } else if (this.engineType == "hybrid") {
                price =
                    350.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100
            } else if (this.engineType == "diesel") {
                price =
                    150.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100
            } else if (this.engineType == "petrol") {
                price =
                    250.0 + (this.date.toDouble() / 10.0) + this.engineCapacity.toDouble() + this.towingCapacity * 100
            }
        }
        println("OC price will be approximately (PLN):")
        return price
    }

    fun highway(){
        if (this.towingCapacity in 0 until 2){
            println("The toll will be 20 PLN")
        }else if (this.towingCapacity in 2 until 6){
            println("The toll will be 40 PLN")
        }else if (this.towingCapacity in 6 until 15){
            println("The toll will be 60 PLN")
        }else{
            println("The toll will be 100 PLN")
        }
    }



}