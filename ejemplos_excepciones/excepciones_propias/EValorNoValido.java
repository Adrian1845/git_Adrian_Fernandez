package ejemplos_excepciones.excepciones_propias;

public class EValorNoValido extends Exception
{
  public EValorNoValido() {}
  public EValorNoValido(String mensaje)
  {
    super(mensaje);
  }
}
