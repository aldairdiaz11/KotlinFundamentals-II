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
}

data class Fruit(val name: String, val price:Double)
