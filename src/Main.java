import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /*Hospital*/
        Hospital hospital = new Hospital("Hospital 1", "Lima 345");

        /*Areas*/
        Area pediatria = new Area("Nenes",1,TipoArea.PEDIATRIA);
        Area emergencias = new Area("Urgencias",1,TipoArea.EMERGENCIAS);
        Area cirugia = new Area("Cirugias",1,TipoArea.CIRUGIA);

        /*Habitaciones*/
        Habitacion habitacionPediatria1 = new Habitacion(1,2,pediatria);
        Habitacion habitacionPediatria2 = new Habitacion(2,2,pediatria);
        Habitacion habitacionPediatria3 = new Habitacion(3,2,pediatria);
        Habitacion habitacionPediatria4 = new Habitacion(4,2,pediatria);

        pediatria.agregarHabitacion(habitacionPediatria1);
        pediatria.agregarHabitacion(habitacionPediatria2);
        pediatria.agregarHabitacion(habitacionPediatria3);
        pediatria.agregarHabitacion(habitacionPediatria4);

        /*Colaboradores*/
        Colaborador pediatra = new Colaborador("Carlos Perez", 46821136,LocalDate.of(2023, 5, 10),123, Especialidad.PEDIATRA, LocalDate.of(2023, 5, 10));
        Colaborador enfermera = new Colaborador("Carla Perez", 46821236,LocalDate.of(2023, 5, 10),121, Especialidad.MEDICO_DE_EMERGENCIAS, LocalDate.of(2023, 5, 10));

        /*Pacientes*/

        Paciente paciente1 = new Paciente("Pancho Perez", 46712536,LocalDate.of(2023, 5, 10), 312,LocalDate.of(2023, 5, 10),"Dolor de cabeza");
        Paciente paciente2 = new Paciente("Pancho Perez", 46712536,LocalDate.of(2023, 5, 10), 312,LocalDate.of(2023, 5, 10),"Dolor de cabeza");
        Paciente paciente3 = new Paciente("Pancho Perez", 46712536,LocalDate.of(2023, 5, 10), 312,LocalDate.of(2023, 5, 10),"Dolor de cabeza");

        /*Atencion*/
        Atencion atencion = new Atencion(LocalDate.of(2023, 5, 10),"Urgencia","Urgencia", 30, pediatra, paciente1);

        /*Internacion*/
        atencion.asociarInternacion(LocalDate.of(2023, 5, 10),"Dolor de cabeza",paciente1,enfermera,habitacionPediatria1);

        /*Traslado*/
        Internacion internacion = atencion.getInternacion();
        internacion.getInfoInternacion();
        Traslado traslado = internacion.solicitarTraslado(emergencias,"a","A");
        internacion.verificarTraslado(traslado);

        traslado.autorizar();

        internacion.verificarTraslado(traslado);

        internacion.getInfoInternacion();


    }
}