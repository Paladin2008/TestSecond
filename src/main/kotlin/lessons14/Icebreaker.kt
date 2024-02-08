package lessons14

class Icebreaker(
    name: String = "Ледокол",
    capacityPassengers: Int = 30,
    maxSpeed: Int = 40,
    capacityLifting: Int = 10,
) : Liner(name, capacityPassengers, maxSpeed, capacityLifting, abilityCrushIce = true)