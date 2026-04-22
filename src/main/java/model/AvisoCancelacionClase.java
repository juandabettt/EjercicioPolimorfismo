package model;

import medio.MedioNotificacion;
import java.util.Date;

public class AvisoCancelacionClase extends Notificacion {

    public AvisoCancelacionClase() {}

    public AvisoCancelacionClase(String codigo, String destinatario, String mensaje,
                                 Date fechaEnvio, String estado, MedioNotificacion medioNotificacion) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado, medioNotificacion);
    }

    @Override
    public void enviar() {
        getMedioNotificacion().enviar(getMensaje(), getDestinatario());
    }
}
