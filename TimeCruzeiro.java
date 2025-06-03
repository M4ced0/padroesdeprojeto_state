public class TimeCruzeiro implements TimeEstado {
    private static TimeCruzeiro instance = new TimeCruzeiro();
    private TimeCruzeiro() {}
    public static TimeCruzeiro getInstance() {
        return instance;
    }

    public String compararCom(TimeEstado outroTime) {
        if (outroTime instanceof TimeAmerica) {
            return "Cruzeiro reconhece: América é maior!";
        }
        return "Cruzeiro respeita, mas América é maior!";
    }

    public String toString() {
        return "Cruzeiro";
    }
}