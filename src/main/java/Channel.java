public class Channel {
    public String name;
    public String description;
    public String admin;
    public User[] users;

    Channel(String name, String description, User[] users, String admin) {
        this.name = name;
        this.description = description;
        this.users = users;
        this.admin = admin;
    }
}
