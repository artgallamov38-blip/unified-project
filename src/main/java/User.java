public class User {
    public String name;
    final String id;
    public String dateOfBirth;
    public String gender;
    public User (String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
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

}