
import java.util.Date;
import java.util.HashSet;

public class Physician {
    private Hospital hospital;
    // treat patient list
    private HashSet<Patient> ownedPatients;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public boolean admitPatient(Patient patient) {
        if (patient.getAdmitPhysician() != null) {
            System.out.println(patient.getClass() + "has already admitted by" + patient.getAdmitPhysician().getClass());
            return false;
        }
        if (this.getHospital() == null) {
            System.out.println("no registered hospital yet");
            return false;
        }
        patient.setAdmittedHospital(this.hospital);
        return this.hospital.admitPatient(patient);
    }

    public void treatPatient(Patient patient) {
        patient.addPhysicians(this);

        if (ownedPatients == null)
            ownedPatients = new HashSet<>();
        ownedPatients.add(patient);

        // create record
        Date date = new Date(System.currentTimeMillis());
        createAndSubmitRecord(patient, date, this.getClass() + "treat" + patient.getClass());
    }
    private void createAndSubmitRecord(Patient patient, Date date, String result) {
        Record record = new Record(patient, this, date, result);
        this.hospital.addRecord(patient, this, record);
    }
}
