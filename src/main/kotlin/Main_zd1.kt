// задание 1_2_1
// Задача №1 - Денежные переводы

fun main() {
    calculateTransfer(859860.0)
}

fun calculateTransfer(amountKop: Double) {

    val minCommission = 3500
    val commissionKop = (amountKop * 0.75) / 100

    val resultCommission =
        if (commissionKop <= minCommission) minCommission else commissionKop


    println("Коммисия  $resultCommission.копеек")
}


