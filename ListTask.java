import java.util.Iterator;

public class ListTask extends Calendar {

    @Override
    public Iterator<Task> iterator() {
        Iterator<Task> tasks = new Iterator<Task>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < listTask.size();
            }

            @Override
            public Task next() {
                return listTask.get(index++);
            }
        };
        return tasks;
    }

}