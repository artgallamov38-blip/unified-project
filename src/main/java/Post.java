public class Post {
    public String title;
    public String description;
    public User user;
    public String date;

    public Post(String title, String description, User user, String date) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        String toUsers = "";
        return "опубликовал : " + user.name + " название " + title + " текст " + description + " дата " + date;
    }
}
