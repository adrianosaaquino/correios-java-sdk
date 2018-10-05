package br.com.correios.api.postagem.dimensao;

import static java.lang.String.format;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

import br.com.correios.api.exception.FormatacaoNumericaIncorretaException;
import br.com.correios.api.postagem.exception.CorreiosUnsupportedTipoObjetoException;

public class DimensoesDoObjeto {

	private final static NumberFormat FORMATADOR_COM_PONTO = NumberFormat.getNumberInstance();
	private final static NumberFormat FORMATADOR_COM_VIRGULA = NumberFormat.getNumberInstance(new Locale("pt", "BR"));

	/**
	 * Contém o código do tipo de objeto que foi postado (embalagem)
	 * 001 - Envelope
	 * 002 - Pacote / Caixa
	 * 003 - Rolo / Cilindro
	 *
	 * Tipo: Caractere (3)
	 *
	 * Preenchimento Obrigatório.
	 * Para 001 – Não prencher as tags de dimensões.
	 * Para 002 – Preencher as tags: altura, largura e comprimento.
	 * Para 003 – Preencher as tags: comprimento e diâmetro.
	 */
    private TipoDoObjetoSendoEnviado tipo;

    /**
     * Altura do objeto (em cm)
     *
     * Tipo: Inteiro (5)
     *
     * Para:
     * <tipo_objeto> = 001, preencher com "0"
     * <tipo_objeto> = 002, obrigatório
     * <tipo_objeto> = 003, preencher com "0"
     */
    private String altura;

    /**
     * Largura do objeto (em cm)
     *
     * Tipo: Inteiro (5)
     *
     * Para:
     * <tipo_objeto> = 001, preencher com "0"
     * <tipo_objeto> = 002, obrigatório
     * <tipo_objeto> = 003, preencher com "0"
     */
    private String largura;

    /**
     * Comprimento do objeto (em cm)
     *
     * Tipo: Inteiro (5)
     *
     * Para:
     * <tipo_objeto> = 001, preencher com "0"
     * <tipo_objeto> = 002, obrigatório
     * <tipo_objeto> = 003, obrigatório
     */
    private String comprimento;


    /**
     * Diametro do objeto (em cm)
     *
     * Tipo: Inteiro (5)
     *
     * Para:
     * <tipo_objeto> = 001, preencher com "0"
     * <tipo_objeto> = 002, preencher com "0"
     * <tipo_objeto> = 003, obrigatório
     */
    private int diametro;

    public enum TipoDoObjetoSendoEnviado {
    	ENVELOPE("1", 3), PACOTE_OU_CAIXA("2", 1), ROLO_OU_CILINDRO("3", 2);

    	private String codigoInternoDosCorreios;
		private int codigoInternoParaEstimativa;

    	TipoDoObjetoSendoEnviado(String codigoInternoDosCorreios, int codigoInternoParaEstimativa) {
    		this.codigoInternoDosCorreios = codigoInternoDosCorreios;
			this.codigoInternoParaEstimativa = codigoInternoParaEstimativa;
    	}

    	public String getCodigoInternoDosCorreios() {
			return codigoInternoDosCorreios;
		}

    	public int getCodigoInternoParaEstimativa() {
    		return codigoInternoParaEstimativa;
    	}

    	public static TipoDoObjetoSendoEnviado getTipoDoObjetoAPartirDoCodigo(String codigoInternoDosCorreios) {
    		if (ENVELOPE.codigoInternoDosCorreios.equals(codigoInternoDosCorreios)) {
				return ENVELOPE;
			}
    		else if (PACOTE_OU_CAIXA.codigoInternoDosCorreios.equals(codigoInternoDosCorreios)) {
    			return PACOTE_OU_CAIXA;
    		}
    		else if (ROLO_OU_CILINDRO.codigoInternoDosCorreios.equals(codigoInternoDosCorreios)) {
    			return ROLO_OU_CILINDRO;
    		}
    		throw new CorreiosUnsupportedTipoObjetoException(format("O seguinte tipo não é suportado pelos Correios: %s", codigoInternoDosCorreios));
    	}

    }

	public DimensoesDoObjeto(TipoDoObjetoSendoEnviado tipo, String altura, String largura, String comprimento, int diametro) {
		this.tipo = tipo;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.diametro = diametro;
	}

	public TipoDoObjetoSendoEnviado getTipo() {
		return tipo;
	}

	public String getAltura() {
		return altura;
	}

	public String getLargura() {
		return largura;
	}

	public String getComprimento() {
		return comprimento;
	}

	public int getDiametro() {
		return diametro;
	}

	public Integer getComprimentoNumerico() {
		return parseNumber(comprimento);
	}

	public Integer getAlturaNumerico() {
		return parseNumber(altura);
	}

	public Integer getLarguraNumerico() {
		return parseNumber(largura);
	}

	private Integer parseNumber(String number) {
		if (StringUtils.isNotEmpty(number)) {

			try {
				if (number.contains(",")) {
					return FORMATADOR_COM_VIRGULA.parse(number).intValue();
				}
				return FORMATADOR_COM_PONTO.parse(number).intValue();
			} catch (ParseException e) {
				throw new FormatacaoNumericaIncorretaException(e);
			}
		}

		return null;
	}

}
