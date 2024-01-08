fun main() {
    agoToText(60)
}

fun agoToText(sec: Int) {
    when {
        sec in 1..59 -> println("был(а) только что")
        sec >= 60 && sec <= 60 * 60 -> println(minutesAgo(sec))
        sec >= 60 * 60 + 1 && sec <= 24 * 60 * 60 -> println(hoursAgo(sec))
        sec >= 24 * 60 * 60 + 1 && sec <= 48 * 60 * 60 -> println("был(а) вчера")
        sec >= 48 * 60 * 60 + 1 && sec <= 72 * 60 * 60 -> println("был(а) позавчера")
        sec >= 72 * 60 * 60 + 1 -> println("был(а) давно")
    }
}

fun minutesAgo(sec: Int) {
    val minute =  sec/ 60
    when {
        minute % 10 == 0 || minute % 10 in 5..9 || minute  in 11..20 -> println("был(а) $minute минут назад")
        minute % 10 == 1 -> println("был(а) $minute минуту назад")
        minute % 10 in 2..4 -> println("был(а) $minute минуты назад")
    }
}

fun hoursAgo(sec: Int) {
    val hour = sec/ (60*60)
    when {
        hour % 10 == 0 || hour % 10 in 5..9 || hour in 11 ..20 -> println("был(а) $hour часов назад")
        hour % 10 == 1 -> println("был(а) $hour час назад")
        hour % 10 in 2..4 -> println("был(а) $hour часа назад")
    }
}