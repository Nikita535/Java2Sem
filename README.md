# Java2Sem
# Практическая работа №1
 Имплементировать интерфейс Predicate, определяющий, является ли данная строка PIN-кодом (содержит ровно 4 цифры или 6 цифр).
# Практическая работа №2
 Фильтрация по признаку «вес больше, чем возраст», сортировка по фамилии в обратном порядке, сумма всех весов
# Практическая работа №3
 List с использованием Lock, Map с использованием Semaphore.
# Практическая работа №4
 Реализовать собственную имплементацию ExecutorService с единственным параметром конструктора – количеством потоков.
# Практическая работа №5
 Реализовать паттерн Singleton как минимум 3-мя способами.
# Практическая работа №6
 Написать реализацию паттернов «Фабричный метод», «Абстрактная фабрика», «Строитель», «Прототип»
# Практическая работа №7
 Написать реализацию паттерна Декоратор, Легковес.
# Практическая работа №8
 Написать реализацию паттерна Шаблонный метод, Посетитель.
# Практическая работа №9
 Создать приложение, которое выводит какое-то сообщение в консоль. Создать Gradle Task, который создает jar-файл приложения, переносит его в
 отдельную папку, в которой хранится Dockerfile для jar, а затем создает Docker контейнер из данного jar-файла и запускает его.
# Практическая работ №10
 Создать приложение, в котором создается ApplicationContext и из него берётся бин с названием, переданным в качестве аргумента к приложению, и
 вызывается метод интерфейса, который он имплементирует. Нужно создать по одному бину для каждого класса, определить им название. Проверить, что
 вызывается при вводе названия каждого из бинов. Классы и интерфейс определяются в соответствии с вариантом индивидуального задания ( Интерфейс Printer с методом doPrint(), его     имплементации:ConsolePrinter, FilePrinter.)
# Практическая работа №11
Создать приложение с использованием Spring Boot Starter Initializr
(https://start.spring.io/) с такими зависимостями:
* Spring Web;
* Lombok;
* Validation;
* Spring boot Actuator.<br>

Запустить приложение и удостовериться, что не появилось никаких ошибок. Добавить все эндпоинты в Actuator, сделать HTTP-запрос на проверку состояния приложения. Собрать jar-файл приложения, запустить и проверить состояние при помощи REST-запроса.
# Практическая работа №12
 Создать приложение, которое при запуске берет данные из одного файла, хеширует, а при остановке приложения удаляет исходный файл, оставляя только файл с захешированными данными. Названия первого и второго файла передаются в качестве аргументов при запуске. При отсутствии первого файла создает второй файл и записывает в него строку null.
Реализовать с использованием аннотаций PostConstruct, PreDestroy
# Практическая работа №13
Создать файл application.yml в папке resources, добавить в него такие свойства:
* student.name – имя студента;
* student.last_name – фамилия студента;
* student.group – название группы студента.<br>

При запуске приложения выведите данные свойства в консоль при
помощи интерфейса Environment или аннотации Value.
# Практическая работа №14
*Создать отдельный репозиторий Git. Создать простой html-документ, который будет содержать вашу фамилию, имя, номер группы, номер варианта. Создать контроллер, который будет возвращать данный статический документ при переходе на url «/home». Выполнить задание в зависимости с вариантом индивидуального задания.
*Создать класс Student с полями firstName, lastName, middleName. Создать класс Group с полем groupName. Создать классы-контроллеры для создания, удаления объектов и получения всех объектов каждого типа. Сами объекты хранить в памяти.
#
#
#

