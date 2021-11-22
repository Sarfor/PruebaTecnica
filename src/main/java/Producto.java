
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saraf
 */
public class Producto {

    public Producto(String nombre_producto, int precio_producto, int cantidad_disponible_producto, int descuento_producto) {
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean noexit = true;
        ArrayList<Producto> productos = new ArrayList<>();
        HashMap<String, Integer> categorias = new HashMap<>();

        while (noexit) {
            System.out.println("Elegir opcion: ");
            System.out.println("1. Crear un nuevo producto.");
            System.out.println("2. Crear una nueva categoría.");
            System.out.println("3. Indicar que un producto pertenece o que ya no pertenece a una categoría.");
            System.out.println("4. Asignar y/o quitar el descuento a una categoría.");
            System.out.println("5. Asignar y/o quitar el descuento a un producto.");
            System.out.println("6. Listar todas las categorías y su información.");
            System.out.println("7. Listar todos los productos y su información.");
            System.out.println("8. Listar todos los productos que pertenecen a una categoría.");
            System.out.println("9. Modificar la cantidad disponible de un producto.");
            System.out.println("10. Comprar un producto y escoger la cantidad a comprar;");
            System.out.println("11. Salir");
            int input = read.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Crear un nuevo producto");
                    try {
                        System.out.println("Ingresar nombre producto");
                        String nombre_producto = read.next();
                        System.out.println("Ingresar precio producto");
                        int precio_producto = read.nextInt();
                        System.out.println("Ingresar cantidad disponible producto");
                        int cantidad_disponible_producto = read.nextInt();
                        System.out.println("Ingresar descuento producto");
                        int descuento_producto = read.nextInt();
                        Producto prod = new Producto(nombre_producto, precio_producto, cantidad_disponible_producto, descuento_producto);
                        productos.add(prod);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.println("Producto agregado");
                        System.out.println();
                    }
                    break;
                case 2:
                    try {
                    System.out.println("Crear nueva categoria");
                    System.out.println("Ingresar nombre categoria");
                    String nombre = read.next();
                    System.out.println("Ingresar descuento categoria");
                    int descuento = read.nextInt();
                    categorias.put(nombre, descuento);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                finally {
                        System.out.println("La categoria fue agregada");
                        System.out.println();
                    }
                break;
                case 3:
                    System.out.println("Indicar categoria de producto");
                    System.out.println("Ingresar nombre del producto");
                    String nombre_producto = read.next();
                    for (int i = 0; i < productos.size(); i++) {
                        if (productos.get(i).getNombre().equals(nombre_producto)) {
                            System.out.println("A cual categoria pertenece?");
                            String cat = read.next();
                            productos.get(i).addCategoria(cat);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Asignar descuento a categoria");
                    System.out.println("Ingresar nombre de la categoria");
                    String nombre_categoria = read.next();
                    System.out.println("Ingresar descuento de la categoria");
                    Integer descuento_categoria = read.nextInt();
                    categorias.put(nombre_categoria, descuento_categoria);

                    break;
                case 5:
                    System.out.println("Asignar descuento a producto");
                    System.out.println("Ingresar nombre del producto");
                    nombre_producto = read.next();
                    for (int i = 0; i < productos.size(); i++) {
                        if (nombre_producto.equals(productos.get(i).getNombre())) {
                            System.out.println("Nuevo descuento producto:");
                            Integer descuento_producto = read.nextInt();
                            productos.get(i).setDescuento(descuento_producto);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Todas las categorias");
                    String categorias_info = "";
                    for (String cat : categorias.keySet()) {
                        categorias_info += String.format("Categoria %s descuento %d", cat, categorias.get(cat));
                    }
                    System.out.println(categorias_info);
                    break;
                case 7:
                    System.out.println("Todos los productos");
                    for (Producto producto : productos) {
                        System.out.println(producto.toString());
                    }
                    break;
                default:
                    System.out.println("Saliendo");
                    noexit = false;
                    break;
            }

        }
    }

    private void setDescuento(Integer descuento_producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addCategoria(String cat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Prod {
    private String nombre;
    private int precio;
    private int cantidad_disponible;
    private int descuento;
    private ArrayList<String> categorias;


public Prod(String nombre, int precio, int cantidad_disponible, int descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_disponible = cantidad_disponible;
        this.descuento = descuento;
        this.categorias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }
}