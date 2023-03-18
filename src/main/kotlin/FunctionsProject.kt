import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Scanner

//Приветствие с пользователем. done
fun welcomeProgram(){
    println( "\n -= Экран 1 Приветствие =- \n" +
             "Добро пожаловать в программу по созданию заметок. \n"+
             "\n Нажмите на Enter, чтобы продолжить... \n" )
    var variable = Scanner(System.`in`).nextLine()
}

//Ввод числа. Выбор действия в активном окне. done
fun navigation(variant:Int) : Int {
    println("\n Выберите вариант, введите число: \n")
    while (true){
        var variable_int = Scanner(System.`in`).nextLine()
    try {
        if (variable_int.toInt() >= 0 && variable_int.toInt() < variant)
            { return variable_int.toInt() }
          println("\n Вы ввели некорректное число. Введите число: \n")
    }catch (e: NumberFormatException)
        { println("\n Вы ввели символы. Введите число: \n") }
   }
}

//Прощание с пользователем при выборе выхода из программы. done
fun exitProgram(){
    println("\n -= Экран 8 Экран завершения =- " )
    println("\n Спасибо за внимание! Конец выполнения программы. \n")
}

//Создание архива. done
fun createNameArchivs() : String {
    println("\n Введите название: \n")
    while (true){
        var variable_name = Scanner(System.`in`).nextLine()
        try {
            if (variable_name.length > 7)
            {   val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")
                variable_name = variable_name + " " + LocalDateTime.now().format(formatter)
                println("\n \'${variable_name}\' - создан успешно. \n" + "\n Возвращаемся на предыдущий экран... \n")
                    return variable_name }
            println("\n Введите корректное название, имя должно содержать минимум 8 символов: \n")
        }catch (e: NumberFormatException)
        { println("\n Введите корректное название: \n") }
    }
}

//Ввод текста заметки.done
fun textsIn() : String {
    println("Введите текст заметки: \n")
    var variable_texts = Scanner(System.`in`).nextLine()
    return variable_texts
}

//Пауза.done
fun pause(){
    println("\n Введите Enter для продолжения... \n")
    Scanner(System.`in`).nextLine()
}