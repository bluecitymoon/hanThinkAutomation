package com.ls.jobs;

public class AutomaticJobManager {

	public static AutomaticJobManager _instance;

	private AutomaticJobManager() {

	}

	public static AutomaticJobManager getInstance() {

		if (null == _instance) {
			_instance = new AutomaticJobManager();
		}

		return _instance;
	}

}
