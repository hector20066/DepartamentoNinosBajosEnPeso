/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejo;

/**
 *
 * @author Ing. Hector Acevedo
 */
public class ManejoInformacion {

    private Informacion cabeza;
    private static ManejoInformacion manejo;

    public ManejoInformacion() {
        cabeza = null;
    }

    public static ManejoInformacion getManejo() {
        if (manejo == null) {
            manejo = new ManejoInformacion();
        }
        return manejo;
    }

    public void setCabeza(Informacion cabeza) {
        this.cabeza = cabeza;
    }

    public Informacion getCabeza() {
        return cabeza;
    }

    public Informacion ultimo() {
        Informacion temp = cabeza;
        while (temp != null) {
            if (temp.getSiguiente() == null) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

    public int contarNodo() {
        int contador = 0;
        Informacion temp = cabeza;
        while (temp != null) {
            contador++;
            temp = temp.getSiguiente();
        }
        return contador;
    }

    public void agregarNodo(Informacion nuevo) {
        if (cabeza == null) {
            setCabeza(nuevo);
        } else {
            ultimo().setSiguiente(nuevo);
        }
    }

    public void agregarEntreNodos(Informacion nd, Informacion nuevo) {
        nuevo.setSiguiente(nd.getSiguiente());
        nd.setSiguiente(nuevo);
    }

    public void agregarACabeza(Informacion nuevo) {
        nuevo.setSiguiente(cabeza);
        setCabeza(nuevo);
    }

    public Informacion buscar(int identificacion) {
        Informacion temp = cabeza;
        while (temp != null) {
            if (temp.getIdentificacionNino() == identificacion) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

    public void eliminar(Informacion nodo) {
        Informacion anterior;
        if (nodo == cabeza) {
            cabeza = nodo.getSiguiente();
        } else {
            anterior = cabeza;
            while (anterior.getSiguiente() != nodo) {
                anterior = anterior.getSiguiente();
            }
            anterior.setSiguiente(nodo.getSiguiente());

        }
        nodo.setSiguiente(null);
    }

    public void limpiarLista() {
        while (cabeza != null) {
            eliminar(cabeza);
        }
    }

    public void cambiar(Informacion nd1, Informacion nd2) {
        Informacion temp = new Informacion();
        temp.copiarNodo(nd1);
        nd1.copiarNodo(nd2);
        nd2.copiarNodo(temp);
    }

    public void ordenarlista() {
        Informacion ni;
        Informacion nj;
        ni = cabeza;
        while (ni != null) {
            nj = ni.getSiguiente();
            while (nj != null) {
                if (ni.getPeso() > nj.getPeso()) {
                    cambiar(ni, nj);
                }
                nj = nj.getSiguiente();
            }
            ni = ni.getSiguiente();
        }
    }

    // Metodos para contar los niños con bajo peso en cada municipio
    public int bajoPesoMonteria() {
        int contador = 0;
        Informacion temporal = getCabeza();
        while (temporal != null) {
            if (temporal.getMunicipio().equals("Monteria")) {
                if (((temporal.getEdad() >= 2 && temporal.getEdad() <= 3) && temporal.getPeso() < 15) || ((temporal.getEdad() >= 4 && temporal.getEdad() <= 6) && temporal.getPeso() < 25)) {
                    contador++;
                }
            }
            temporal = temporal.getSiguiente();
        }
        return contador;
    }

    public int bajopesoSahagun() {
        int contador = 0;
        Informacion temporal = getCabeza();
        while (temporal != null) {
            if (temporal.getMunicipio().equals("Sahagun")) {
                if (((temporal.getEdad() >= 2 && temporal.getEdad() <= 3) && temporal.getPeso() < 10) || ((temporal.getEdad() >= 4 && temporal.getEdad() <= 6) && temporal.getPeso() < 20)) {
                    contador++;
                }
            }
            temporal = temporal.getSiguiente();
        }
        return contador;
    }

    public int bajoPesoLorica() {
        int contador = 0;
        Informacion temporal = getCabeza();
        while (temporal != null) {
            if (temporal.getMunicipio().equals("Lorica")) {
                if (((temporal.getEdad() >= 2 && temporal.getEdad() <= 3) && temporal.getPeso() < 10) || ((temporal.getEdad() >= 4 && temporal.getEdad() <= 6) && temporal.getPeso() < 20)) {
                    contador++;
                }
            }
            temporal = temporal.getSiguiente();
        }
        return contador;
    }

    // Metodos para contar los niños con baja estatura en cada municipio
    public int estaturaBajaMonteria() {
        int contador = 0;
        Informacion temporal = getCabeza();
        while (temporal != cabeza) {
            if (temporal.getMunicipio().equals("Monteria")) {
                if (((temporal.getEdad() >= 4 && temporal.getEdad() <= 6) && temporal.getEstatura() <= 1.0)) {
                    contador++;
                }
            }
            temporal = temporal.getSiguiente();
        }
        return contador;
    }

    public float estaturaBajaSagahun() {
        int contador = 0;
        Informacion temporal = getCabeza();
        while (temporal != cabeza) {
            if (temporal.getMunicipio().equals("Sahagun")) {
                if (((temporal.getEdad() >= 4 && temporal.getEdad() <= 6) && temporal.getEstatura() <= 1.0)) {
                    contador++;
                }
            }
            temporal = temporal.getSiguiente();
        }
        return contador;
    }
    
    public float EstaturaBajaLorica() {
        int contador = 0;
        Informacion temporal = getCabeza();
        while (temporal != cabeza) {
            if (temporal.getMunicipio().equals("Lorica")) {
                if (((temporal.getEdad() >= 4 && temporal.getEdad() <= 6) && temporal.getEstatura() <= 1.0)) {
                    contador++;
                }
            }
            temporal = temporal.getSiguiente();
        }
        return contador;
    }

}
