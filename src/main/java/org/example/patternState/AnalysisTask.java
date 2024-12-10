package org.example.patternState;

public class AnalysisTask implements TaskState{
    /**
     * Функция состояния задачи
     * @return возвращает название состояния задачи
     */
    @Override
    public String getSNameState() {
        return "Проанализировать задачу";
    }
    /**
     * Функция состояния задачи
     * @return возвращает  состояние задачи
     */
    public TaskAtWork taskAtWork(){
        return new TaskAtWork();
    }
    /**
     * Функция состояния задачи
     * @return возвращает  состояние задачи
     */
    public DeleteTask deleteTask(){
        return new DeleteTask();
    }
}
