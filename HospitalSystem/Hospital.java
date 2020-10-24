
import java.util.HashSet;
import java.util.Hashtable;

public class Hospital {
    private HashSet<Physician> physicians;
    private HashSet<Patient> patients;
    private Hashtable<Pair, Record> records;

    public void addPhysician(Physician physician) {
        if (physician.getHospital() != null) {
            System.out.println(physician.getClass() + "has already registered in" + physician.getHospital().getClass());
            return;
        }

        if (physicians == null)
            physicians = new HashSet<>();
        physicians.add(physician);
        physician.setHospital(this);
    }

    public void addRecord(Patient patient, Physician physician, Record record) {
        if (records == null)
            records = new Hashtable<>();
        records.put(new Pair(patient, physician), record);
    }

    public Record findRecord(Patient patient, Physician physician) {
        return records.get(new Pair(patient, physician));
    }

    public boolean admitPatient(Patient patient) {
        if (patients == null)
            patients = new HashSet<>();

        return patients.add(patient);
    }


}
