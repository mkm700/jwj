package MicroBlog;


public class User
{

    private String uname;
    private String fname;
    private String lname;
    private String email;
    private String photoLink;
    
    public User(String uname, String fname, String lname, String email, String photoLink) {
        this.uname = uname;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.photoLink = photoLink;
    }
    
    public String getUserInfo() {
        return uname + "\n" + fname + " " + lname + "\n" + email + "\n" + photoLink + "\n";
    }

}
