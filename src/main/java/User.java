public class User {
    public String name;
    public User[] friends;
    final String id;
    String bio;
    public String dateOfBirth;
    public String gender;
    public User (String name, String id, String gender, User[] friends, String bio) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.friends = friends;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addFriend(User newFriend) {
        for (User user : this.friends) {
            if (user.getId().equals(newFriend.getId())) {
                System.out.println("Пользователь уже в друзьях");
                return;
            }
        }
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == null) {
                friends[i] = newFriend;
                System.out.println("Друг успешно добавлен");
                return;
            }
        }
        System.out.println("Список друзей заполнен");
    }

}