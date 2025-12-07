public class EWalletPayment implements PaymentMethod {

    private String namaPenyedia;
    private double saldo;
    private double nominalTransaksi;

    public EWalletPayment(String namaPenyedia, double saldo) {
        this.namaPenyedia = namaPenyedia;
        this.saldo = saldo;
    }

    @Override
    public void processPayment(double amount) {
        this.nominalTransaksi = amount;
        double totalCost = amount + getTransactionFee();

        if (saldo >= totalCost) {
            saldo -= totalCost;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak mencukupi.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaPenyedia;
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return saldo;
    }

}
