package com.memonto;

/**
 * 管理者-存储类，用于存储管理备份类
 * @author Administrator
 *
 */
public class Storage {
	private Memonto memonto;

	public Storage(Memonto memonto) {
		this.memonto = memonto;
	}

	public Memonto getMemonto() {
		return memonto;
	}

	public void setMemonto(Memonto memonto) {
		this.memonto = memonto;
	}
}
