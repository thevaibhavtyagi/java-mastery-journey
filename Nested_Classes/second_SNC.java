package Nested_Classes;

// BUILDER PATTERN - SNC ------------------------
class Person {
    private final String name;
    private final int age;
    private final String email;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Email: " + email);
    }

    public static class Builder {
        private String name;
        private int age;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

// MAIN CLASS
public class second_SNC {
    public static void main(String[] args) {
        Person p = new Person.Builder()
                        .setName("Vaibhav")
                        .setAge(20)
                        .setEmail("vaibhav@gmail.com")
                        .build();

        p.display();
    }
}