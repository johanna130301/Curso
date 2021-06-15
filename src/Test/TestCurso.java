package test;

import dominio.Curso;


public class testCurso {
    public static void main(String[] args){
        //crear un metodo para crear notas
        Curso cursoA = new Curso();
        double [] notas = new double[12];
        llenaNotas(notas);
        //enviar el array a setNotas y mostrarNotas
        cursoA.setNotas(notas);
        cursoA.mostrarNotas();
        cursoA.setEstudiantesEncimaPromedio();
        cursoA.setPromedio();
        System.out.println("Promedio del curso: "+cursoA.getPromedio());
        System.out.println("Numero de estudiantes encima del promedio: "+cursoA.getnroEstudiantesEncimaPromedio());
        }
    public static void llenaNotas(double[] notas){
          for(int i=0;i<12;i++){
            //Utilizamos la funcion Math.round para redondear las notas de los estudiantes
            notas[i]=Math.round(Math.random()*6);
          } 
    }
}