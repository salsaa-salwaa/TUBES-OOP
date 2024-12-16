class Patient extends User {
    // atribut tambahan adress, no telp
    //displayInfo(): Menampilkan info
    //Getter dan setter atribut 
    private String address;
    private String phoneNumber;

    public Patient(String id, String name, String email, String address, String phoneNumber) {
        super(id, name, email);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
