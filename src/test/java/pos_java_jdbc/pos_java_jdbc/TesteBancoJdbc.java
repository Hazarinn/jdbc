package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {

//	@Test
//	public void initBanco() {
//		UserPosDAO userPosDAO = new UserPosDAO();
//		Userposjava userposjava = new Userposjava();
//
//		
//		userposjava.setNome("pretão");
//		userposjava.setEmail("pretão@gmail.com");
//		userPosDAO.salvar(userposjava);
//
//	}

	@Test
	public void initListar() {

		try {

			UserPosDAO dao = new UserPosDAO();
			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);

				System.out.println("-----------------------------------------------");	

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void initBuscarPorId() {
		UserPosDAO dao = new UserPosDAO();
		try {

			Userposjava userposjava = dao.buscar(2L);

			System.out.println(userposjava);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Test
	public void initAtualizar() {

		try {
			UserPosDAO dao = new UserPosDAO();

			Userposjava objetoBanco = dao.buscar(5L);
			objetoBanco.setNome("Nome mudado com o método atualizar");
			dao.atualizar(objetoBanco);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void initDeletar() {
		try {
			
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(13L);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Test
	public void testeInsertTelefone() {
		Telefone telefone = new Telefone();
		
		telefone.setNumero("(61) 47875478");
		telefone.setTipo("casa");
		telefone.setUsuario(15L);
		
		UserPosDAO dao = new UserPosDAO();
		dao.salvarTelefone(telefone);
		
	}
	@Test
	public void testeCarregaFonesUser() {
		UserPosDAO dao = new UserPosDAO();
		List<BeanUserFone> beanUserFones = dao.listaUserFone(16L);
		for(BeanUserFone beanUserFone : beanUserFones) {
			System.out.println(beanUserFone);
			System.out.println("-----------------------");
		}
		
	}
	
	@Test
	public void testeDeleteUserFone() {
		UserPosDAO dao = new UserPosDAO();
		dao.deletar(15L);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
