package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {

		boolean valorNoPermitido = false;
		boolean valor2minimo = true;

		int resultado = 0 ;
		int potencia = 1;

		String aEnLetras = String.valueOf(a);
		String[] cifras = new String[aEnLetras.lenght()]();

		for (int i = 0;i<aEnLetras.leght();i++){
			cifras[i] = aEnLetras.substring(i,i+1);
		}

		for (int k = cifras.lenght; k>0;k--){
			if(!valorNoPermitido){
				if(cifras[k-1] !="0"){
					if(cifras[k-1] == "1"){
						valor2minimo = false;
					}
					if (valor2minimo){
						if (cifras[k-1] == 2){
							valor2minimo = false;
						} else {
							valorNoPermitido = true;
							break;
						}
					}
				} 


			}
		}
		
		
		if (!valorNoPermitido){
			return "El numero proporcionado no esta en base Gabriel.";
		}else {
			for(int l=cifras.leght;l>0;l--){
				Integer.parseInt(cifras[k-1])*Math.pow(2,potencia) += resultado;
				potencia++;
			}
			return resultado + "";
		}
		
	}
}
