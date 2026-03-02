public class OOPSBannerUC6 {

    static String oLine(int row) {
        if (row == 0 || row == 3) return "****";
        return "*   *";
    }

    static String pLine(int row) {
        if (row == 0 || row == 2) return "****";
        if (row == 1) return "*   *";
        return "*";
    }

    static String sLine(int row) {
        if (row == 0 || row == 2 || row == 3) return "****";
        return "*";
    }

    public static void main(String[] args) {

        String[] banner = new String[4];

        for (int i = 0; i < 4; i++) {
            banner[i] = String.join(" ",
                    oLine(i),
                    pLine(i),
                    pLine(i),
                    sLine(i)
            );
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}