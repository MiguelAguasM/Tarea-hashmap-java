/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareahashmap;
import java.util.HashMap;

/**
 *
 * @author miguelaguas
 */
public class TareaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se Crea el HashMap
        HashMap<String, Object> informacionPersonal = new HashMap<String, Object>();
        informacionPersonal.put("nombre", "Miguel Aguas");
        informacionPersonal.put("edad", 30);
        informacionPersonal.put("ciudad", "Puerto Baquerizo Moreno");

        //Se accede al valor de ciudad y se modifica por otra ciudad
        String ciudadActual = (String) informacionPersonal.get("ciudad");
        System.out.println("Ciudad de Nacimiento: " + ciudadActual);
        informacionPersonal.put("ciudad", "San Cristobal");//Se reemplaza el valor
        System.out.println("Ciudad Actual: " + informacionPersonal.get("ciudad"));

        //Se Agrega una nueva clave profesion
        informacionPersonal.put("profesion", "Servidor Publico");

        //Se verifica si existe la clave telefono con containsKey.
        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "0985854219");//Si no existe se agregarla con putIfAbsent un numero ficticio.
        }

        //Se elimina la clave edad
        informacionPersonal.remove("edad");

        //Se imprime todo el contenido del HashMap
        System.out.println("\nContenido final del HashMap:");
        for (String clave : informacionPersonal.keySet()) {
            Object valor = informacionPersonal.get(clave);
            System.out.println(clave + ": " + valor);
        }
    }
}
