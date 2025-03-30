class DesQuo(val _name: String) : Quotient(_name){
    var p: Int = 0
    fun P(p: Int){
        this.p = p
    }
    constructor(_name: String, _plVol: Double, _acVol: Double) : this(_name){
        acVolume = _acVol
        plVolume = _plVol
    }
    override fun Quality(){
        q = acVolume/plVolume
        if (p <= 6){
            q -= (q*p/100)
        }
        else {
            q -= 0.2*q
        }
    }
    fun State(){
        if (acVolume >= 1 || plVolume >= 1) {
            if (q > 1) {
                println("Предприятие выгодное")
            } else if (q > 0.95 && q == 1.0) {
                println("Предприятие не приносит прибыль")
            } else {
                println("Предприятие убыточное")
            }
        }
    }

    override fun Info() {
        if (acVolume >= 1 || plVolume >= 1) {
            println(
                "Предприятие - ${name}\n" +
                        "Плановый объем розничного товарооборота: ${plVolume}\n" +
                        "Фактический объем розничного товарооборота: ${acVolume}\n" +
                        "Качество предприятия: ${String.format("%.2f", q)}\n" +
                        "Процент налога: ${p}"
            )
        }
        else {
            println("неверные данные")
        }
    }
}
