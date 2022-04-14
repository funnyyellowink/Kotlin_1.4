fun main(){
    //commissionCalc(1,10000,0)
}
fun commissionCalc(paymentType : Int, sumToCalc: Int, previousSum: Int): Double {
    println(
        "Выберите тип оплаты:" +
                "\n1. Mastercard или Maestro" +
                "\n2. Visa или Мир" +
                "\n3. VK Pay"
    )
    //val paymentType = readLine()?.toIntOrNull()
    println("Введите сумму перевода в рублях")
    //val sumToCalc = readLine()?.toIntOrNull()
    //val previousSum = 0
    var commission = 0.0
    when (paymentType) {
        1 -> when (previousSum) {
            in 300..75000 -> commission = 0.0
            else -> if (sumToCalc != null) {
                commission = 20 + sumToCalc * 0.006
            }
        }
        2 -> if (sumToCalc != null) {
            commission = 35 + sumToCalc * 0.0075
        }
        3 -> commission = 0.0
    }
    println("Сумма перевеода: $sumToCalc" +
            "\nКомиссия за перевод : $commission")
    return commission
}