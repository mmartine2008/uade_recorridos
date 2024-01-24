package tda;

import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
    private List<T> vertices;
    private List<Arco<T>> arcos;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arcos = new ArrayList<>();
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
            System.out.println(arcos.get(i));
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

    public void Mostrar() {
        MostrarVertices();
        MostrarArcos();
    }
}

