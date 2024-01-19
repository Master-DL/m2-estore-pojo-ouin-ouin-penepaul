package main;

import estore.services.implem.src.services.Bank;
import estore.services.implem.src.services.Client;
import estore.services.implem.src.services.Provider;
import estore.services.implem.src.services.Store;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		Bank bank = new Bank();
		Store store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
