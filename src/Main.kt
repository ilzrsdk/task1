//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    print("Введите текст: ")
    val s = readln()
    val str = s.uppercase()
    var str2 = ""
    var count = 1
    for (i in 0 until str.length - 1) {
        if (str[i] == str[i+1]) {
            count++
        }else {
            str2 += str[i]
            if (count >= 2)
            {
                str2 += count
            }
            count = 1
        }
    }
    str2 += str[str.length-1]
    if (count >= 2)
    {str2 += count}
    println(str2)

}
