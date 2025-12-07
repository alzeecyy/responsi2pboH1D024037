public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        EWalletPayment ewallet = new EWalletPayment("OVO", 150000, 50000);
        System.out.printf("Saldo awal: %.0f\n", ewallet.getBalance());
        System.out.printf("Memproses pembayaran sebesar %.0f...\n", ewallet.getNominalPembayaran());
        System.out.println(ewallet.processPayment());
        System.out.printf("Sisa saldo: %.0f\n", ewallet.getBalance());
        System.out.println("Detail Transaksi: " + ewallet.getPaymentDetails());
    }
}