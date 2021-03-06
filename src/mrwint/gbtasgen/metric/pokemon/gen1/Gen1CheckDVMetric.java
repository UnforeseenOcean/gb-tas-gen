package mrwint.gbtasgen.metric.pokemon.gen1;

import static mrwint.gbtasgen.state.Gameboy.curGb;

import java.util.Arrays;

import mrwint.gbtasgen.metric.StateResettingMetric;
import mrwint.gbtasgen.state.Register;
import mrwint.gbtasgen.util.EflUtil;
import mrwint.gbtasgen.util.Util;

public class Gen1CheckDVMetric implements StateResettingMetric {
	private int minAtkDV;
	private int minDefDV;
	private int minSpdDV;
	private int minSpcDV;
	private int maxHPDV;
	private Integer[] whitelist;

	public Gen1CheckDVMetric(int minAtkDV, int minDefDV, int minSpdDV, int minSpcDV, int maxHPDV, Integer... whitelist) {
		this.minAtkDV = minAtkDV;
		this.minDefDV = minDefDV;
		this.minSpdDV = minSpdDV;
		this.minSpcDV = minSpcDV;
		this.maxHPDV = maxHPDV;
		this.whitelist = whitelist;
	}

	@Override
	public int getMetricInternal() {
		EflUtil.runToAddressNoLimit(0, 0, curGb.pokemon.afterDVGenerationAddress, curGb.pokemon.afterWildDVGenerationAddress);
		int a = curGb.getRegister(Register.AF) >> 8;
		int b = curGb.getRegister(Register.BC) >> 8;
		int ab = ((a & 0xFF) << 8) | (b & 0xFF);

		int atk = (a >> 4) & 0xF;
		int def = (a >> 0) & 0xF;
		int spd = (b >> 4) & 0xF;
		int spc = (b >> 0) & 0xF;
		int hp = ((atk&1)<<3) + ((def&1)<<2) + ((spd&1)<<1) + (spc&1);

//		System.out.println("DVs: atk "+atk+", def "+def+", spd "+spd+", spc "+spc);

		if(atk < minAtkDV) return 0;
		if(def < minDefDV) return 0;
		if(spd < minSpdDV) return 0;
		if(spc < minSpcDV) return 0;
		if(hp > maxHPDV) return 0;

		if(whitelist.length > 0 && !Arrays.asList(whitelist).contains(ab)) return 0;

		System.out.println("DVs: " + Util.toHex(ab, 4));

		return 1;
	}
}