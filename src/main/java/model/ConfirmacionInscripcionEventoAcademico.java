package model;

import medio.MedioNotificacion;
import java.util.Date;

public class ConfirmacionInscripcionEventoAcademico extends Notificacion {

    public ConfirmacionInscripcionEventoAcademico() {}

    public ConfirmacionInscripcionEventoAcademico(String codigo, String destinatario, String mensaje,
                                                  Date fechaEnvio, String estado, MedioNotificacion medioNotificacion) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado, medioNotificacion);
    }

    @Override
    public void enviar() {
        getMedioNotificacion().enviar(getMensaje(), getDestinatario());
    }
}
