fun main() {
    var gari = Car("Subaru", "Subaru legacy", "Black", 5)
    gari.carry(7)
    gari.identity("white","subaru","legacy")
    println(gari.calculateParkingFees(6))
    var head =Bus("Scania","Isuzu","white",64,60.5)
    println(head.maxTripFare(60.5))
    println(head.calculateParkingFees(4))

}
 open class Car(var make:String,var model:String, var color:String,var capacity:Int) {
    fun carry(people: Int, ) {
        var x = people - capacity
        if (people <= capacity) {
            println("i am carrying $people passengers")
        } else {
            println("over capacity by $x passengers")
        }
    }

    fun identity(color: String, make: String, model: String) {
        println(" I am $color $make $model")

    }

   open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }
}
class Bus( make:String, model:String,  color:String, capacity:Int,fare:Double):Car(make,model, color,capacity){
    fun maxTripFare(fare: Double):Double{
        return(capacity*fare)

    }
     override fun calculateParkingFees(hours: Int):Int{
        return(capacity * hours)
    }

}





