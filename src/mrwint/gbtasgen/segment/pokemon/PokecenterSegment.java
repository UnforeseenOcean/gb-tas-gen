package mrwint.gbtasgen.segment.pokemon;

import mrwint.gbtasgen.move.Move;
import mrwint.gbtasgen.move.pokemon.gen1.OverworldInteract;
import mrwint.gbtasgen.segment.Segment;
import mrwint.gbtasgen.segment.util.MoveSegment;
import mrwint.gbtasgen.segment.util.SeqSegment;
import mrwint.gbtasgen.segment.util.SkipTextsSegment;
import mrwint.gbtasgen.util.EflUtil;

public class PokecenterSegment extends SeqSegment {

	boolean firstVisit;

	public PokecenterSegment(boolean firstVisit) {
	  EflUtil.assertNoEfl();

	  this.firstVisit = firstVisit;
	}

	@Override
	public void execute() {
		seq(new WalkToSegment(3, 3)); // walk to counter
		seq(new MoveSegment(new OverworldInteract(1))); // talk to nurse
		seq(new SkipTextsSegment(3));
		if(firstVisit)
			seq(new TextSegment(Move.B)); // extra line on first visit
		seq(Segment.press(Move.A)); // confirm healing mons
		seq(new TextSegment()); // need your mons
		seq(new SkipTextsSegment(3));
		seq(new WalkToSegment(3, 8, false)); // leave center
	}
}
