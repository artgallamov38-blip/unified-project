public class Group {
    public String name;
    public User admin;
    public User[] users;
    public Message[] messages;
    private final int MAX_USERS = 15;
    public Group(String name, User admin, User[] users, Message[] messages) {
        this.name = name;
        this.admin = admin;
        this.users = users;
        this.messages = messages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addUser(User user) {
        if (users.length == MAX_USERS) {
            System.out.println("превышено количество участников");
        }
        else {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    break;
                }
            }
        }

    }

    public void delUser(User user) {
        if (users.length == 0) {
            System.out.println("нечего удалять");
        }
        else {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == user) {
                    users[i] = null;
                }
            }
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    for (int j = i+1; j < users.length; j++) {
                        if (users[j] != null) {
                            users[j-1] = users[j];
                            users[j] = null;
                        }
                    }
                }
            }
        }

    }

    public void sendMessage(User fromUser, String text, String date) {
        int countUsers = 0;
        for (User user : users) {
            if (user != null) {
                countUsers++;
            }
        }
        User[] toUsers = new User[countUsers - 1];
        int indexToUsers = 0;
        for (User user : users) {
            if (user != null && !fromUser.name.equals(user.name)) {
                toUsers[indexToUsers] = user;
                indexToUsers++;
            }
        }
        Message message = new Message(date, text, fromUser, toUsers);
        for (int i = 0; i < this.messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = message;
                break;
            }
        }
    }

}
