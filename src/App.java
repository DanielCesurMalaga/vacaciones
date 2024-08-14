
public class App {

    public static void main(String[] args) {
        System.out.println();
        Lista miLista = new Lista("lista integers");
        miLista.mostrarLista();
        for (int i = 0; i < 10; i++) {
            miLista.insertar(i);
        }
        miLista.mostrarLista();

    }
}

class NodoLista {
    private int dato;
    private NodoLista sig;

    public NodoLista(int dato, NodoLista nodo) {
        this.dato = dato;
        this.sig = nodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLista getSig() {
        return sig;
    }

    public void setSig(NodoLista sig) {
        this.sig = sig;
    }

}

class Lista {
    private NodoLista inicio;
    private String nombre;

    public Lista(String nombreLista) {
        this.inicio = null;
        this.nombre = nombreLista;
    }

    public NodoLista getInicio() {
        return inicio;
    }

    public void setInicio(NodoLista inicio) {
        this.inicio = inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void eliminarLista() {
        this.inicio = null;
    }

    public void insertar(int num) {
        if (inicio == null) {
            inicio = new NodoLista(num, null);
        } else {
            // se inserta al final de la lista.
            NodoLista nodoTemp = new NodoLista(0, null);
            nodoTemp = this.inicio; // el nodo temp es el nodo inicio.

            // mientras a lo q apunta nodoTemp no sea null, es decir, sea un nodo
            // apunto a lo que apunta él
            while (nodoTemp.getSig() != null) {
                nodoTemp = nodoTemp.getSig();

            }
            // termino cuando el nodo al q apunto apunta a null, es decir, el último
            nodoTemp.setSig(new NodoLista(num, null));
        }
    }

    public void mostrarLista() {
        if (this.inicio == null) {
            System.out.println("La lista está vacía");
        } else {
            NodoLista nodoTemp = this.inicio;
            int contador = 0;
            do {
                System.out.print("elemento [" + contador + "] valor: ");
                System.out.println(nodoTemp.getDato());
                contador++;
                nodoTemp = nodoTemp.getSig();
            } while (nodoTemp.getSig() != null);
            System.out.print("elemento [" + contador + "] valor: ");
            System.out.println(nodoTemp.getDato());
            contador++;
            nodoTemp = nodoTemp.getSig();

            System.out.println("Número total de elementos: " + contador);
        }
    }

}
