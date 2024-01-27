
public interface IMetodos {

	public void listar();

	public void guardar(Refaccionaria refaccion);

	public void editar(String nombreRefaccion, Refaccionaria refaccion);

	public void eliminar(String nombreRefaccion);

	public Refaccionaria buscar(String tipoRefaccion);

}
