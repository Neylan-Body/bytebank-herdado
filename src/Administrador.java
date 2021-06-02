
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticaUsuarios autenticaUsuarios;
	
	public Administrador() {
		this.autenticaUsuarios = new AutenticaUsuarios();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticaUsuarios.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticaUsuarios.setSenha(senha);
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	
}
