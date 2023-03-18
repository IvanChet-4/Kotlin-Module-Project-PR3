fun threeWIN(name:String, text:String):String {
    if (text.isEmpty()){
        println(" -= Экран 6 Экран заполнения заметки =- \n" )
        var dd = textsIn()
        return dd
    }
    println(" -= Экран 7 Экран вывода заметки =- \n" )
    println("\n Текст заметки: \n" +
            text)
    pause()
    return text
}