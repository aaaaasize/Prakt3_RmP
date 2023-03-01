fun main ()
{
    print("Введите А:")
    var A = readLine()!!.toInt()
    print("Введите B:")
    var B = readLine()!!.toInt()
    print("Введите C:")
    var C = readLine()!!.toInt()
    A = A + B + C
    B = A - B - C
    C = A - B -C
    A = A - B -C
    println("A изменила значение на $A")
    println("B изменила значение на $B")
    println("C изменила значение на $C")
}