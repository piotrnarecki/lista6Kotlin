class Car:Vehicle {

    var ownerNameSurname: String
    var numberOfAccidents: Int

    constructor(ownerNameSurname: String = "Unknown", numberOfAccidents: Int = 0) {
        this.ownerNameSurname = ownerNameSurname
        this.numberOfAccidents = numberOfAccidents
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
    }

    fun changeOwner(newOwner: String){
        this.ownerNameSurname = newOwner
    }

    fun changeAccidents (newAccidents: Int){
        this.numberOfAccidents = newAccidents
    }

    fun cashOC(vehicle: Vehicle): Double {




        var price = 0.0

        var date = this.date
        var engineType = this.engineType
        var engineCapacity = this.engineCapacity

        println("Variables test $date $engineType $engineCapacity")

        if (this.numberOfAccidents  == 0){
            if (this.engineType  == "electric"){
                price = (500.0 + (this.date.toDouble()/10.0)) * 0.6
            }else if (this.engineType  == "hybrid"){
                price = (350.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()) * 0.6
            }else if (this.engineType  == "diesel"){
                price = (150.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()) * 0.6
            }else if (this.engineType  == "petrol"){
                price = (250.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()) * 0.6
            }

        }else if (this.numberOfAccidents < 2){
            if (this.engineType  == "electric"){
                price = (500.0 + (this.date.toDouble()/10.0)) * 0.8
            }else if (this.engineType  == "hybrid"){
                price = (350.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()) * 0.8
            }else if (this.engineType  == "diesel"){
                price = (150.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()) * 0.8
            }else if (this.engineType  == "petrol"){
                price = (250.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()) * 0.8
            }

        }else if (this.numberOfAccidents > 2) {
            if (this.engineType  == "electric"){
                price = 500.0 + (this.date.toDouble()/10.0)
            }else if (this.engineType  == "hybrid"){
                price = 350.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()
            }else if (this.engineType  == "diesel"){
                price = 150.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()
            }else if (this.engineType  == "petrol"){
                price = 250.0 + (this.date.toDouble()/10.0) + this.engineCapacity.toDouble()
            }
        }
        println("OC price will be approximately (PLN):")
        return price
    }

}