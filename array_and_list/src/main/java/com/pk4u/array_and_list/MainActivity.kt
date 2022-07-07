package com.pk4u.array_and_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Создаем массив с 5-ю ячейками
        val array = arrayOf(3, 7, 8, 9, 0)
        val arraySize = array.size
        //Записываем размер массива 5 в переменную arraySize

        //Создаем массив с 5-ю ячейками: (3, 7, 8, 9, 0)
        val arrayReversedArray = arrayOf(3, 7, 8, 9, 0)
        //Переворачиваем массив записываем перевернутый
        //массив в новую переменную reversedArray и теперь
        //значения в новом массиве будут на оборот при этом
        //старый массив arrayOrigin остается нетронутым
        val reversedArray = arrayReversedArray.reversedArray()
        //Теперь значения в новом массиве выглядят так: (0, 9, 8, 7, 3)

        //Создаем массив с 5-ю ячейками: (3, 7, 8, 9, 0)
        val arraySort = arrayOf(3, 7, 8, 9, 0)
        //Сортируем оригинальный массив
        arraySort.sort()
        //Теперь у нас в массиве элементы будут в таком порядке (0, 3, 7, 8, 9)

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arraySort2 = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Сортируем оригинальный массив
        arraySort2.sort(0, 3)
        //В таком случе сортируем только первые 3 числа
        //так как мы сортируем от позиции 0 включительно
        //до позиции 3 не включительно
        //Теперь у нас в массиве элементы будут в таком порядке (3, 5, 9, 1, 0, 67, 11)

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arraySortDescending = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Сортируем оригинальный массив от большего к меньшему
        arraySortDescending.sortDescending()
        //Результат будет такой (67, 11, 9, 5, 3, 1, 0)

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arraySortedArrayArrayDescending = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Сортируем оригинал создавая новый отсортированный массив
        val sortedArray = arraySortedArrayArrayDescending.sortedArray()//От меньшего к большему
        val sortedDescendingArray = arraySortedArrayArrayDescending.sortedArrayDescending()//От большего к меньшему

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arrayContains = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Проверяем содержит наш массив число 5 или нет.
        //Если содержит то на запишет true в containElement
        //если нет то запишет false
        val containElement = arrayContains.contains(5)

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arrayMaxAndMinOrNull = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Проверяем наибольшее число в массиве.
        val maxNumber = arrayMaxAndMinOrNull.maxOrNull()
        //Проверяем наименьшее число в массиве.
        val minNumber = arrayMaxAndMinOrNull.minOrNull()

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arraySum = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Сумма всех элементов в массиве
        val sum = arraySum.sum()

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arrayAverage = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Находим среднее значение в массиве
        val average = arrayAverage.average()

        //Создаем ервый массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arrayIntersect1 = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Создаем второй массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arrayIntersect2 = arrayOf(1, 34, 7, 45, 56, 675, 3)
        //Находим общие элементы, в данном случае это 3 и 1 и создаем новый массив
        //в который записываем общие значения для двух массивов
        //Нам выдает класс Set по этому мы превращаем результат
        //с помощью toIntArray() в массив с типом данных Int
        val resultArray = arrayIntersect1.intersect(arrayIntersect2.toList()).toIntArray()

        //Создаем ервый массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arrayShuffle = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Перемешиваем массив в случайном порядке
        arrayShuffle.shuffle()




        //-------------------------------------------------------------





        //Создаем первый массив с 5-ю ячейками: (4, 17, 85, 8, 451)
        val arrayOrigin = listOf(4, 17, 85, 8, 45)
        //Создаем второй массив с 5-ю ячейками: (4, 10, 85, 8, 4)
        val arrayOrigin2 = listOf(4, 10, 85, 8, 4)

        val sortedList = arrayOrigin.sorted()
        val sumList = arrayOrigin.sum()
        val reversedList = arrayOrigin.reversed()
        val containsList = arrayOrigin.contains(5)
        val minList = arrayOrigin.minOrNull()
        val maxList = arrayOrigin.maxOrNull()
        val averageList = arrayOrigin.average()
        val shuffledList = arrayOrigin.shuffled()
        val sortedDescendingList = arrayOrigin.sortedDescending()
        val intersection = arrayOrigin.intersect(arrayOrigin2.toList())


        //Создаем список с 5-ю ячейками: (4, 17, 85, 8, 451)
        val list1 = listOf(4, 17, 85, 8, 45)
        //Создаем список явно указав тип данных с 5-ю ячейками: (4, 17, 85, 8, 451)
        val list2:List<Int> = listOf(4, 17, 85, 8, 45)
        //Создаем список явно указав тип данных с 5-ю ячейками: (4, 17, 85, 8, 451)
        val list3 = listOf<Int>(4, 17, 85, 8, 45)

        //Создаем список с 5-ю ячейками: (4, 17, 85, 8, 451)
        val list4 = arrayListOf(4, 17, 85, 8, 45)
        //Создаем список явно указав тип данных с 5-ю ячейками: (4, 17, 85, 8, 451)
        val list5:ArrayList<Int> = arrayListOf(4, 17, 85, 8, 45)
        //Создаем список явно указав тип данных с 5-ю ячейками: (4, 17, 85, 8, 451)
        val list6 = arrayListOf<Int>(4, 17, 85, 8, 45)


        //Создаем список ArrayList с 5-ю ячейками: (4, 17, 85, 8, 45)
        val list = arrayListOf(4, 17, 85, 8, 45)
        //Считываем значение с позиции 2
        val number = list[2]
        //Перезаписываем значение на позиции 2
        list[2] = 56
        //Добавляем еще один элемент в список это число 23
        //значения которые добавляем должны быть
        // того же типа что и остальные, в данном случае Int
        list.add(23)
        //Удаляем элемент на позиции 2 теперь нет этой ячейки,
        // ее место займет ячейка та что была впереди все равно что стопка книг,
        //убрали одну нигу из середины,
        //верхние книги займут ее место, тут тоже самое
        list.removeAt(2)
        //Удаляем все элементы в списке
        list.clear()
        //Добавляем не по одному элементу а целый список,
        //если уже есть элементы в списке то новый список их дополнит не удаляя
        list.addAll(listOf(35, 78, 89))
        //сли так непонятно то можно тоже самое сделать вот так
        val newList = listOf(35, 78, 89)
        list.addAll(newList)
        //Мы добавили в ArrayList список List
        //К уже добваленному списку можно добавить еще один список
        //тогда у нас будет один большой список
        //чтобы было понятней мы возмем и добавим в наш
        //список не список а массив , в таком случае выйдет ошибка,
        val arrayTest = intArrayOf(34, 67, 89, 89)
        //list.addAll(arrayTest)
        //Мы можем воспользоваться методом у массива для превращения
        //массива в список вот тогда наш список сможет принять наш массив
        val arrayTest2 = intArrayOf(34, 67, 89, 89)
        list.addAll(arrayTest2.toList())
        //Другой вариант просто не указывать что это за массив написав
        //просто arrayOf тогда непридется превращать его в List
        val arrayTest3 = arrayOf(34, 67, 89, 89)
        list.addAll(arrayTest3)
    }
}