public class TimeGalo implements TimeEstado {
    private static TimeGalo instance = new TimeGalo();
    private TimeGalo() {}
    public static TimeGalo getInstance() {
        return instance;
    }

    public String compararCom(TimeEstado outroTime) {
        if (outroTime instanceof TimeAmerica) {
            return "Atlético reconhece: América é maior!";
        }
        return "Galo respeita, mas América é maior!";
    }

    public String toString() {
        return "Atlético-MG";
    }
}