public class ToDoItem {
    private String description;
    private boolean isDone;

    //Constructor
    public ToDoItem() {
        description = "description";
        isDone = false;
    }

    // Description Getter
    public String getDescription() {
        return description;
    }

    // Description Setter
    public void setDescription(String inputDescription) {
        this.description = inputDescription;
    }

    // IsDone Getter
    public boolean getIsDone() {
        return isDone;
    }

    // IsDone Setter
    public void setIsDone(boolean inputIsDone) {
        this.isDone = inputIsDone;
    }
}