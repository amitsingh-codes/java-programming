import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todo_list;
    public TodoList(){
        this.todo_list = new ArrayList<>();
    }

    public void add(String task){
        this.todo_list.add(task);
    }

    public void print(){
        for(int i = 1 ; i <= this.todo_list.size() ; i++){
            System.out.println(i + ": " + this.todo_list.get(i-1)  );
        }
    }

    public void remove(int number){
        this.todo_list.remove(number-1);
    }

    public String print_task(int index){
        return this.todo_list.get(index-1);
    }
}
