class Customer {
    // TODO: Buatkan atribut
    protected String nama;
    protected String id;
    protected int totalBelanja;

    // TODO: Sediakan constructor
    public Customer(String nama, String id, int totalBelanja) {
        this.nama = nama;
        this.id = id;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: " + nama + " | ID: " + id + " | Total Belanja: Rp " + totalBelanja);
    }
}
