package com.mycompany.exportadordedados;

import java.util.List;

/**
 *
 * @author aluno
 */
abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {

    protected static List<String> TITULOS_COLUNAS;

    public String exportar(List<Produto> listaProdutos) {
        return "a";
    }
}
