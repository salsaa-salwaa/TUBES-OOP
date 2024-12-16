import java.util.ArrayList;
import java.util.List;

class AppointmentManager {
   private List<Appointment> appointments;

   public AppointmentManager() {
      appointments = new ArrayList<>();
   }

   public void createAppointment(String appointmentId, String patientId, String doctorId, String appointmentDate,
         String status) {
      Appointment appointment = new Appointment(appointmentId, patientId, doctorId, appointmentDate, status);
      appointments.add(appointment);
      // disini juga tambahkan status pembayaran
   }

   public List<Appointment> getAppointments() {
      return appointments;
   }
}