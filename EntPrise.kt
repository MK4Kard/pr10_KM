fun main(){
    try{
        println("Введите примерный и фактический объем дохода")
        val One = Quotient("One", readln()!!.toDouble(), readln()!!.toDouble())
        One.Quality()
        One.Info()
        println()
        println("Введите примерный и фактический объем дохода")
        val Two = DesQuo("Two", readln()!!.toDouble(), readln()!!.toDouble())
        println("Введите процент налогов")
        Two.P(readln()!!.toInt())
        Two.Quality()
        Two.Info()
        Two.State()
        println()
        println("Введите дату регистрации")
        val Comp = Company("COMP", true, readln()!!.toInt(), readln()!!.toInt(), readln()!!.toInt())
        Comp.Registration()
        Comp.Info()
    }
    catch (e:Exception){
        println("неверные данные")
    }
}
