public class Teamrecord {

    private String home_team;
    private String  visiting_team;
    private int home_team_score;
    private int visiting_team_score;

    public Teamrecord(String home_team , String visiting_team , int home_team_score , int visiting_team_score){
        this.home_team = home_team;
        this.visiting_team = visiting_team;
        this.home_team_score = home_team_score;
        this.visiting_team_score = visiting_team_score;
    }

    public String gethometeam(){
        return home_team;
    }

    public  String getvisitingteam(){
        return visiting_team;
    }

    public int gethometeamscore(){
        return home_team_score;
    }

    public int getvisitingteamscore(){
        return visiting_team_score;
    }

    public String toString(){
        return home_team + visiting_team + home_team_score + visiting_team_score;
    }
}
