package com.floreysoft.jmte;

import java.util.HashSet;
import java.util.Set;

// ${<h1>,address(NIX),</h1>;long(full)}
public class AssortedCompiledTemplateSamples extends
		AbstractCompiledTemplate {

	public AssortedCompiledTemplateSamples(Engine engine) {
		super(engine);
	}

	@Override
	public Set<String> getUsedVariables() {
		Set<String> usedVariables = new HashSet<String>();
		usedVariables.add("address");
		return usedVariables;
	}

	@Override
	protected String transformCompiled(TemplateContext context) {
		StringBuilder buffer = new StringBuilder();

		buffer.append("PREFIX");
		
		buffer.append(new StringToken("address", "address", "NIX", "<h1>",
				"</h1>", "long", "full").evaluate(context).toString());

		buffer.append("SUFFIX");
		
		return buffer.toString();
	}

}