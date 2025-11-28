public class Messenger {
    final int MAX = 15;

    User arslanov = new User("Арсланов" , "мехмат святой", "мужской", new User[MAX], "все на комсу");
    User valiulin = new User("Марат" , "20551635", "мужской", new User[MAX], "я тупой");
    User gallamov = new User("Артур" , "51484", "мужской", new User[MAX], "я сплю");
    User zubkova = new User("Светлана Константиновна" , "4785568", "женский", new User[MAX], "добрая душа");
    User enikeev = new User("Еникеев Камиль Шамилевич" , "5416546", "мужской", new User[MAX], "веселый, жизнерадостный");
    User kalimullin = new User("Калимуллин" , "дискра и язык си", "мужской", new User[MAX], "я вас спасу");

    Group teachers = new Group("Учителя", arslanov, new User[MAX], new Message[MAX]);

    public void run() {
        arslanov.addFriend(valiulin);
        arslanov.addFriend(zubkova);
        arslanov.addFriend(kalimullin);
        valiulin.addFriend(gallamov);
        zubkova.addFriend(kalimullin);
        enikeev.addFriend(gallamov);
        enikeev.addFriend(valiulin);


    }



    Group[] groups = {};
}
