fun main(){
    val One = Quotient("One", 140000.0, 125000.0)
    One.Quality()
    One.Info()
    println()
    val Two = DesQuo("Two", 140000.0, 125000.0)
    println("Введите процент налогов")
    Two.P(readln()!!.toInt())
    Two.Quality()
    Two.Info()
    Two.State()

}
