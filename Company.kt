class Company(val name: String, val _reg: Boolean, val _year: Int,
              val _month: Int, val _day: Int) : InF {
    var info: String = ""
    override val reg = _reg
    override val year = _year
    override val month = _month
    override val day = _day
    override fun Registration(){
        if (reg){
            if (year < 1990 || year > 2025){
                println("Год введен неверно")
            }
            else {
                if (month < 1 || month > 12){
                    println("Месяц введен неверно")
                }
                else {
                    if (month < 8){
                        if (month == 2){
                            if (day < 1 || day > 28){
                                return println("День введен неверно")
                            }
                            else {
                                info = "${day}/${month}/${year}"
                            }
                        }
                        else if (month%2 == 0) {
                            if (day < 1 || day > 30){
                                return println("День введен неверно")
                            }
                            else {
                                info = "${day}/${month}/${year}"
                            }
                        }
                        else {
                            if (day < 1 || day > 31){
                                return println("День введен неверно")
                            }
                            else {
                                info = "${day}/${month}/${year}"
                            }
                        }
                    }
                    else {
                        if (month%2 != 0) {
                            if (day < 1 || day > 30){
                                return println("День введен неверно")
                            }
                            else {
                                info = "${day}/${month}/${year}"
                            }
                        }
                        else {
                            if (day < 1 || day > 31){
                                return println("День введен неверно")
                            }
                            else {
                                info = "${day}/${month}/${year}"
                            }
                        }
                    }
                }
            }
        }
        else {
            return println("Данная организация не зарегистрирована")
        }
    }
}