package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Producto {
  String nombre;
  String codigo;
  List<Double> precios;

  public Producto(String nombre, String codigo, List<Double> precios) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.precios = precios;
  }

  public void porcentajeCaracteresUnicos() {
    int temp = nombre.length();

    LinkedHashSet<Object> caracteres = new LinkedHashSet<>();
    caracteres.add(temp);
    System.out.println("Caracteres Unicos: {");
    for (Object object : caracteres) {

      System.out.print(caracteres + ",");

    }
    System.out.print("} =");
    System.out.print(caracteres.size());

    int Porsentaje = (caracteres.size() * 100) / temp;

    System.out.println("Total Caracteres: " + temp + "-> Porsentaje: (" + caracteres.size() + " * 100 ) / " + temp + "="
        + Porsentaje + "%");

    System.out.println("");

  }

  public void catidadPreciosRepetidos(List<Producto> lista) {
    int rep = 0;
    TreeSet prec = new TreeSet<>();
    for (int i = 0; i < precios.size(); i++) {
      prec.add(precios);
    }
    rep = precios.size() - prec.size();
    System.out.println("Precios: [" + precios + "] -> Precios Repetidos:" + rep);

  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public List<Double> getPrecios() {
    return precios;
  }

  public void setPrecios(List<Double> precios) {
    this.precios = precios;
  }

}
