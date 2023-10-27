package Model;

public interface Logger {
    /** dateTime() - Функция показывает дату и время
     */
    String dateTime();
    /** writeHistory() - Функция записывает результаты вычислений в ArrayList
     */
    void writeHistory(String result);
    /** readHistory() - Функция читает результаты вычислений из ArrayList
     */
    void readHistory();
}