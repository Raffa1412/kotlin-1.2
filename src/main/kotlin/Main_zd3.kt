// Задача №3 - "Меломан"

fun main() {
    calculateDiscount(150.0, 1250.0, false)
}

fun calculateDiscount(purchase: Double, total: Double, musicLover: Boolean) {

    val discount = (purchase * 3)/ 100 // пусть будет стандартная скидка. вместо 100рублей
    val discountMax = (purchase * 5) / 100

    if (purchase <= 0 || total <= 0) {
        println("Одно из зачений нулевое")
    } else {

        val discountTotal = when (total) {
            in 0.0..1000.0 -> 0.0
            in 1001.0..10000.0 -> discount
            in 10001.0..Double.MAX_VALUE -> discountMax

            else -> 0.0
        }
        val purchaseDis = purchase - discountTotal

        if (musicLover) {
            val disMusicLovTotal = (purchaseDis * 1) / 100
            val purchaseDisLovMus = purchaseDis - disMusicLovTotal
            println("Вы меломан вам дополнительная кидка: $disMusicLovTotal Вы заплатите: $purchaseDisLovMus")
        } else {
            println("Скидка: $discountTotal Вы заплатите: $purchaseDis ")
        }
    }
}








