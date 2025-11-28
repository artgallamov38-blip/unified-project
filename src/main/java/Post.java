public class Post {
    public String title;
    public String description;
    public User user;
    public String date;

    Post(String title, String description, User user, String date) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.date = date;
    }
}
