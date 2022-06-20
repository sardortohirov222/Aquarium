public class Generater {
    private Gender gender;
    private int countor_to_5;
    private int location;

    @Override
    public String toString() {
        return "Generater{" +
                "gender=" + gender +
                ", countor_to_5=" + countor_to_5 +
                ", location=" + location +
                '}';
    }

    public Generater() {
    }

    public Generater(Gender gender, int countor_to_5, int location) {
        this.gender = gender;
        this.countor_to_5 = countor_to_5;
        this.location = location;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getCountor_to_5() {
        return countor_to_5;
    }

    public void setCountor_to_5(int countor_to_5) {
        this.countor_to_5 = countor_to_5;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
