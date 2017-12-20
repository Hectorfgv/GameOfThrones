package Crypt;

public class Desencriptador {

	//AQUI SE DEFINIRÁ LAS VARIABLES A UTILIZAR

	//AQUÍ LAS INICIALIZACIONES
	public Desencriptador() {
	}

	/**
	 * En esta función implementaremos nuestro proceso de desencriptación a partir
	 * de la frase de entrada
	 *
	 * @param  frase un String que contendrá la frase a desencriptar
	 * @return       el String desencriptado
	 */
	public String desencriptarFrase(String frase) {
		String fraseDeCod,invertida,creaFrase;
		//Comienza la codificacion

		creaFrase=crear(frase);		
		invertida=invert(creaFrase);
		fraseDeCod=cesar(invertida);
		return fraseDeCod;
	}
	public String crear(String frase) {

		String f,fraseDeCod="";
		f=frase;
		int cont=0;

		for(int i=0;i<frase.length();i++) {

			char letra=f.charAt(i);
			if (cont==1) {

				fraseDeCod=fraseDeCod+letra;
				cont++;
			}
			else if (cont!=2) {

				cont++;
			}
			else {
				cont=0;
			}

		}
		return fraseDeCod;
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
		String alfabetoTemp = "" ;

		String fraseDeCodificar = "" ;
		String fraseDeCodificada = "" ;
		int paso = 4 ;
		int posicionLetra = 0 ;

		for (char i=31; i<=126;i++) {
			alfabeto=alfabeto+i;
		}
		// Generar el alfabeto de codificacion

		for(int i=paso;i<alfabeto.length();i++) {

			alfabetoCod=alfabetoCod+alfabeto.charAt(i);
		}
		alfabetoTemp=alfabeto;
		alfabeto=alfabetoCod;
		alfabetoCod=alfabetoTemp;

		for(int i=0;i<paso;i++) {

			alfabetoCod=alfabetoCod+alfabeto.charAt(i);
		}


		// Comienza la codificacion

		fraseDeCodificar = f;

		for(int i=0;i<fraseDeCodificar.length();i++) {

			posicionLetra=alfabeto.indexOf(fraseDeCodificar.charAt(i));

			fraseDeCodificada=fraseDeCodificada+alfabetoCod.charAt(posicionLetra);

		}


		return fraseDeCodificada;
	}



}


