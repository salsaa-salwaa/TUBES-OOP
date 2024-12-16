class Doctor extends User {
    private String specialization;

    public Doctor(String id, String name, String email, String specialization) {
        super(id, name, email);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }

    public boolean isAvailable(String date) {
        // Placeholder logic for checking availability
        return true; // Always returns true for simplicity
    }

    // Getter
    public String getSpecialization() {
        return specialization;
    }
}