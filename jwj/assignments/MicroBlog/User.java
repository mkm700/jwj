package MicroBlog;


public class User
{
	//fields
    private String uname;
    private String fname;
    private String lname;
    private String email;
    private String photoLink;
    
    //constructor
    public User(String uname, String fname, String lname, String email, String photoLink) {
        this.uname = uname;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.photoLink = photoLink;
    }
    
    //getters
    public String getUserName() {
    	return uname;
    }
    
    //toString
    public String toString() {
        return "Username: " + uname + "\n" + fname + " " + lname + "\n" + email + "\n" + photoLink + "\n";
    }
    

}
