public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Поле Имя должно быть заполнено");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null) {
            throw new IllegalArgumentException("Поле Фамилия должно быть заполнено");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше 0");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Поле Имя не заполнено");
        }
        if (surname == null) {
            throw new IllegalStateException("Поле Фамилия не заполнено");
        }
        return new Person(name, surname, age, address);
    }
}