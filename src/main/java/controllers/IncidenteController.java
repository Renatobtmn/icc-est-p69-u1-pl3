package controllers;

import java.util.List;
import models.Incidente;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
        return incidentes.sort(null);
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        int low=0;
        int high=incidentes.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            Incidente midIncidente=incidentes.get(mid);
            int comparacion=midIncidente.compareTo(objetivo);
            if(comparacion==0){
                return mid;
            }else if(comparacion<0){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    }
}
