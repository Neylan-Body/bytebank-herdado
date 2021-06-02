
public class Cliente implements Autenticavel{

	private AutenticaUsuarios autenticaUsuarios;
	
	public Cliente() {
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

}
