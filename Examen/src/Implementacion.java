import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos {
	List<Refaccionaria> listaRefaccionaria = new ArrayList<Refaccionaria>();

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(listaRefaccionaria);

	}

	@Override
	public void guardar(Refaccionaria refaccion) {
		// TODO Auto-generated method stub
		boolean existe = false;
		for (Refaccionaria refac : listaRefaccionaria) {
			if (refac.getNombreRefaccion().equals(refaccion.getNombreRefaccion())) {
				existe = true;
				break;
			}
		}

		if (existe) {
			System.out.println("YA EXISTE UNA REFACCION CON ESE NOMBRE");
		} else {
			listaRefaccionaria.add(refaccion);
			System.out.println("SE GUARDÓ CON ÉXITO " + refaccion);
		}

	}

	@Override
	public void editar(String nombreRefaccion, Refaccionaria refaccion) {
		// TODO Auto-generated method stub
		for (Refaccionaria refac : listaRefaccionaria) {
			if (refac.getNombreRefaccion().equals(nombreRefaccion)) {
				refac.setCantidad(refaccion.getCantidad());
				refac.setPrecioRefaccion(refaccion.getPrecioRefaccion());
			}

		}

	}

	@Override
	public void eliminar(String nombreRefaccion) {
		// TODO Auto-generated method stub
		for (Refaccionaria refac : listaRefaccionaria) {
			if (refac.getNombreRefaccion().equals(nombreRefaccion)) {
				listaRefaccionaria.remove(refac);
				break;
			}
		}

	}

	@Override
	public Refaccionaria buscar(String tipoRefaccion) {
		// TODO Auto-generated method stub
		Refaccionaria refa = null;

		for (Refaccionaria refac : listaRefaccionaria) {
			if (refac.getTipoRefaccion().equals(tipoRefaccion)) {
				refa = refac;
				System.out.println("Se encontro " + refac);
			}
		}

		if (refa == null) {
			System.out.println("No existe esa refaccion");
		}
		return refa;
	}

	public Refaccionaria buscarNombre(String nombreRefaccion) {
		Refaccionaria ref = null;
	
		for (Refaccionaria refac : listaRefaccionaria) {
			if (refac.getNombreRefaccion().equals(nombreRefaccion)) {
				ref = refac;
				System.out.println("SE ENCONTRÓ "+refac);
			}
		}
		if(ref == null) {
			System.out.println("NO EXISTE ESA REFACCIÓN");
		}
		return ref;
	}
}