public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача 1");
        //Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в
        // неструктурированном формате. Бухгалтерия попросила написать программу, в которой
        // можно работать с Ф. И. О. сотрудников.
        //Напишите четыре строки:
        //С именем firstName — для хранения имени.
        //С именем middleName — для хранения отчества.
        //С именем lastName — для хранения фамилии.
        //С именем fullName — для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
        //Выведите в консоль фразу: «Ф. И. О. сотрудника — …».
        //В качестве данных для задачи используйте Ivanov Ivan Ivanovich.
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Task 2
        System.out.println("Задача 2");
        //Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
        // полностью написанные заглавными буквами (верхним регистром).
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с Ivanov Ivan Ivanovich
        // на полностью заглавные буквы.
        //В качестве строки с исходными данными используйте строку fullName.
        //Результат программы выведите в консоль в формате: «Данные Ф. И. О. сотрудника для заполнения отчета — …».
        String upCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upCaseFullName);

        //Task 3
        System.out.println("Задача 3");
        //Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая
        // заменяет символ «ё» на символ «е».
        //В качестве исходных данных используйте строку fullName
        // и данные в ней — «Иванов Семён Семёнович».
        //Выведите результат программы в консоль в формате: «Данные Ф. И. О. сотрудника — ...».
        firstName = "Семён ";
        middleName = "Семёнович";
        lastName = "Иванов ";
        String newFirstName = firstName.replace('ё', 'е');
        String newMiddleName = middleName.replace('ё','е');
        fullName = lastName + newFirstName + newMiddleName;
                System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
        //Second way
        //fullName = lastName + firstName + middleName;
        //System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace('ё', 'е'));
    }
}