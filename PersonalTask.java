import java.util.Calendar;

public class PersonalTask extends Task {
    Calendar timeInfo = Calendar.getInstance();
    private String taskData = String.valueOf(timeInfo.getTime());
    private int id;

    public PersonalTask(String startData, String endData, String priority, String themes) {
        super(startData, endData, priority, themes);
        id = idTask;
    }

    public String getTaskData() {
        return this.taskData;
    }

    @Override
    public String toString() {
        return String.format("id задачи: %d, ", this.id) + super.toString()
                + String.format(", Задача поставлена: %s", getTaskData());
    }

}