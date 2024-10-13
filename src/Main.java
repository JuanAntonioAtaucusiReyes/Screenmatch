import com.antoni.screenmatch.calculos.CalculadoraDeTiempo;
import com.antoni.screenmatch.calculos.FiltroRecomendaciones;
import com.antonio.screenmatch.modelos.Episodio;
import com.antonio.screenmatch.modelos.Pelicula;
import com.antonio.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("encanto");
        miPelicula.setFechDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);

        //miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        //System.out.println(miPelicula.getToatalDeEvaluaciones());

        //System.out.println(miPelicula.calculaMedia());


        Serie OnePiece = new Serie();
        OnePiece.setNombre("oNE_PIECE");
        OnePiece.setFechDeLanzamiento(2017);
        OnePiece.setTemporadas(54);
        OnePiece.setMinutosPorEpisodio(32);
        OnePiece.setEpisodiosPorTemporada(24);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(120);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(OnePiece);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(2);
        episodio.setNombre("la cas de tanos");
        episodio.setSerie(OnePiece);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendaciones.filtra(episodio);

}
}