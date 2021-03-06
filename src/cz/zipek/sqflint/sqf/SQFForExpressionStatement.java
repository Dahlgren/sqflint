/*
 * The MIT License
 *
 * Copyright 2016 Jan Zípek <jan at zipek.cz>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package cz.zipek.sqflint.sqf;

import cz.zipek.sqflint.linter.Linter;
import cz.zipek.sqflint.linter.SQFVariable;

/**
 *
 * @author Jan Zípek <jan at zipek.cz>
 */
public class SQFForExpressionStatement extends SQFForStatement {
	private final SQFExpression variable;
	private final SQFExpression from;
	private final SQFExpression to;
	private final SQFExpression step;

	public SQFForExpressionStatement(SQFExpression variable, SQFExpression from, SQFExpression to, SQFExpression step, SQFBlock block) {
		this.variable = variable;
		this.from = from;
		this.to = to;
		this.step = step;
		this.block = block;
	}

	/**
	 * @return the variable
	 */
	public SQFExpression getVariable() {
		return variable;
	}

	/**
	 * @return the from
	 */
	public SQFExpression getFrom() {
		return from;
	}

	/**
	 * @return the to
	 */
	public SQFExpression getTo() {
		return to;
	}

	/**
	 * @return the step
	 */
	public SQFExpression getStep() {
		return step;
	}

	@Override
	public void analyze(Linter source, SQFBlock context) {
		if (getVariable() != null
				&& getVariable().getMain() != null
				&& getVariable().getMain() instanceof SQFString) {
			SQFString lit = (SQFString)getVariable().getMain();
			String ident = lit.getStringContents()
					.toLowerCase();

			SQFVariable var = source.getVariable(ident);
			var.usage.add(lit.getContents());
			var.definitions.add(lit.getContents());
			var.comments.add(null);
		}
		
		if (block != null) {
			block.analyze(source, context);
		}
	}
}
