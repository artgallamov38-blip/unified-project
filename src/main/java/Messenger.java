public class Messenger {
    final int MAX = 15;

    User arslanov = new User("Арсланов" , "мехмат святой", "мужской", new User[MAX], "все на комсу");
    User valiulin = new User("Марат" , "20551635", "мужской", new User[MAX], "я тупой");
    User gallamov = new User("Артур" , "51484", "мужской", new User[MAX], "я сплю");
    User zubkova = new User("Светлана Константиновна" , "4785568", "женский", new User[MAX], "добрая душа");
    User enikeev = new User("Еникеев Камиль Шамилевич" , "5416546", "мужской", new User[MAX], "веселый, жизнерадостный");
    User kalimullin = new User("Калимуллин" , "дискра и язык си", "мужской", new User[MAX], "я вас спасу");

    User[] users = {arslanov, valiulin, gallamov, zubkova, enikeev, kalimullin};

    Group teachers = new Group("Учителя КФУ", arslanov, new User[MAX], new Message[MAX]);
    Group teenagers = new Group("Студенты КФУ", valiulin, new User[MAX], new Message[MAX]);
    Group arc_and_kali = new Group("Короли мехмата", arslanov, new User[MAX], new Message[MAX]);

    Channel kfu = new Channel("КФУ", "лучший институт Казани", users, arslanov);
    Channel itis = new Channel("ИТИС", "лучший институт Казани по проге", users, enikeev);

    Post post1 = new Post("Важно", "в КФУ сегодня был геймдев, все молодцы", enikeev, "28.11.25");
    Post post2 = new Post("Автоматы", "сегодня автоматы всем, кто придет на лекцию Еникееа", enikeev, "31.11.25");
    Post post3 = new Post("Спартакиада", "поддержим итис, ведь они играют против Ипо в воскресенье", valiulin, "29.11.25");

    public void run() {
        arslanov.addFriend(valiulin);
        arslanov.addFriend(zubkova);
        arslanov.addFriend(kalimullin);
        valiulin.addFriend(gallamov);
        zubkova.addFriend(kalimullin);
        enikeev.addFriend(gallamov);
        enikeev.addFriend(valiulin);

        arc_and_kali.sendMessage(kalimullin, "Почему лекции не будет в понедельник", "30.11.25/23:59");
        arc_and_kali.sendMessage(arslanov, "мне нужен перерыв", "01.12.25/00:00");

        teachers.sendMessage(gallamov, "ты тупой", "25.10.21");
        teachers.sendMessage(valiulin, "сам такой", "25.10.21");
        teachers.sendMessage(gallamov, "зато ты не еврей", "26.10.21");
        teachers.sendMessage(valiulin, "ты гордишься что ты еврей?", "26.10.21");

        kfu.addPost(post1);
        kfu.addPost(post2);

        itis.addPost(post2);
        itis.addPost(post3);


        for (User user:users) {
            System.out.println("Пользователь " + user.name + ":");
            System.out.println("Друзья:");
            for (User user1:user.friends) {
                System.out.println(user1.name);
            }
            System.out.println();
        }

    }

}
