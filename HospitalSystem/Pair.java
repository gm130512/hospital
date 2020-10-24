
import java.util.Objects;

public class Pair {
    private Patient patient;
    private Physician physician;

    public Pair(Patient patient, Physician physician) {
        this.patient = patient;
        this.physician = physician;
    }

    public Patient getPatient() {
        return patient;
    }

    public Physician getPhysician() {
        return physician;
    }

    // equals and hashCode for HashTable.get()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return patient.equals(pair.patient) &&
                physician.equals(pair.physician);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient, physician);
    }
}
