/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author luisr
 */
public class Tarea {

    private Integer id;
    private String nombre;
    private Integer tiempoEnfoque;
    private Integer numeroPomodoros;
    private String username;

    public Tarea(Integer id, String nombre, Integer tiempoEnfoque, Integer numeroPomodoros, String username) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoEnfoque = tiempoEnfoque;
        this.numeroPomodoros = numeroPomodoros;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTiempoEnfoque() {
        return tiempoEnfoque;
    }

    public Integer getNumeroPomodoros() {
        return numeroPomodoros;
    }

    public String getUsername() {
        return username;
    }

    public void setNumeroPomodoros(Integer numeroPomodoros) {
        this.numeroPomodoros = numeroPomodoros;
    }
    
}
