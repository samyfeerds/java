import nucleo.Funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3;
		f1 = new Funcionario();
		f2 = new Funcionario();
		f3 = new Funcionario();
		f1.setNumeroFuncional(103569);
		f1.setNome("maria");
		f1.setCargo("Professora");
		f1.setSalario(2000);
		f2.setNumeroFuncional(883716);
		f2.setNome("Rodrigo");
		f2.setCargo("Gari");
		f2.setSalario (1800);
		f3.setNumeroFuncional(552318);
		f3.setNome("Rita");
		f3.setCargo("Mecânica");
		f3.setSalario(2935);
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
		f1.aumentarSalario(15);
		f1.mostrarDados();

	}
}
