package main;

import java.rmi.RemoteException;

import br.jus.cnj.www.sgt.sgt_ws_php.ArvoreGenerica;
import br.jus.cnj.www.sgt.sgt_ws_php.Sgt_ws_methodsPortProxy;

public class Teste {
	public static void main(String[] args) {
		Sgt_ws_methodsPortProxy sgt_ws_methodsPortProxy = new Sgt_ws_methodsPortProxy();
		try {
			ArvoreGenerica[] arrayFilhosItemPublicoWS = sgt_ws_methodsPortProxy.getArrayFilhosItemPublicoWS(10207, "A");
			for (ArvoreGenerica arvoreGenerica : arrayFilhosItemPublicoWS) {
				System.out.println(arvoreGenerica);
			}
			System.out.println(sgt_ws_methodsPortProxy.getStringPaisItemPublicoWS(10207, "A"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
