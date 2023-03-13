public abstract class Task {

    public static int idTask;
    private String startData;
    private String endData;
    public String priority;
    public String themes;
    private String del = "ЗАДАЧА УДАЛЕНА: ";

    public Task(String startData, String endData, String priority, String themes) {
        this.startData = startData;
        this.endData = endData;
        this.priority = priority;
        this.themes = themes;
        idTask++;
    }

    public String getDelTask() {
        return String.format("%s, ", this.del) + super.toString();
    }

    public void setStartData(String data) {
        this.startData = data;
    }

    public String getStartData() {
        return this.startData;
    }

    public void setEndData(String data) {
        this.endData = data;
    }

    public String getEndData() {
        return this.endData;
    }

    // public int getId() {
    // return this.idTask;
    // }
    @Override
    public String toString() {
        return String.format("Время начала: %s, Время завершения: %s, Приоритет: %s, Тематика: %s",
                getStartData(), getEndData(), this.priority, this.themes);
    }

    int index;

    public boolean hasNext() {
        return index++ < idTask;
    }
}
