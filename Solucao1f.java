public class Solucao1f {
        public static void main(String[] args) {
            // Utilizei o char pois ele garante que um núumero seja inserido por vez
            char milhar = '1';
            char centena = '2';
            char dezena =  '3';
            char unidade = '4';

            String numeroCompleto = "" + milhar + centena + dezena + unidade;

            System.out.println(numeroCompleto);
        }
    }
