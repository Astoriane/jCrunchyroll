package net.astoriane.jcr.core.module;

import java.util.ArrayList;
import java.util.List;

import net.astoriane.jcr.lib.Strings;

public class Modules {

	public static Module kernelModule = new ModuleKernel(0, Strings.LOCALE_MODULE_KERNEL_NAME);
	public static Module subtitleModule = new ModuleSubtitle(1, Strings.LOCALE_MODULE_SUBTITLE_NAME);
	public static Module loginModule = new ModuleLogin(2, Strings.LOCALE_MODULE_LOGIN_NAME);

	public static List<Module> list = new ArrayList<Module>();

	public static void addList() {
		list.add(kernelModule.getId(), kernelModule);
		list.add(subtitleModule.getId(), subtitleModule);
		list.add(loginModule.getId(), loginModule);
	}

	public static Module getModuleFromName(String s) {
		for (Module mod : list) {
			if (mod.getUnlocalizedName().equals(s)) {
				return mod;
			}

			else
				continue;
		}

		return null;
	}

}
