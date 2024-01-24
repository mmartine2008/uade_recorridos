package tda;


public class Arco<T> {
    private T origen;
    private T destino;

    public Arco(T origen, T destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public T getOrigen() {
        return this.origen;
    }

    public T getDestino() {
        return this.destino;
    }

    @Override
    public String toString() {
        return "["+origen+", "+destino+"]";
    }

    public boolean igual(Arco otro) {
        return 
            this.origen == otro.getOrigen() &&
            this.destino == otro.getDestino();

    }
}