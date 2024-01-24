import tda.Grafo;

@SuppressWarnings("unchecked")
public class Principal {
        public static void main (String [ ] args) {
                System.out.println("Grafos");

                Grafo<String> g = new Grafo();
                g.AgregaVertice("A");
                g.AgregaVertice("B");
                g.AgregaVertice("C");
                g.AgregaVertice("D");
                g.AgregaArco("A", "B");
                g.AgregaArco("B", "C");
                g.AgregaArco("A", "D");
                g.AgregaArco("D", "C");

                g.Mostrar();
                g.BorrarVertice("D");
                g.BorrarArco("A", "D");
                g.BorrarArco("D", "C");
                g.Mostrar();

                g.MostrarAdyacentes("B");
        }    
}
