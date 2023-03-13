import java.util.List;

import javax.swing.text.html.HTML.Tag;

public class Program {
    public static <WorkTask, PersonalTask> void main(String[] args) {

        List firstCalendar = new ListTask();
        WorkTask workTask1 = new WorkTask("15:00", "16:00", "Высокий", "подготовить отчет", "Иванов И.И.");
        PersonalTask personalTask1 = new PersonalTask("19:00", "19:30", "Средний", "Выгулять собаку");
        WorkTask workTask2 = new WorkTask("16:00", "17:00", "Высокий", "Презентация отчета", "Иванов И.И.");
        firstCalendar.addTask(workTask1);
        firstCalendar.addTask(workTask2);
        firstCalendar.addTask(personalTask1);
        PersonalTask personalTask2 = new PersonalTask("20:00", "21:00", "Обычный", "Семейный ужин");
        firstCalendar.addTask(personalTask2);
        for (Tag task : firstCalendar) {
            System.out.println(task);
        }
        ((Object) firstCalendar).deleteTask(workTask1);
        System.out.println();
        for (Task task : firstCalendar) {
            System.out.println(task);
        }
    }

    @Override
    public String toString() {
        return "Program []";
    }

    public Program() {
    }

}