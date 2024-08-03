package operacaoMatematica;

public enum OperacaoMatematica {
    ADICAO,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;

    public double operacao(double x, double y) {
        switch (this) {
            case ADICAO:
                return x + y;
            case SUBTRACAO:
                return x - y;
            case MULTIPLICACAO:
                return x * y;
            case DIVISAO:
                if (y == 0) {
                    System.out.println("Não é possível realizar divisão por 0");
                    return 0;
                }
                return x / y;
            default:
                System.out.println("Operação não reconhecida");
                return 0;
        }
    }

    public static OperacaoMatematica String(String operacao) {
        switch (operacao) {
            case "+":
                return ADICAO;
            case "-":
                return SUBTRACAO;
            case "*":
                return MULTIPLICACAO;
            case "/":
                return DIVISAO;
            default:
                throw new IllegalArgumentException("Operação desconhecida: " + operacao);
        }
    }
}
