public class UjiSDM {
    public static void main(String[] args) {

        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");

        ProgrammerMagang programmer = new ProgrammerMagang("Andi", 50000.0, "1234");

        programmer.hitungGaji(160);

        System.out.println("Status Cuti: " + programmer.getStatusCuti());

        programmer.login("9999");

        programmer.login("1234");

        System.out.println("Role Akses: " + programmer.getRoleAkses());

        programmer.perpanjangKontrak(6);

        programmer.logout();
    }
}
