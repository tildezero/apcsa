package u10.taskLab;
import java.util.ArrayList;

public class TaskList {

  private ArrayList<Task> tasks;

  public TaskList() {
    this.tasks = new ArrayList<Task>();
  }

  public TaskList(ArrayList<Task> tasks) {
    this.tasks = tasks;
  }

  // For each task, print its index, its checkbox, and its description
  // If the list is empty, return that as a string.
  /*
    (0) [ ] Finish my study guide
    (1) [x] Finish my labs
    (2) [ ] Review homework from this unit
  */
  public String toString() {
    String output = "";
    if (this.tasks.size() == 0) return "You have nothing to do!";
    for (int i = 0; i < this.tasks.size(); i++) {
      output += String.format("(%d) %s\n", i, this.tasks.get(i).toString());
      // output += "(" + i + ") " + this.tasks.get(i).toString() + "\n";  
    }
    return output;
  }

  // Creates a new task with a given description and adds it to the beginning of the list
  public void createNewTask(String description) {
    Task t = new Task(description);
    tasks.add(t);
  }

  // Marks a task at a given index as complete
  public void markComplete(int index) {
    tasks.get(index).setComplete(true);
  }

  // Marks a task at a given index as incomplete
  public void markIncomplete(int index) {
    tasks.get(index).setComplete(false);
  }

  // Renames a task at a given index with a new description
  public void renameTask(int index, String description) {
    this.tasks.get(index).setDescription(description);
  }


  // Moves a task at a given index to index 0
  public void moveTaskToTop(int index) {
    tasks.add(0, tasks.get(index));
    tasks.remove(index);
  }

  // Counts the total number of incomplete tasks
  public int getNumberOfIncompleteTasks() {
    int ic = 0;
    for (Task t: this.tasks) {
      if (t.getIsComplete() == false) ic++;
    }
    return ic;
  }

  // Removes all tasks marked as complete
  public void clearAllCompletedTasks() {
    for (Task t: this.tasks) {
      if (t.getIsComplete() == true) this.tasks.remove(t);
    }
  }

  // Sorts all tasks marked as complete to the end of the list
  public void sortCompletedToBottom() {
    int ts = tasks.size();
    for (int i = 0; i < ts; i++) {
      if (tasks.get(i).getIsComplete() == false) {
        moveTaskToTop(i);
      }
    }
  }

}