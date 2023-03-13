import java.util.Calendar;

public class WorkTask extends Task {
    private String responsible;
    private int id;
    Calendar timeInfo = Calendar.getInstance();
    private String taskData = String.valueOf(timeInfo.getTime());

    public WorkTask(String startData, String endData, String priority, String themes, String responsible) {
        super(startData, endData, priority, themes);
        this.responsible = responsible;
        id = idTask;
    }

    public String getTaskData() {
        return this.taskData;
    }

    @Override
    public String toString() {
        return String.format("id задачи: %d, ", this.id) + super.toString()
                + String.format(", Ответственный: %s, Задача поставлена: %s",
                        this.responsible, getTaskData());
    }

}
