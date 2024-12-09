import java.time.LocalDate;

public class Task {
    private String title;
    private String priority;
    private String status;
    private final LocalDate dueDate;

    // TO DO: Buat constructor untuk kelas Task
    

    public Task(String title, String priority, LocalDate dueDate, String status) {
        this.title = title;
        this.priority = priority;
        this.status = status;
        this.dueDate = dueDate;
    }

    public Task(Object title, Object priority, Object dueDate, Object status) {
        //TODO Auto-generated constructor stub
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

