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

    // Sets and maps
    val fruitsSet = setOf("Orange", "Apple", "Grape", "Apple")
    print("${fruitsSet.size} \n")

    val newFruits = fruitsSet.toMutableList()
    newFruits.add("Banana")

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2])

    for (key in daysOfTheWeek.keys){
        print("$key is to ${daysOfTheWeek[key]}\n")
    }
    val fruitsMap = mapOf("Favourite" to Fruit("Orange", 2.0), "Ok" to Fruit("Apple", 1.24))
    println(fruitsMap.toSortedMap())

    val newDaysOfTheWeek = daysOfTheWeek.toMutableMap()
    newDaysOfTheWeek[4] = "Thursday"
    newDaysOfTheWeek[5] = "Friday"

    println(newDaysOfTheWeek.toSortedMap())

}

data class Fruit(val name: String, val price:Double)
