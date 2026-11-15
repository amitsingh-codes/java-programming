import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;

    public Birds(){
        this.birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        this.birds.add(bird);
    }

    public void printBirds(){
        for (Bird bird : this.birds) {
            System.out.println(bird.getName() + "(" + bird.getlatiName() + "): " + bird.getObservation() + " observations");
        }
    }

    public Bird getBird(String name) {
    for (Bird bird : this.birds) {
        if (bird.getName().equals(name)) {
            return bird;
        }
    }

    return null;
}
}
