import medio.CorreoElectronico;
import medio.MensajeTexto;
import medio.NotificacionMovil;
import model.AvisoCancelacionClase;
import model.ConfirmacionInscripcionEventoAcademico;
import model.PublicacionCalificaciones;
import model.RecordatorioPagoMatricula;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        PublicacionCalificaciones n1 = new PublicacionCalificaciones(
                "N001", "ana@universidad.edu",
                "Se han publicado las calificaciones del semestre.",
                new Date(), "ENVIADO", new CorreoElectronico()
        );
        n1.enviar();

        RecordatorioPagoMatricula n2 = new RecordatorioPagoMatricula(
                "N002", "3101234567",
                "Recuerde pagar su matricula antes del 30 de abril.",
                new Date(), "ENVIADO", new MensajeTexto()
        );
        n2.enviar();

        AvisoCancelacionClase n3 = new AvisoCancelacionClase(
                "N003", "carlos@universidad.edu",
                "La clase de Matematicas del jueves ha sido cancelada.",
                new Date(), "ENVIADO", new NotificacionMovil()
        );
        n3.enviar();

        ConfirmacionInscripcionEventoAcademico n4 = new ConfirmacionInscripcionEventoAcademico(
                "N004", "maria@universidad.edu",
                "Su inscripcion al seminario de investigacion ha sido confirmada.",
                new Date(), "ENVIADO", new CorreoElectronico()
        );
        n4.enviar();
    }
}
