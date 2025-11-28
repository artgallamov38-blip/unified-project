public class Group {
    public String name;
    public String admin;
    public User[] users;
    public Message[] messages;

    Group(String name, String admin, User[] users, Message[] messages) {
        this.name = name;
        this.admin = admin;
        this.users = users;
        this.messages = messages;
    }
}
