public class Time {
    private TimeEstado estado;

    public void setEstado(TimeEstado estado) {
        this.estado = estado;
    }

    public TimeEstado getEstado() {
        return estado;
    }

    public String compararCom(TimeEstado outroTime) {
        return estado.compararCom(outroTime);
    }
}