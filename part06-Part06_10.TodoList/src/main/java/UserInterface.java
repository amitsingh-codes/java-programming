import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList,Scanner scanner ){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        System.out.println("and the Commands are: ");
        while (true) {
            String Command = scanner.nextLine();
            if (Command.equals("stop")) {
                return ;
            }

            if (Command.equals("add")) {
                add();
            }

            if (Command.equals("list")) {
                print_list();
            }

            if (Command.equals("remove")) {
                remove_task();
            }
        }
    }

    public void add(){
        System.out.print("To add: ");
        String task = scanner.nextLine();

        this.todoList.add(task);
    }

    public void print_list(){
        this.todoList.print();
    }

    public void remove_task(){
        // System.out.print("Which task was completed? ");
        int task_no = Integer.valueOf(scanner.nextLine());
        System.out.println(this.todoList.print_task(task_no) + " Done" ) ; 
        this.todoList.remove(task_no);
    }
}
