package tp8;

public class ExcecaoDivisaoResultadoZero extends Exception {
	@Override
	public String getMessage() {
		return "O c�digo n�o ir� funcionar pois n�o existe divis�o por zero.";
	}

}
