package action;

public class WelcomeUserAction{

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // all struts logic here
    public String execute() {
        if (username.equals("niloufar"))
        {return "SUCCESS";}

        else return  "UNSUCCESS";

    }
}