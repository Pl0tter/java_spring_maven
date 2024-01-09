package org.example;


import com.google.gson.Gson;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
 * Задание:
 * 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
 * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
 * 3. Создайте класс Person с полями firstName, lastName и age.
 * 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
 * 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vladimir", "Z", 36);
        Person person2 = new Person("Irina", "G", 35);

        System.out.println(ObjectUtils.toString(person));

        System.out.println(ObjectUtils.equals(person, person));
        System.out.println(ObjectUtils.equals(person, person2));

        System.out.println(ObjectUtils.hashCode(person));
        System.out.println(ObjectUtils.hashCode(person2));

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);

        Person personJSON = gson.fromJson("{\"firstName\":\"Jason\",\"lastName\":\"Super\",\"age\":26}", Person.class);
        System.out.println(personJSON);
    }
}