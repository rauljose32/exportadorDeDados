package com.mycompany.exportadordedados;

import java.util.List;

public interface ExportadorListaProduto {

    public String abrirTabela();

    public String fecharTabela();

    public String abrirLinha();

    public String fecharLinha();

    public String fecharLinhaTitulos();

    public String abrirColuna(String valor);

    public String fecharColuna();

    public String exportar(List<Produto> listaProdutos);
    
    public AbstractExportadorListaProduto newInstance();

    public AbstractExportadorListaProduto newInstance(String extensaoArquivoExportacao);

}
