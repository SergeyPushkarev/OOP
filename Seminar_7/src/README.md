1. Single Responsibility Principle. Класс Text является хорошим примером принципа единственной ответственности, т.к. он отвечает за вывод текстовых сообщений в консоль.
2. Interface Segregation Principle. Создал два интерфейса: Calculate и Loger. Первый интерфейс отвечает за вычислительные операции, а другой только за логирование.
3. Dependency Inversion Principle. В Классе Operations используются интерфейсы, которые реализуются в классе Controller.


4. Я реализовал простой паттерн "Фабрика" классом CalculableFactory, но этот класс всего-лишь создает экземпляры, за каждый из которых отвечает свой метод класса.
Более наглядно этот паттерн можно было раскрыть, если бы я реализовал декорирование класса логирования от общего интерфеса калькулятора.