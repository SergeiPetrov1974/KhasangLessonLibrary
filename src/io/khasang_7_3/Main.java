package io.khasang_7_3;
/*
Домашнее задание 7.3 "Менеджер книг" (обязательное)
Второе задание (* сложное, необязательное, но интересное!)
Если у вас достаточно времени, попробуйте идти вперед и начать делать игру менеджер каталога книг.
1. Сделайте менеджер книг так, чтобы при запуске спрашивалось, что сделать:
а) добавить новую книгу
б) посмотреть инфо по существующей.
При добавлении добавлять название книги и имя автора.
2. (дополнительно) Сделайте возможность удаления книг из каталога!
3. В простом варианте пусть книг в каталоге будет, например, не более 10. Для этих целей вам достаточно
использовать только массивы. В более продвинутом варианте используйте коллекции (ArrayList),
тогда каталог сможет хранить очень много книг.
Обратите внимание на тонкости проектирования для новичков:
1. Методы, которые работают только с одной книгой, должны располагаться в классе, например назовем его, Book.
2. А методы, которые работают со списком книг – ни в коем разе не должны быть в этом же классе Book!
Так как это нарушает принцип инкапсуляции и затрудняет дальнейшую разработку и тестирование.
Ведь мы специально используем ООП, чтобы разделить и распределить ответственность по разным классам!
И мы видим, что у нас есть большая такая ответственность: управлять набором книг (удалять, искать и т.п.).
Поэтому для всех подобных действий должен быть создан отдельный класс, вроде МенеджерКниг.
Часто в качестве поля класса он хранит список книг (в виде массива или коллекции),
а его методы просто работают с этим полем.
3. Крайне желательно создать и использовать еще и третий класс (например Menu), где будет все остальное работать
(например меню, запрос данных и т.п.)
4. И еще у вас есть класс, из которого вы запускаете программу, скажем Main, в котором public static void main находится.
У вас получается такая архитектура:
В классе Main в psvm вы создаете нужные экземпляры разных классов. И передаете управление какому-то методу из класса Menu.
Этот метод работает с пользователем (выдает меню и запрашивает ответы) и отдает команды экземпляру класса МенеджерКниг.
А МенеджерКниг в свою очередь уже работает с экземплярами класса Книга, которые хранит у себя в коллекции в поле класса.
Дополнительные требования:
1) При поиске и удалении книг самый простой вариант – делать поиск по номеру. В этом случае обратите внимание,
что после добавления новой книги пользователь должен увидеть ее номер, иначе как он ее потом найдет.
И не используйте в качестве номера книги индекс книги в массиве или в коллекции, как думаете, почему так делать не стоит?
2) При желании можете реализовать более сложный вариант – поиск и удаление книги по имени/автору.
 */

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hello Word!", "Petrov Sergey", 1974);
        Book book2 = new Book("Word Hello!", "Sergeev Petr", 1984);
        Book book3 = new Book("Book Manager", "Dolgov Igor", 2015);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.searchBookByWriter("Petrov sergey");

    }
}