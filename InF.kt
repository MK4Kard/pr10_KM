interface InF {
    val reg: Boolean
    val year: Int
    val month: Int
    val day: Int
    fun Registration(){
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
                                println("День введен неверно")
                            }
                            else {
                                println("Дата регистрации: ${day}/${month}/${year}")
                            }
                        }
                        else if (month%2 == 0) {
                            if (day < 1 || day > 30){
                                println("День введен неверно")
                            }
                            else {
                                println("Дата регистрации: ${day}/${month}/${year}")
                            }
                        }
                        else {
                            if (day < 1 || day > 31){
                                println("День введен неверно")
                            }
                            else {
                                println("Дата регистрации: ${day}/${month}/${year}")
                            }
                        }
                    }
                    else {
                        if (month%2 != 0) {
                            if (day < 1 || day > 30){
                                println("День введен неверно")
                            }
                            else {
                                println("Дата регистрации: ${day}/${month}/${year}")
                            }
                        }
                        else {
                            if (day < 1 || day > 31){
                                println("День введен неверно")
                            }
                            else {
                                println("Дата регистрации: ${day}/${month}/${year}")
                            }
                        }
                    }
                }
            }
        }
        else {
            println("Данная организация не зарегистрирована")
        }
    }
}