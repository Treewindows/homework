package org.example.patternState;

public class NewTask implements TaskState{
    /**
     * Функция состояния задачи
     * @return возвращает название состояния задачи
     */
    @Override
    public String getSNameState() {
        return "Новая задача";
    }
    /**
     * Функция состояния задачи
     * @return возвращает  состояние задачи
     */
    public AnalysisTask analysisTask(){
        return new AnalysisTask();
    }
    /**
     * Функция состояния задачи
     * @return возвращает  состояние задачи
     */
    public DeleteTask deleteTask(){
        return new DeleteTask();
    }
}
