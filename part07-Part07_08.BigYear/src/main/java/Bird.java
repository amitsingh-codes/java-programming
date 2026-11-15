public class Bird {
    private String name;
    private String latin_name;
    private int observation;

    public Bird(String name , String latin_name){
        this.name = name;
        this.latin_name = latin_name;
        this.observation = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getlatiName(){
        return this.latin_name;
    }

    public int getObservation(){
        return this.observation;
    }

    public void incObservation(){
        this.observation++;
    }

    public String toString(){
        return getName() + "(" + getlatiName() + "): " + getObservation() + " observations";
    }

}
