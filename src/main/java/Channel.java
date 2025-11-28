public class Channel {
    public String name;
    public String description;
    public User admin;
    public User[] users;
    private final int MAX_USERS = 15;
    public Post[] posts;

    public Channel(String name, String description, User[] users, User admin) {
        this.name = name;
        this.description = description;
        this.users = users;
        this.admin = admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPost(Post post) {
        int countPosts = 0;
        for (Post post1 : posts) {
            if (post1 != null) {
                countPosts++;
            }
        }
        if (countPosts == MAX_USERS) {
            System.out.println("превышено количество создаваемых постов");
        }
        else {
            for (int i = 0; i < posts.length; i++) {
                if (posts[i] == post) {
                    System.out.println("Он уже есть");
                    break;
                }
                if (posts[i] == null) {
                    posts[i] = post;
                    break;
                }
            }
        }

    }

    public void delPost(Post post) {
        int countPosts = 0;
        for (Post post1 : posts) {
            if (post1 != null) {
                countPosts++;
            }
        }
        if (countPosts == 0) {
            System.out.println("и так нет постов");
        }
        else {
            for (int i = 0; i < posts.length; i++) {
                if (posts[i] == post) {
                    posts[i] = null;
                }
            }
            for (int i = 0; i < posts.length; i++) {
                if (posts[i] == null) {
                    for (int j = i+1; j < posts.length; j++) {
                        if (posts[j] != null) {
                            posts[j-1] = posts[j];
                            posts[j] = null;
                        }
                    }
                }
            }
        }

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


}
