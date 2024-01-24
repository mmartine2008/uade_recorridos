package tda;

import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
    private List<T> vertices;
    private List<Arco<T>> arcos;
    private List<T> visitados;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arcos = new ArrayList<>();
        this.visitados = new ArrayList<>();
    }

    public Grafo<T> GrafoVacio() {
        Grafo<T> nuevo = new Grafo<>();
        return nuevo;
    }

    public void AgregaVertice(T vertice) {
        this.vertices.add(vertice);
    }
    
    @SuppressWarnings("unchecked")
    public void AgregaArco(T origen, T destino) {
        Arco<T> nuevo = new Arco(origen, destino);
        this.arcos.add(nuevo);
    }

    public void BorrarVertice(T vertice) {
        vertices.remove(vertice);
    }

    @SuppressWarnings("unchecked")
    public void BorrarArco(T origen, T destino) {
        Arco<T> nuevo = new Arco(origen, destino);
        for (int i = 0; i < arcos.size(); i++) {
            if (arcos.get(i).igual(nuevo))
            {
                arcos.remove(i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> Adyacentes(T vertice) {
        List salida = new ArrayList();
        for (int i = 0; i < arcos.size(); i++) {
            Arco a = arcos.get(i);
            if (a.getOrigen() == vertice) {
                salida.add(a.getDestino());
            }
            if (a.getDestino() == vertice) {
                salida.add(a.getOrigen());
            }
        }

        return salida;
    }

    private void MostrarVertices() {
        System.out.println("Vertices del grafo");
        for (int i = 0; i < vertices.size(); i++) {
                System.out.println(vertices.get(i));
        }        
    }

    private void MostrarArcos() {
        System.out.println("Arcos del grafo");
        for (int i = 0; i < arcos.size(); i++) {
                System.out.println(arcos.get(i));
        }
    }

    public void MostrarAdyacentes(T vertice) {
        List<T> adyacentes = Adyacentes(vertice);

        System.out.println("Adyacentes "+vertice);
        for (int i = 0; i < adyacentes.size(); i++) {
                System.out.println(adyacentes.get(i));
        }         
    }

    private void limpiarVisitados() {
        this.visitados.clear();
    }

    public void iniciarVisitaPrimeroProfundidad() {
        limpiarVisitados();
        T primero = vertices.get(0);
        profundidad(primero);
    }

    private void profundidad(T vertice) {
        visitados.add(vertice);
        System.out.println(vertice);

        List<T> adyacentes = Adyacentes(vertice);

        for (int i = 0; i < adyacentes.size(); i++) {
            T w = adyacentes.get(i);
            if (visitados.indexOf(w) == -1) {
                profundidad(w);
            }        
        }         

    }


    public void Mostrar() {
        MostrarVertices();
        MostrarArcos();
    }
}

