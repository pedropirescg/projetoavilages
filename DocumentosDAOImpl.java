package dao.impl;

import java.util.List
import java.sql.Connection;
import java.sql.PrepareStatement;
import java.sql.SQLException;

/**
 * Lista todos os documentos dos clientes.
 *
 * @return Todos os documentos dos clientes ordenados pela data decrescente
 * @throws Exception
 */
public List<Documentos> listarDocumentos() throws Exception { //lista de objetos
	String sql = null;
	sql = "SELECT * FROM DOCUMENTOS";
		try{
		ResultSet rs=ConexaoBD.getConnection().preparegStatement(sql).executeQuery();
        /**
         * Pelo que entendi, o ResultSet gera uma tabela que representa um conjunto de dados.
         * O Connection, por meio de uma String que indica qual banco de dados será acessado,
         * permite a comunicação com o SQL.
         * O preparedStatement monta a Query sem necessidade de concatenar as condições,
         * mantendo a query pré compilada no BD e tratando automaticamente os caracteres.
         * Melhorando, muitas vezes, o desempenho da aplicação.
         */
		List<Documentos> lista = new LinkedList<Documentos>();

        /**
         * Try e catch é uma chance de tratar a exceção. De se recuperar do erro.
         */

		while(rs.next()){
		Documentos documentos = new Documentos();
		documentos.setData(rs.getString("DATA"));
		documentos.setCaminhoArquivo(rs.getString("CAMINHOARQUIVO"));
		documentos.setCodigoCliente(rs.getInt("CODIGOCLIENTE"));
		lista.add(documentos);
			}
		} catch (IOException | SQLException ex) {
		System.out.println("Não foi possível listar os documentos");
		throw ex
        /**
         * Não tenho familiaridade com implementação de código que comunique com BD, porém, nas pesquisas
         * notei que SQLException (encapsula diversos erros de BD) e IOException (idenfica falha na comunicação
         * com o BD) são erros não tratáveis, em grande parte. Mas creio que chamar um objeto tipo Exception Handler
         * conforme o BD poderia retornar um erro mais específico.
         */
		}
		return lista;
}