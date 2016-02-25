package aPlugin;

import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;

public class JAR_Plugin implements PlugIn {
	static boolean showArgs = true;

	public void run(String arg) {
		if (arg.equals("about1") || arg.equals("about2"))
			{showAbout(); return;}
            
		if (arg.equals("uninstall"))
			{showUnintallDialog(); return;}
            
		String msg = "";
		if (arg.equals("options1"))
			msg = "Edit>Options>JAR Demo...";
		else if (arg.equals("options2"))
			msg = "Plugins>JAR Demo>JAR Demo Options...";
		else if (arg.equals("import1") || arg.equals("import2"))
			msg = "File>Import>JAR Demo (Import x)";
		else if (arg.equals("save"))
			msg = "File>Save As>JAR Demo (Save As)";
		else if (arg.equals("tools"))
			msg = "Analyze>Tools>JAR Demo (Tools)";
		else if (arg.equals("plugins"))
			msg = "Plugins>JAR Demo (Plugins)";
		else if (arg.equals("run"))
			msg = "Plugins>JAR Demo>Run JAR Demo";
       		IJ.showMessage("JAR Demo", "The \""+msg+"\" command was selected.");
	}
	
	public void showUnintallDialog() {
		IJ.showMessage("JAR Demo", 
            		"To uninstall this plugin, move jar-demo.jar out\n"
			+"of the plugins folder and restart ImageJ.");
    }

	public void showAbout() {
		IJ.showMessage("JAR Plugin", "This plugin demonstrates how plugins can be packaged\n"
			+ "in JAR files and installed in multiple ImageJ menus. The JAR\n"
			+ "file must have an underscore in its name and contain a file\n"
			+ "named \"plugins.config\". More information is available at\n \n"
			+ "    "+"http://rsb.info.nih.gov/ij/plugins/jar-demo.html"
			);
	}

}
