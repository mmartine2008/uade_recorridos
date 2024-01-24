import tda.Grafo;

@SuppressWarnings("unchecked")
public class Principal {
        public static void main (String [ ] args) {
                System.out.println("Grafos");

                Grafo<String> g = new Grafo();
                g.AgregaVertice("1");
                g.AgregaVertice("2");
                g.AgregaVertice("3");
                g.AgregaVertice("4");
                g.AgregaVertice("5");

                g.AgregaArco("1", "2");
                g.AgregaArco("2", "5");
                g.AgregaArco("2", "3");
                g.AgregaArco("2", "4");
                g.AgregaArco("3", "4");

                g.iniciarVisitaPrimeroProfundidad();
        }    
}
