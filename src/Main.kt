fun main() {
    print("введите год: ")
    val god = readLine()!!.toInt()

    // проверка високосный год
    if (god % 4 == 0 && (god % 100 != 0 || god % 400 == 0)) {
        println("$god - високосный год")
        println("колво дней в году: 366")
    } else {
        println("$god - не високосный год")
        println("кол-во дней в году: 365")
    }
}
