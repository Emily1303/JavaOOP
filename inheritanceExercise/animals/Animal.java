package inheritanceExercise.animals;

public class Animal {

    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalStateException("Invalid input!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("Invalid input!");
        } else {
            this.age = age;
        }
    }

    public void setGender(String gender) {
        if (gender.trim().isEmpty()) {
            throw new IllegalStateException("Invalid input!");
        } else {
            this.gender = gender;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound() {
        return "";
    }

    @Override
    public String toString() {
        return String.format("%s%n" +
                        "%s %d %s%n" +
                        "%s",
                getClass().getSimpleName(), getName(), getAge(), getGender(), produceSound());
    }
}
