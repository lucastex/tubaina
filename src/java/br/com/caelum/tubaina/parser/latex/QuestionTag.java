package br.com.caelum.tubaina.parser.latex;

import br.com.caelum.tubaina.parser.Tag;

public class QuestionTag implements Tag {

	public String parse(String string, String options) {
		return "\\item{" + string + "}";
	}

}
