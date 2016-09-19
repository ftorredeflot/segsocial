package com.seguridadsocial;
import java.util.*;

public class SeguridadSocial {
    private List<Persona> personasList;
    private Map<String, Persona> pdni =new HashMap<>();
    private Map<String, Persona> pnss =new HashMap<>();
    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    public void altaPersona(Persona persona) {

        boolean repe;
        repe = true;
        for(int i=0;i<personasList.size();i++){

            if(personasList.get(i).getDni().equals(persona.getDni())|| personasList.get(i).getNss().equals(persona.getNss())) {
                repe = false;
            }

        }

        if(repe){
                personasList.add(persona);
                pdni.put(persona.getDni(), persona);
        }



    }
   // public void bajaPersona(String dni) {
    //}
    public Persona obtenerPersonaPorDNI(String dni) {

        return pdni.get(dni);
    }
   // public Persona obtenerPersonaPorNumSS(String numSS) {
   // }
   // public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
  //  }
  //  public List<Persona> obtenerPersonasMayoresQue(int edad){
  //  }
  //  public List<Persona> obtenerTodas(){
   // }
    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }

}
