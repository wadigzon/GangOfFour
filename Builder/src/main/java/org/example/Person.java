package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    // private constructor to force the use of the builder
    private Person() {}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Builder class
    static class PersonBuilder {
        private Person person = new Person();

        public PersonBuilder setFirstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            person.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            person.address = address;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
