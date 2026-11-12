package entrega;

public class Economica implements Modalidade {
    private final double tarifaFixa;
    private final double valorPorQuilometro;
    private final double percentualDesconto;
    private final int prazo;

    public Economica(double tarifaFixa, double valorPorQuilometro, double percentualDesconto, int prazo) {
        this.tarifaFixa = tarifaFixa;
        this.valorPorQuilometro = valorPorQuilometro;
        this.percentualDesconto = percentualDesconto;
        this.prazo = prazo;
    }

    @Override
    public double calcularCusto(Pedido pedido) {
        double custoBase = tarifaFixa + pedido.getDistancia() * valorPorQuilometro;
        return custoBase * (1 - percentualDesconto);
    }

    @Override
    public int calcularPrazo(Pedido pedido) {
        return prazo;
    }
}
