package org.jvnet.mjiip.v_3;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.jvnet.mjiip.v_3_0.XJC30Mojo;

import com.sun.tools.xjc.Options;

/**
 * JAXB 3.x Mojo.
 * 
 * @author Aleksei Valikov (valikov@gmx.net)
 */
@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES, requiresDependencyResolution = ResolutionScope.COMPILE, requiresDependencyCollection = ResolutionScope.COMPILE, threadSafe = true)
public class XJC3Mojo extends XJC30Mojo {

	private final org.jvnet.jaxb2.maven2.OptionsFactory<Options> optionsFactory = new OptionsFactory();

	@Override
	protected org.jvnet.jaxb2.maven2.OptionsFactory<Options> getOptionsFactory() {
		return optionsFactory;
	}
}
