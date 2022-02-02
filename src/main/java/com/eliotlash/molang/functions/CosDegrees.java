package com.eliotlash.molang.functions;

import com.eliotlash.molang.math.IValue;
import com.eliotlash.molang.math.functions.Function;

public class CosDegrees extends Function {
	public CosDegrees(IValue[] values, String name) throws Exception {
		super(values, name);
	}

	@Override
	public int getRequiredArguments() {
		return 1;
	}

	@Override
	public double get() {
		return Math.cos(this.getArg(0) / 180 * Math.PI);
	}
}
