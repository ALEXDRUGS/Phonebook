import java.util.HashMap;
import java.util.Objects;

public class Phonebook {
    private String nameAndSurname;
    private String phoneNumber;
    private HashMap<String, String> stringHashMap;

    public Phonebook(String nameAndSurname, String phoneNumber) {
        this.nameAndSurname = nameAndSurname;
        this.phoneNumber = phoneNumber;
    }

    public void addPhoneNumber() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(nameAndSurname, phoneNumber);
        setStringHashMap(hashMap);
    }

    public HashMap<String, String> getStringHashMap() {
        return stringHashMap;
    }

    public void setStringHashMap(HashMap<String, String> stringHashMap) {
        this.stringHashMap = stringHashMap;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook = (Phonebook) o;
        return nameAndSurname.equals(phonebook.nameAndSurname) && phoneNumber.equals(phonebook.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname, phoneNumber);
    }

    @Override
    public String toString() {
        return nameAndSurname + " " + phoneNumber + " " + stringHashMap;
    }

    public static void main(String[] args) {
        Phonebook phonebook1 = new Phonebook("Михаил Кержаков", "+7 921 346 87 25");
        Phonebook phonebook2 = new Phonebook("Даниил Одоевский", "+7 911 286 47 24");
        Phonebook phonebook3 = new Phonebook("Александр Васютин", "+7 931 576 77 85");
        Phonebook phonebook4 = new Phonebook("Данил Круговой", "+7 999 946 88 20");
        Phonebook phonebook5 = new Phonebook("Дмитрий Чистяков", "+7 921 546 87 43");
        Phonebook phonebook6 = new Phonebook("Вячеслав Караваев", "+7 921 252 86 35");
        Phonebook phonebook7 = new Phonebook("Арсен Адамов", "+7 921 846 87 44");
        Phonebook phonebook8 = new Phonebook("Нуралы Алип", "+7 921 567 87 27");
        Phonebook phonebook9 = new Phonebook("Дуглас Сантос", "+7 921 777 81 11");
        Phonebook phonebook10 = new Phonebook("Деян Ловрен", "+7 921 309 65 25");
        Phonebook phonebook11 = new Phonebook("Родригао", "+7 921 572 87 69");
        Phonebook phonebook12 = new Phonebook("Вильмар Барриос", "+7 921 734 87 43");
        Phonebook phonebook13 = new Phonebook("Густаво Мантуан", "+7 921 347 87 55");
        Phonebook phonebook14 = new Phonebook("Алексей Сутормин", "+7 921 896 88 25");
        Phonebook phonebook15 = new Phonebook("Далер Кузяев", "+7 921 286 17 20");
        Phonebook phonebook16 = new Phonebook("Александр Ерохин", "+7 921 146 80 25");
        Phonebook phonebook17 = new Phonebook("Зелимхан Бакаев", "+7 921 336 24 25");
        Phonebook phonebook18 = new Phonebook("Андрей Мостовой", "+7 921 078 87 78");
        Phonebook phonebook19 = new Phonebook("Матео Кассьерра", "+7 921 216 67 93");
        Phonebook phonebook20 = new Phonebook("Иван Сергеев", "+7 921 456 80 37");
        phonebook1.addPhoneNumber();
        phonebook2.addPhoneNumber();
        phonebook3.addPhoneNumber();
        phonebook4.addPhoneNumber();
        phonebook5.addPhoneNumber();
        phonebook6.addPhoneNumber();
        phonebook7.addPhoneNumber();
        phonebook8.addPhoneNumber();
        phonebook9.addPhoneNumber();
        phonebook10.addPhoneNumber();
        phonebook11.addPhoneNumber();
        phonebook12.addPhoneNumber();
        phonebook13.addPhoneNumber();
        phonebook14.addPhoneNumber();
        phonebook15.addPhoneNumber();
        phonebook16.addPhoneNumber();
        phonebook17.addPhoneNumber();
        phonebook18.addPhoneNumber();
        phonebook19.addPhoneNumber();
        phonebook20.addPhoneNumber();
        System.out.println(phonebook1.getStringHashMap());
        System.out.println(phonebook2.getStringHashMap());
        System.out.println(phonebook3.getStringHashMap());
        System.out.println(phonebook4.getStringHashMap());
        System.out.println(phonebook5.getStringHashMap());
        System.out.println(phonebook6.getStringHashMap());
        System.out.println(phonebook7.getStringHashMap());
        System.out.println(phonebook8.getStringHashMap());
        System.out.println(phonebook9.getStringHashMap());
        System.out.println(phonebook10.getStringHashMap());
        System.out.println(phonebook11.getStringHashMap());
        System.out.println(phonebook12.getStringHashMap());
        System.out.println(phonebook13.getStringHashMap());
        System.out.println(phonebook14.getStringHashMap());
        System.out.println(phonebook15.getStringHashMap());
        System.out.println(phonebook16.getStringHashMap());
        System.out.println(phonebook17.getStringHashMap());
        System.out.println(phonebook18.getStringHashMap());
        System.out.println(phonebook19.getStringHashMap());
        System.out.println(phonebook20.getStringHashMap());
    }
}