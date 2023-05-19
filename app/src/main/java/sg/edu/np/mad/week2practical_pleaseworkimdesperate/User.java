package sg.edu.np.mad.week2practical_pleaseworkimdesperate;

public class User {
    String name;
    String description;
    boolean followed;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String d){
        this.description = d;
    }

    // constructors
    public User(){}
}
