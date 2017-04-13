package behavioral.pkg2;

public interface RegistrationState {
    RegistrationMessage register(Student newStudent);
    RegistrationMessage unregister(Student existingStudent);
}
