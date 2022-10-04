/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.canelones.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mx.itson.canelones.entidades.Ingrediente;
import mx.itson.canelones.entidades.Paso;
import mx.itson.canelones.entidades.Receta;
import mx.itson.canelones.enumeradores.Dificultad;

/**
 *
 * @author Christian
 */
public class Main {
    
    public static void main (String[] args){
        
        Receta receta = new Receta();
        receta.setNombre("Sopa de lentejas a la mexicana");
        receta.setDescripcion("SOPA DE LENTEJAS A LA MEXICANA preparada con CONCENTRADO DE TOMATE CON POLLO CONSOMATE®.");
        receta.setNumeroPorciones(4);
        receta.setTiempo(62);
        
            List<Ingrediente> ingredientes = new ArrayList<>();

            Ingrediente ingrediente1 = new Ingrediente();
            ingrediente1.setNombre("1 Taza de Lentejas previamente remojadas por 3 horas y escurridas");
            ingredientes.add(ingrediente1);

            Ingrediente ingrediente2 = new Ingrediente();
            ingrediente2.setNombre("2 Cubos de Concentrado de Tomate con Pollo CONSOMATE®");
            ingredientes.add(ingrediente2);
        
        receta.setIngredientes(ingredientes);
        
             List<Paso> pasos = new ArrayList<>();

            Paso paso1 = new Paso();
            paso1.setOrden(1);
            paso1.setDescripcion("Calienta el agua en una olla, añade las lentejas y cocina a fuego medio por 30 a 35 minutos.");
            pasos.add(paso1);

            Paso paso2 = new Paso();
            paso2.setOrden(2);
            paso2.setDescripcion("Fríe el tocino con la cebolla y el ajo hasta que cambien de color, añade el chile, los jitomates y cocina por 5 minutos.");
            pasos.add(paso2);
            
            Paso paso3 = new Paso();
            paso3.setOrden(3);
            paso3.setDescripcion("Vierte la preparación anterior a las lentejas, agrega el Concentrado de Tomate con Pollo CONSOMATE® y cocina por 5 minutos. Sirve y decora con el aguacate y el cilantro. Ofrece.");
            pasos.add(paso3);
        
        receta.setPasos(pasos);
                
        receta.setDificultad(Dificultad.FACIL);
        
        //Empieza a imprimir 7w7
        
        System.out.println("**RECETAS NESTLÉ**");
        System.out.println("Nombre: " + receta.getNombre());
        System.out.println("Descripcièon: " + receta.getDescripcion());
        System.out.println("");
        System.out.println("El número de porciones es de: " + receta.getNumeroPorciones());
        System.out.println("El tiempo estimado es de: " + receta.getTiempo());
        System.out.println("");
        System.out.println("Ingredientes:");
        
        for(Ingrediente i : receta.getIngredientes()){
            
            System.out.println("- " + i.getNombre());
            
        }
        
         System.out.println("");
        System.out.println("Pasos:");
        
        for(Paso p : receta.getPasos()){
            
            System.out.println(p.getOrden() + ".- " + p.getDescripcion());
            
        }
        
        System.out.println("");
        System.out.println("La dificultad es: " + receta.getDificultad());
        
    }
    
}