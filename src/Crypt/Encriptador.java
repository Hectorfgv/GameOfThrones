package Crypt;

public class Encriptador {

	public Encriptador() {

	}

	/**
	 * En esta función implementaremos nuestro proceso de encriptcaión a partir
	 * de la frase de entrada
	 *
	 * @param  frase un String que contendrá la frase a encriptar
	 * @return       el String encriptado
	 */
	public String encriptarFrase(String frase) {
		String fraseCod,invertida,creaFrase;
		creaFrase=crear(frase);
		invertida=invert(creaFrase);
		fraseCod=cesar(invertida);
		return fraseCod;
	}
	public String crear(String frase) {

		String f,frasecod="";
		f=frase;

		for(int i=0;i<frase.length();i++) {

			char letra=f.charAt(i);
			frasecod=frasecod+((char)(letra-1))+letra+((char)(letra+1));

		}
		return frasecod;
	}
	public String invert(String creaFrase) {

		String f;
		f=creaFrase;

		String fraseInvertida="";

		for (int x=f.length()-1;x>=0;x--) {

			fraseInvertida = fraseInvertida + f.charAt(x);

		}
		return fraseInvertida;
	}
	public String cesar(String invertida ) {

		String f;
		f=invertida;
		String alfabeto = "" ;
		String alfabetoCod = "" ;

		String fraseCodificar = "" ;
		String fraseCodificada = "" ;
		int paso = 4 ;
		int posicionLetra = 0 ;

		for (char i=31; i<=126;i++) {
			alfabeto=alfabeto+i;
		}
		// Generar el alfabeto de codificacion

		for(int i=paso;i<alfabeto.length();i++) {

			alfabetoCod=alfabetoCod+alfabeto.charAt(i);
		}
		for(int i=0;i<paso;i++) {

			alfabetoCod=alfabetoCod+alfabeto.charAt(i);
		}


		// Comienza la codificacion

		fraseCodificar = f;

		for(int i=0;i<fraseCodificar.length();i++) {

			posicionLetra=alfabeto.indexOf(fraseCodificar.charAt(i));

			fraseCodificada=fraseCodificada+alfabetoCod.charAt(posicionLetra);

		}


		return fraseCodificada;
	}

}
