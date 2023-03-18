fun twoWIN(arr1:MutableList<String>, arr2: MutableMap<String, String>):MutableList<String>{
    while (true){
        println( " -= Экран 4 Выбор/создание заметки или возврат к выбору архива =- \n")

        for (i in 0..arr1.size-1)
        { println( "${i}. ${arr1.get(i)}" ) }

        var numberChoice = navigation(arr1.size)

        if (numberChoice == 0)
        { return arr1}

        if (numberChoice == 1)
        {   println("\n Переходим к созданию заметки... \n")
            println(" -= Экран 5 Создание заметки =- \n" )
            arr1.remove("Список заметок пуст...")
            var dd = createNameArchivs()
            arr1.add(dd)
            arr2.put(dd, "")
            //arr1.put(dd, mutableListOf())
        }

        if (numberChoice == 2 && arr1.contains("Список заметок пуст..."))
        { println("Список заметок пуст. Для начала создайте хотя бы одину заметку... \n") }

        if (numberChoice >= 2 && !arr1.contains("Список заметок пуст..."))
        { println("Вы выбрали заметку ${arr1.get(numberChoice)}. Переходим в заметку... \n")
            arr2.put(arr1.get(numberChoice),threeWIN(arr1.get(numberChoice),
                arr2.get(arr1.get(numberChoice))!!
            ))
        }
    }
}