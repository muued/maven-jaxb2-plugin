package org.jvnet.jaxb2.maven2.tests;

import java.io.InputStream;

import org.codehaus.plexus.util.IOUtil;
import org.junit.Assert;
import org.junit.Test;
import org.jvnet.jaxb2.maven2.RawXJC3Mojo;

public class AddIfExistsToEpisodeSchemaBindingsTest {

	@Test
	public void transformationResourceIsAccessible() {
		InputStream is = RawXJC3Mojo.class
				.getResourceAsStream(RawXJC3Mojo.ADD_IF_EXISTS_TO_EPISODE_SCHEMA_BINDINGS_TRANSFORMATION_RESOURCE_NAME);
		Assert.assertNotNull(is);
		IOUtil.close(is);
	}
}
