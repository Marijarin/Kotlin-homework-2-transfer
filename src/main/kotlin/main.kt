package ru.netology

fun main(){
    println("Введите сумму перевода и нажмите Enter")
    val amount = readLine()!!.toInt()
    val feeInProcentum = 0.75
    val feeCalculated = amount*(feeInProcentum/100)
    val feeMin = 3_500

    val feeAmount = if (feeCalculated > feeMin) feeCalculated else feeMin

    println(feeAmount)
}