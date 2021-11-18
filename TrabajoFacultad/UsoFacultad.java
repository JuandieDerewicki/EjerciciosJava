package TrabajoFacultad;

public class UsoFacultad {
    public static void main(String[] args) {
        Facultad utn = new Facultad("UNNE");

        Carrera Programacion = new Carrera("programacion");
        utn.AgregarCarrera(Programacion);

        Materia SPD = new Materia("SPD", "Facundo Matoff");
        Programacion.AgregarMaterias(SPD);

        Materia ASO = new Materia("Arquitectura y SO", "Andres Roa");
        Programacion.AgregarMaterias(ASO);

        Estudiantes E1 = new Estudiantes("Jorge", "MateMovil", 42422);
        SPD.AgregarEstudiantes(E1);
        System.out.println(utn);

        Programacion.EliminarMateria("Arquitectura y SO");
        Materia ASO1 = new Materia("INGLES","JORGE");
        ASO1.AgregarEstudiantes(E1);


        System.out.println(utn);


    }
}
