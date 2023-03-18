fun firstWIN(){

   var arr1:MutableMap<Int, String> = HashMap()
   arr1.put(0, "Выход")
   arr1.put(1, "Создать архив")
   arr1.put(2, "Список архивов пуст...")

   var arr2:MutableMap<String, MutableList<String>> = HashMap()
   var arr3: MutableMap<String, String> = HashMap()

   while (true){
            println(" -= Экран 2 Выбор/создание архива или выход из программы =- \n")
            var i = 0
            for (im in arr1)
            { println( "${i++}. ${im.value}" ) }

           var numberChoice = navigation(arr1.size)

    if (numberChoice == 0)
    { exitProgram()
        break }

    if (numberChoice == 1)
    { println("\n Переходим к созданию архива... \n" +
      " -= Экран 3 Создание архива =- \n" )
        if (arr1.containsValue("Список архивов пуст..."))
        { arr1.remove(2) }
        var nameArc = createNameArchivs()
        arr1.put(arr1.size, nameArc)
        var list:MutableList<String> = mutableListOf()
        list.add("Выход")
        list.add("Создать заметку")
        list.add("Список заметок пуст...")
        arr2.put(nameArc, list)
    }

    if (numberChoice >= 2 && !arr1.containsValue("Список архивов пуст..."))
    { println("\n Вы выбрали архив ${arr1[numberChoice]}. Переходим в архив... \n")
      var dd = twoWIN(arr2.get(arr1[numberChoice])!!, arr3)
      arr2.put(arr1.get(numberChoice)!!, dd) }

    if (numberChoice == 2 && arr1.containsValue("Список архивов пуст..."))
    { println("Список архивов пуст. Для начала создайте хотя бы один архив... \n") }
    }
}