public class Main {

    public static void main(String[] args) {

        Veiculo fusca = new Veiculo("Fusca","Branca", "Volskwagen","Velho");
        System.out.println(fusca);
    }

    public static class Veiculo {
        private String nome;
        private String cor;
        private String marca;
        private String modelo;

        public Veiculo(String nome, String cor, String marca, String modelo) {
            this.nome = nome;
            this.cor = cor;
            this.marca = marca;
            this.modelo = modelo;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getCor() {
            return cor;
        }
        public String getMarca() {
            return marca;
        }
        public String getModelo() {
            return modelo;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return "Veiculo: " + '\n' +
                    "Nome: " + nome + "\n" +
                    "Cor: " + cor + '\n' +
                    "Marca: " + marca + '\n' +
                    "Modelo: " + modelo + '\n';
        }
    }
}
