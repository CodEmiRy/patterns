package builder;

public class Person {
    private String pesel;
    private String name;
    private String lname;
    private String address;

    private Person(String pesel) {
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static final class PersonBuilder {
        private String pesel;
        private String name;
        private String lname;
        private String address;

        private PersonBuilder(String pesel) {
            this.pesel = pesel;
        }

        public static PersonBuilder aPerson(String pesel) {
            return new PersonBuilder(pesel);
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withLname(String lname) {
            this.lname = lname;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = new Person(pesel);
            person.setName(name);
            person.setLname(lname);
            person.setAddress(address);
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel='" + pesel + '\'' +
                ", name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
