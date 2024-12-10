package org.example.patternState;

public class DeleteTask implements TaskState{
    /**
     * Функция состояния задачи
     * @return возвращает название состояния задачи
     */
    @Override
    public String getSNameState() {
        return "Удалить задачу";
    }
}
