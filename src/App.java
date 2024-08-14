
public class App {

    public static void main(String[] args) {
        Lista miLista = new Lista("de enteros");
        for (int i = 0; i < 10; i++) {
            miLista.insertar(i);
        }
        NodoLista generico = new NodoLista(0, null);
        generico = miLista.inicio;
        System.out.println(generico.dato);
        
        for (int i = 0; i < 10; i++) {
            generico = generico.sig;
            System.out.println(generico.dato);
        }  


    }
}

class NodoLista {
    public int dato;
    public NodoLista sig;

    public NodoLista(int dato, NodoLista nodo) {
        this.dato = dato;
        this.sig = null;
        nodo.sig = this;
    }
}

class Lista {
    public NodoLista inicio;
    public String nombre;

    public Lista(String nombreLista) {
        this.inicio = null;
        this.nombre = nombreLista;
    }

    public void eliminarLista() {
        this.inicio = null;
    }

    public void insertar(int num) {
        if (inicio == null) {
            inicio = new NodoLista(num, null);
        } else {
            // buscar el último elemento
            NodoLista nodoAinsertar = new NodoLista(num, null);
            nodoAinsertar.sig = inicio;
            while (nodoAinsertar.sig != null) {
                nodoAinsertar.sig = nodoAinsertar.sig.sig;
            }
            nodoAinsertar.sig.sig = nodoAinsertar;
            nodoAinsertar.sig = null;
        }
    }

}
