package TestesComEnums;

import java.util.concurrent.ThreadLocalRandom;


public class GeraCPFeCNPJ {

    public static final class DocGen {
        private static final String SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        private static int dvCnpj(String b, int[] w) {
            int s = 0;
            for (int i = 0; i < w.length; i++) s += (b.charAt(i) - 48) * w[i];
            int r = s % 11; return r < 2 ? 0 : 11 - r;
        }

        public static String generateCnpj(boolean alpha) {
            var rnd = ThreadLocalRandom.current();
            StringBuilder base = new StringBuilder();
            for (int i = 0; i < 8; i++)
                base.append(alpha ? String.valueOf(SET.charAt(rnd.nextInt(36))) : String.valueOf(rnd.nextInt(10)));
            base.append("0001");
            int[] w1 = {5,4,3,2,9,8,7,6,5,4,3,2};
            int[] w2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};
            int d1 = dvCnpj(base.toString(), w1);
            int d2 = dvCnpj(base.toString() + d1, w2);
            return base.toString() + d1 + d2;
        }

        private static int dvCpf(String b) {
            int n = b.length(), s = 0;
            for (int i = 0; i < n; i++) s += (b.charAt(i) - '0') * ((n + 1) - i);
            int r = s % 11; return r < 2 ? 0 : 11 - r;
        }

        public static String generateCpf() {
            var rnd = ThreadLocalRandom.current();
            StringBuilder base = new StringBuilder();
            for (int i = 0; i < 9; i++) base.append(rnd.nextInt(10));
            int d1 = dvCpf(base.toString());
            int d2 = dvCpf(base.toString() + d1);
            return base.toString() + d1 + d2;
        }

    }
//DocGen.generateCpf(); // "11144477735"
//DocGen.generateCnpj(false); // "11222333000181"  (numérico)
//DocGen.generateCnpj(true);  // "12ABC34501DE35"  (alfanumérico)
}




