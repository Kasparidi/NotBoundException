### DESCRIPTION
Дано приложение с менеджером товаров.

### [TASK](https://github.com/netology-code/javaqa-homeworks/tree/master/exceptions)
1. Создать класс исключения ``NotFoundException``, отнаследовавшись от ``RuntimeException``, реализовать конструкторы.
1. Написать 2 авто-теста на репозиторий

   * 1й тест должен проверять успешность удаления существующего элемента
   * 2й тест проверяет генерацию ``NotFoundException`` при попытке удаления несуществующего элемента
    
1. Указать в сообщении ошибки по какому id было сгенерировано исключение: ``Element with id: " + id + " not found"``.

### LAUNCH
1. Открыть окно инструментов Maven в IDEA.
1. В меню Lifecycle запустить test.

### TOOLS
Java, JUnit Jupiter, Lombok, JaCoCo