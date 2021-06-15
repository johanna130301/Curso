
package dominio;


public class Curso {
    private double [] notas;
    private double promedio;
    private int estudiantesEncimaPromedio;
    public Curso(){
        notas = new double[12];
    }
    //setNotas se actualizan en notas(generar notas)
    public void setNotas(double notas[]){
        this.notas = notas;
    }
    public void mostrarNotas(){
        for(int i=0;i<12;i++){
            System.out.println(this.notas[i]);
        }
    }
    public void setPromedio(){
        //Necesitamos de una auxiliar para almacenar notas
        double promedio=0;
        //Utilizamos un ciclo for para los 12 estudiantes
        for(int i=0;i<12;i++){
            double aux=notas[i];
            promedio=aux+promedio;
        }
        this.promedio = Math.round(promedio/12);
    }
    public void setEstudiantesEncimaPromedio(){
        int estudiantes=0;
        double promedio=0;
        //codigo duplicado ya lo tiene en el aterior metodo
        for(int i=0;i<12;i++){
            //Necesitamos de una auxiliar para almacenar notas
            double aux=notas[i];
            promedio=aux+promedio;
        }
        for(int i=0;i<12;i++){
            //Usamos las condicion if para las notas de los 12 estudiantes
            if(notas[i]>(promedio/12)){
                estudiantes++;
            }
    }
        this.estudiantesEncimaPromedio=estudiantes;
    }
    public double getPromedio(){
        return this.promedio;
    }
    public int getnroEstudiantesEncimaPromedio(){
        return this.estudiantesEncimaPromedio;
    }
    
}
