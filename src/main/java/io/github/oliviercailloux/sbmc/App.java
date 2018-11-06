package io.github.oliviercailloux.sbmc;

import org.cprover.CProver;

public class App {

	public static void main(String[] args) throws Exception {
		final int i = CProver.nondetInt();
//		CProver.assume(i > 0);
		assert (i > 0);
	}
}
