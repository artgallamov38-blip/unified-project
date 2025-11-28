public class Message {
    private String date;
    private String text;
    private User fromUser;
    private User[] toUser;
    public Message(String date, String text, User fromUser, User[] toUser) {
        this.date = date;
        this.text = text;
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void setDate(String date) {
        this.date = date;
    }


    public String getDate() {
        return date;
    }
    public String getText() {
        return text;
    }
    public User getFromUser() {
        return fromUser;
    }
    public User[] getToUser() {
        return toUser;
    }
    public String toString() {
        String toUsers = "";
        for (User user : toUser) {toUsers += user.name + " ";}
        return date + " " + "от " + fromUser.name + " кому " + toUsers + "текст сообщения: " + text;
    }
}
