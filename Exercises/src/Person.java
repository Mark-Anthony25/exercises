public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be between 0 and 120");

        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("male") || gender.equals("female")) {
            throw new IllegalArgumentException("Invalid Gender");

            //this.gender = "Super OLd";
        }
        this.gender = gender;
    }
}
