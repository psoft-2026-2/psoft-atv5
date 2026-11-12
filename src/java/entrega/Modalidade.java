package entrega;

public interface Modalidade {
    double calcularCusto(Pedido pedido);

    int calcularPrazo(Pedido pedido);
}
