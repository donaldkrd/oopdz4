import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Calendar implements Iterable<Task> {
    public List<Task> listTask;
    /**
     *
     */
    int index;

    public Calendar(int index) {
        this.index = index;
    }

    public Calendar(int index) {
        this.index = index;
    }

    public Calendar(List<Task> listTask, int index) {
        this.listTask = listTask;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Calendar() {
        listTask = new ArrayList<>();
        index = 0;
    }

    public void addTask(Task task) {
        listTask.add(task);
        fileWriter(task);
    }

    public void deleteTask(Task task) {
        int index1 = 0;
        while (listTask.get(index1).hasNext()) {
            if (listTask.get(index1).equals(task)) {
                listTask.get(index1).setStartData("ЗАДАЧА УДАЛЕНА");
                listTask.get(index1).setEndData("ЗАДАЧА УДАЛЕНА");
                fileWriter(listTask.get(index1));
                listTask.remove(index1);
                // String str = String.valueOf("ЗАДАЧА УДАЛЕНА: " + index1);
            }
        }

    }

    public void fileWriter(Task task) {
        try (FileWriter writer = new FileWriter("Tasks.txt", true)) {
            // int ind = 0;
            // while(listTask.get(ind).hasNext()) {
            String str = String.valueOf(task);
            writer.write(str + "\n");
            // }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}