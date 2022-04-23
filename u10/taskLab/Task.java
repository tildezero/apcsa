package u10.taskLab;
public class Task {

  private boolean isComplete;
  private String description;

  public Task(String description) {
    this.isComplete = false;
    this.description = description;
  }

  public String toString() {
    String mark = this.isComplete ? "x" : " ";
    return "[" + mark + "] " + this.description;
  }

  public void setComplete(boolean isComplete) {
    this.isComplete = isComplete;
  }

  public boolean getIsComplete() {
    return this.isComplete;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

}