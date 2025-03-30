open class Quotient(_name: String): Enterprise(_name) {
    open var q: Double = 0.0
    open var acVolume: Double = 0.0
    open var plVolume: Double = 0.0
    constructor(_name: String, _plVol: Double, _acVol: Double) : this(_name){
        acVolume = _acVol
        plVolume = _plVol
    }
    open fun Quality(){
        q = acVolume/plVolume
    }
    override fun Info(){
        if (acVolume >= 1 || plVolume >= 1) {
            println(
                "Предприятие - ${name}\n" +
                        "Плановый объем розничного товарооборота: ${plVolume}\n" +
                        "Фактический объем розничного товарооборота: ${acVolume}\n" +
                        "Качество предприятия: ${String.format("%.2f", q)}"
            )
        }
        else {
            println("неверные данные")
        }
    }
}
