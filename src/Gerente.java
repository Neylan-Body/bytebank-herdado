
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticaUsuarios autenticaUsuarios;
	
	public Gerente() {
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
