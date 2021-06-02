
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Neylan");
		String nome = g1.getNome();
		System.out.println(nome);
		g1.setSalario(5000);
		
		EditorVideo e1 = new EditorVideo();
		e1.setSalario(2000);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(g1);
		controleBonificacao.registra(e1);
		
		System.out.println(controleBonificacao.getSoma());
	}

}
