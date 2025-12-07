public class EWalletPayment implements PaymentMethod {
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldo;

    public EWalletPayment(String namaLayanan, double saldo, double nominalPembayaran) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalPembayaran = nominalPembayaran;
    }

    @Override
    public double getTransactionFee() {
        return 2000.0;
    }

    @Override
    public String processPayment() {
        double totalBiaya = nominalPembayaran + getTransactionFee();
        if (saldo >= totalBiaya) {
            saldo -= totalBiaya;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan + ".";
    }

    @Override
    public double getBalance() {
        return saldo;
    }

    public double getNominalPembayaran() {
        return nominalPembayaran;
    }
}