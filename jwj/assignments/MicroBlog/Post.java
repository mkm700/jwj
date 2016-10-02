package MicroBlog;

public class Post
{
    private String postTitle;
    private String postContents;
    private String uname;
    private String link = "";

    public Post(String postTitle, String postContents, String uname) {
        this.postTitle = postTitle;
        this.postContents = postContents;
        this.uname = uname;
    }
    
    public Post(String postTitle, String postContents, String uname, String link) {
        this.postTitle = postTitle;
        this.postContents = postContents;
        this.uname = uname;
        this.link = link;
    }
    
    public String getThePost() {
        return postTitle + "\n" + postContents + "\nBy: " + uname + "\n" + link + "\n";
    }

    public static void main (String[] args) {
        Post[] sample = new Post[5];
        sample[0] = new Post("Hello World!","This is my very first post.","mkm","www.anywhere.com");
        sample[1] = new Post("What a Beautiful Day","It fianlly feels like fall outside. Love the cool mornings.","mkm");
        sample[2] = new Post("It is almost October","Only a few more days until we start a new month.","Joe");
        sample[3] = new Post("Blank","I'm running out of things to say.","Sue","www.testing.com");
        sample[4] = new Post("Thank Goodness","This is the fifth and final post.","mkm");
        
        User[] allUsers = new User[3];
        allUsers[0] = new User("mkm","Mary Kay","Murdaugh","abc@xyz.com","www.mypic.com/mkm");
        allUsers[1] = new User("Joe","Joseph","Blow","123@xyz.com","www.mypic.com/joeb");
        allUsers[2] = new User("Sue","Susan","Shines","sue@123.com","www.mypic.com/suzi");
        
        for (int i=0; i < sample.length; i++) {
            System.out.println(sample[i].getThePost());
        }
        
        for (int i=0; i < allUsers.length; i++) {
            System.out.println(allUsers[i].getUserInfo());
        }
        
        
    }
}
