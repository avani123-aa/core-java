class HospitalAppointment {

    public static void main(String[] args) {
        bookAppointment(301, "Riya", "Patel", "Cardiology", 987654321);
    }

    static void bookAppointment(int patientId, String firstName,
                                String lastName, String department, long phone) {

        System.out.println("Patient ID: " + patientId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Phone Number: " + phone);
    }
}                        