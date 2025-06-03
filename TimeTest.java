import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void americaSempreMaior() {
        Time time = new Time();
        time.setEstado(TimeAmerica.getInstance());

        assertEquals("América é o maior de Minas!", time.compararCom(TimeGalo.getInstance()));
        assertEquals("América é o maior de Minas!", time.compararCom(TimeCruzeiro.getInstance()));
    }

    @Test
    public void galoReconheceAmerica() {
        Time time = new Time();
        time.setEstado(TimeGalo.getInstance());

        assertEquals("Galo respeita, mas América é maior!", time.compararCom(TimeCruzeiro.getInstance()));
        assertEquals("Atlético reconhece: América é maior!", time.compararCom(TimeAmerica.getInstance()));
    }

    @Test
    public void cruzeiroReconheceAmerica() {
        Time time = new Time();
        time.setEstado(TimeCruzeiro.getInstance());

        assertEquals("Cruzeiro respeita, mas América é maior!", time.compararCom(TimeGalo.getInstance()));
        assertEquals("Cruzeiro reconhece: América é maior!", time.compararCom(TimeAmerica.getInstance()));
    }
}