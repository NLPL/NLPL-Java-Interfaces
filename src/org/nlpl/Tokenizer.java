package org.nlpl;

import java.util.List;
import java.util.Map;

public interface Tokenizer {
	public class Result {
		public final String text;
		public final List<Token> tokens;

		public Result(String inputText, List<Token> tokens) {
			this.text = inputText;
			this.tokens = tokens;
		}

		public static class Token {
			public final int end;
			public final int start;
			public final String lemma;
			public final Map<String, String> details;

			public Token(int start, int end, String lemma, Map<String, String> details) {
				this.start = start;
				this.end = end;
				this.lemma = lemma;
				this.details = details;
			}
		}
	}

	public Result tokenize(String inputText);
}
