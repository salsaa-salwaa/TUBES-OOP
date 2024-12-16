class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private String appointmentDate;
    private String status; 
    //tambahkan status pembayaran (paid/unpaid)

    public Appointment(String appointmentId, String patientId, String doctorId, String appointmentDate, String status) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.status = status;
        //status pembayaran
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // public void  ()){
        // status pembayaran
    // }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getStatus() {
        return status;
    }
}