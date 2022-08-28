package io.realm;


public interface com_ajstudios_easyattendance_realm_Attendance_ReportsRealmProxyInterface {
    public String realmGet$date();
    public void realmSet$date(String value);
    public String realmGet$monthOnly();
    public void realmSet$monthOnly(String value);
    public String realmGet$dateOnly();
    public void realmSet$dateOnly(String value);
    public String realmGet$classId();
    public void realmSet$classId(String value);
    public String realmGet$date_and_classID();
    public void realmSet$date_and_classID(String value);
    public String realmGet$classname();
    public void realmSet$classname(String value);
    public String realmGet$subjName();
    public void realmSet$subjName(String value);
    public RealmList<com.ajstudios.easyattendance.realm.Attendance_Students_List> realmGet$attendance_students_lists();
    public void realmSet$attendance_students_lists(RealmList<com.ajstudios.easyattendance.realm.Attendance_Students_List> value);
}
