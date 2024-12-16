import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentManager manager = new AppointmentManager();
        List<Doctor> doctors = new ArrayList<>();
        List<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Doctor Management System ---");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Create Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            // buatkan juga menu untuk crud lainnya pada pasien, janji, dan dokter

            switch (choice) {
                case 1:
                    // System.out.print("Enter Doctor ID: ");
                    // String doctorId = scanner.nextLine();
                    // System.out.print("Enter Doctor Name: ");
                    // String doctorName = scanner.nextLine();
                    // System.out.print("Enter Doctor Email: ");
                    // String doctorEmail = scanner.nextLine();
                    // System.out.print("Enter Specialization: ");
                    // String specialization = scanner.nextLine();
                    // doctors.add(new Doctor(doctorId, doctorName, doctorEmail, specialization));
                    // System.out.println("Doctor added successfully.");
                    break;
                case 2:
                    // System.out.print("Enter Patient ID: ");
                    // String patientId = scanner.nextLine();
                    // System.out.print("Enter Patient Name: ");
                    // String patientName = scanner.nextLine();
                    // System.out.print("Enter Patient Email: ");
                    // String patientEmail = scanner.nextLine();
                    // System.out.print("Enter Address: ");
                    // String address = scanner.nextLine();
                    // System.out.print("Enter Phone Number: ");
                    // String phoneNumber = scanner.nextLine();
                    // patients.add(new Patient(patientId, patientName, patientEmail, address, phoneNumber));
                    // System.out.println("Patient added successfully.");
                    break;

                case 3:
                    // System.out.print("Enter Appointment ID: ");
                    // String appointmentId = scanner.nextLine();
                    // System.out.print("Enter Patient ID: ");
                    // String appPatientId = scanner.nextLine();
                    // System.out.print("Enter Doctor ID: ");
                    // String appDoctorId = scanner.nextLine();
                    // System.out.print("Enter Appointment Date: ");
                    // String appointmentDate = scanner.nextLine();
                    // System.out.print("Enter Status (Scheduled/Cancelled/Completed): ");
                    // String status = scanner.nextLine();
                    // manager.createAppointment(appointmentId, appPatientId, appDoctorId, appointmentDate, status);
                    // System.out.println("Appointment created successfully.");
                    break;

                case 4:
                    // System.out.println("\n--- Appointments ---");
                    // for (Appointment appointment : manager.getAppointments()) {
                    //     System.out.println("ID: " + appointment.getAppointmentId() +
                    //             ", Patient: " + appointment.getPatientId() +
                    //             ", Doctor: " + appointment.getDoctorId() +
                    //             ", Date: " + appointment.getAppointmentDate() +
                    //             ", Status: " + appointment.getStatus());
                    // }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void addDoctor() {
            // untuk tambah dokter
    }

    private static void addAppointment() {
        // untuk tambah dokter
    }

    private static void viewDoctors() {
        //melihat dokter
    }

    // tambahkan fungsi yang lain juga
}

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.layout.AnchorPane;
// import javafx.fxml.FXMLLoader;
// import javafx.stage.Stage;

// public class Main extends Application {
//     @Override
//     public void start(Stage primaryStage) throws Exception {
//         // Muat halaman login sebagai halaman awal
//         FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
//         AnchorPane root = loader.load();
//         Scene scene = new Scene(root);
//         primaryStage.setTitle("Aplikasi Janji Dokter");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
