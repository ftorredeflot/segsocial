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
                pnss.put(persona.getNss(),persona);
        }



    }
    public void bajaPersona(String dni) {

        personasList.remove(pdni.get(dni));
        pnss.remove(pdni.get(dni).getNss());
        pdni.remove(pdni.get(dni).getDni());


    }
    public Persona obtenerPersonaPorDNI(String dni) {

        return pdni.get(dni);
    }
    public Persona obtenerPersonaPorNumSS(String numSS) {
        return  pnss.get(numSS);
    }
   // public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
  //  }
  //  public List<Persona> obtenerPersonasMayoresQue(int edad){
  //  }
   public List<Persona> obtenerTodas(){
      return personasList;
   }
    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }

}
