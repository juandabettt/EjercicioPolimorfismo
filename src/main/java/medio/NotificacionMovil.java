package medio;

public class NotificacionMovil implements MedioNotificacion {

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando notificacion movil a " + destinatario + ": " + mensaje);
    }
}
