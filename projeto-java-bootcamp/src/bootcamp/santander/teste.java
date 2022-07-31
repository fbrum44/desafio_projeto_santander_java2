package bootcamp.santander;

import bootcamp.santander.singleton.SingletonEager;
import bootcamp.santander.singleton.SingletonLazy;
import bootcamp.santander.singleton.SingletonLazyHolder;
import bootcamp.santander.strategy.Comportamento;
import bootcamp.santander.strategy.ComportamentoDefensivo;
import bootcamp.santander.strategy.ComportamentoNormal;
import bootcamp.santander.strategy.ComportamentoOfensivo;
import bootcamp.santander.strategy.Robo;

public class teste {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento ofensivo = new ComportamentoOfensivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(ofensivo);
		robo.mover();
		robo.mover();
		robo.mover();
	}
}
