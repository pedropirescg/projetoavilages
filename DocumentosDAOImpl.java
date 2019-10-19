package dao.impl;

/**
 * Lista todos os documentos dos clientes.
 *
 * @return Todos os documentos dos clientes ordenados pela data decrescente
 * @throws Exception
 */
public List<Documentos> listarDocumentos() throws Exception {
	String sql = null;
	try {
		sql = "SELECT * FROM DOCUMENTOS";
		ResultSet rs = ConexaoBD.getConnection().prepareStatement(sql).executeQuery();
		List<Documentos> lista = new LinkedList<Documentos>();
		
		while (rs.next()) {
			Documentos documentos = new Documentos();
			documentos.setData(rs.getString("DATA"));
			documentos.setCaminhoArquivo(rs.getString("CAMINHOARQUIVO"));
			documentos.setCodigoCliente(rs.getInt("CODIGOCLIENTE"));
			lista.add(documentos);
		}
		return lista;
	} catch (IOException | SQLException ex) {
		System.out.println("Não foi possível listar os documentos");
		throw ex
}