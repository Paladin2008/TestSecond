package lessons14

class Freight(
    name: String = "Грузовой",
    capacityPassengers: Int = 30,
    maxSpeed: Int = 60,
    capacityLifting: Int = 40,
) : Liner(name, capacityPassengers, maxSpeed, capacityLifting)