package u10.taskLab;
class TaskRunner {
  public static void main(String[] args) {
    TaskList todo = new TaskList();
    System.out.println(todo.toString());
    todo.createNewTask("bruh");
    todo.createNewTask("kurkure");
    todo.createNewTask("bing chi ling");
    System.out.println(todo.toString());

    todo.markComplete(0);
    todo.markComplete(2);
    System.out.println(todo.toString());

    todo.markIncomplete(2);
    System.out.println(todo.toString());

    todo.renameTask(0, "lmao");
    System.out.println(todo.toString());

    todo.moveTaskToTop(2);

    System.out.println(todo.toString());

    System.out.println(todo.getNumberOfIncompleteTasks());

    todo.sortCompletedToBottom();
    System.out.println(todo.toString());

    todo.clearAllCompletedTasks();
    System.out.println(todo);

  }
}