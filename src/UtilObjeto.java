
public final class UtilObjeto {
	private UtilObjeto() {
	}

	public static final <T> boolean isNull(T objeto) {
		return objeto == null;
	}
	
	public static boolean isCero(long factor) {
        return factor==0;
    }

}
