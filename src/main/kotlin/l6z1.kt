fun main() {

    var boat1 = Boat("Orca", 20.0, 1970)

    boat1.printBoat()
    println("${boat1.calculateAge()} years old")




    var yacht1 = Yacht("Kon Tiki", 30.0, 1950, 1, 30.0)
    yacht1.printBoat()

    println("${yacht1.calculateAge()} years old")
    yacht1.calculateOC()


    var motorboat1 = Motorboat("Lightning 900", 50.0, 1985, "V8 petrol", 900)
    motorboat1.printBoat()
    motorboat1.calculateOC()


//    var car = Vehicle("fiat", "", "2013", "electric")
//    car.show()
//    car.age()
//
//
//    var car1 = Car("Monika Glaz", 0)
//    car1.show()
//
//
//    car1.changeOwner("Pawel")
//    car1.show()
//    car1.changeAccidents(3)
//    car1.show()
//
//    println(car1.cashOC(car))
//
//    var truck1 = Vehicle("Scania", "f450", "2018", "diesel", "2.0", "450")
//    var truck = Truck("bb", 2, 2)
//    truck.cashOC(truck1)
//    truck.highway()


}
