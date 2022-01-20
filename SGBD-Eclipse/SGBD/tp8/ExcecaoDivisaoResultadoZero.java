package tp8;

public class ExcecaoDivisaoResultadoZero extends Exception {
	@Override
	public String getMessage() {
		return "O código não irá funcionar pois não existe divisão por zero.";
	}

}
