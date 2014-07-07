package base;

import com.mythicscape.batclient.interfaces.BatClientPlugin;

public class BasePlugin extends BatClientPlugin  {
	
	public void loadPlugin() {
		this.getClientGUI().printText("generic", "--- Loaded BasePlugin ---\n");
	}

	public String getName(){
		return "basePlugin";
	}
}
