/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.Tarea;
import java.util.List;
import Servicios.TareaFileManagment;

/**
 *
 * @author luisr
 */
public class TareaController {
    private final TareaFileManagment tareaService = new TareaFileManagment();

    public Tarea crearTarea(String nombre, Integer tiempoEnfoque, Integer numeroPomodoros, String username) {
        Integer id = tareaService.getTaskId();
        Tarea tarea = new Tarea(id, nombre, tiempoEnfoque, numeroPomodoros, username);
        tareaService.createTask(tarea);
        return tarea;
    }

    public List<Tarea> obtenerTareas(String username) {
        return tareaService.getTasks(username);
    }

    public void eliminarTarea(Integer id) {
        tareaService.deleteTask(id);
    }

    public void actualizarTarea(Tarea tarea) {
        tareaService.updateTask(tarea);
    }
}
