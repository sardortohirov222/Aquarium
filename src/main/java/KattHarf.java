public class KattHarf {
    private String name;
    private int number;

    @Override
    public String toString() {
        return "KattHarf{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public KattHarf() {
    }

    public KattHarf(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
