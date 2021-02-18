// 1.2.2
// Задача №2 - "Люди/Человеки"

fun main() {
    likesInscription(11)
}

fun likesInscription(like: Int) {
    val stringLike = like.toString()
    val lastIndex = stringLike.lastIndex
    val lastValue = stringLike[lastIndex]

    if (stringLike == "11") {
        println("Понравилось $like людям")
    } else {
        when (lastValue) {
            '1' -> println("Понравилось $like человеку")
            '2' -> println("Понравилось $like людям")
            '3' -> println("Понравилось $like людям")
            '4' -> println("Понравилось $like людям")
            '5' -> println("Понравилось $like людям")
            '6' -> println("Понравилось $like людям")
            '7' -> println("Понравилось $like людям")
            '8' -> println("Понравилось $like людям")
            '9' -> println("Понравилось $like людям")
            '0' -> println("Понравилось $like людям")
        }
    }
}

