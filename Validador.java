
public class Validador {

    public static boolean ehNumeroValido(String numero){
        return numero != null && numero.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,5}[- .]?\\d{4}$");
    }
    public static boolean ehPalavraValida(String palavra){ 
        return (palavra != null && palavra.matches("^[a-zA-Zà-úÀ-Ú]+"));
    }
}
