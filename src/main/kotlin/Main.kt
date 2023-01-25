fun main() {
    // Arrays
    val numbers:IntArray = intArrayOf(1, 2, 3 , 4, 5, 6)

    // println(numbers.contentToString())
    // println(numbers[0])
    numbers[2] = 10
    for (element in numbers){
        println(element)
    }

    val days = arrayOf("Sun", "Mon", "Tu")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Orange", 3.0))
    println(fruits[1].name)

    // Lists
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2 ,3, true, false, "String", 'c')

    println(anyTypes.size)
    println(months[0])

    for(month in months){
        println(month)
    }

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")

    val newDays = mutableListOf<String>("Mo", "Tu", "Th")
    newDays[2] = "Su"
    newDays.removeAt(0)
}

data class Fruit(val name: String, val price:Double)
