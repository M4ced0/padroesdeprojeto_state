public class TimeAmerica implements TimeEstado {
    private static TimeAmerica instance = new TimeAmerica();
    private TimeAmerica() {}
    public static TimeAmerica getInstance() {
        return instance;
    }

    public String compararCom(TimeEstado outroTime) {
        return "América é o maior de Minas!";
    }

    public String toString() {
        return "América-MG";
    }
}