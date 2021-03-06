package mrwint.gbtasgen.segment.pokemon.gen1.coop;

import static mrwint.gbtasgen.move.Move.A;
import static mrwint.gbtasgen.move.Move.B;
import static mrwint.gbtasgen.move.Move.DOWN;
import static mrwint.gbtasgen.move.Move.LEFT;
import static mrwint.gbtasgen.util.EflUtil.PressMetric.PRESSED;
import mrwint.gbtasgen.metric.pokemon.gen1.Gen1CheckDVMetric;
import mrwint.gbtasgen.move.Move;
import mrwint.gbtasgen.move.pokemon.gen1.EflOverworldInteract;
import mrwint.gbtasgen.segment.pokemon.EflTextSegment;
import mrwint.gbtasgen.segment.pokemon.EflWalkToSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.Constants;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflChangeOptionsSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.NamingSegment;
import mrwint.gbtasgen.segment.util.CheckMetricSegment;
import mrwint.gbtasgen.segment.util.EflSkipTextsSegment;
import mrwint.gbtasgen.segment.util.SeqSegment;

public class ChooseSecondStarterRed extends SeqSegment {

	@Override
	public void execute() {
    seq(EflChangeOptionsSegment.fromOverworld()); // set options
    seq(new EflWalkToSegment(7, 1)); // go downstairs
		seq(new EflWalkToSegment(3, 6)); // leave house
		seq(new EflWalkToSegment(3, 8, false)); // leave house
		seq(new EflWalkToSegment(10, 1)); // walk into grass
		seq(new EflTextSegment()); // OAK: don't go out
		seqEflButton(0); // skip holding key
    seq(new EflSkipTextsSegment(6));
    seq(new EflSkipTextsSegment(18));

    seq(new EflWalkToSegment(8, 3, false)); // walk to ball
		seqMove(new EflOverworldInteract(4)); // Bulbasaur ball

		seqEflButton(B); // cancel dex
		seqEflButton(A); // cancel dex

		// chose mon text
		seq(new EflSkipTextsSegment(1)); // do you want?
		seq(new EflSkipTextsSegment(1, true)); // want!
		seq(new EflSkipTextsSegment(1)); // energetic

		seqUnbounded(new EflSkipTextsSegment(2)); // received! ; want to give a nick
		seqUnbounded(new EflTextSegment(B)); // to Bulbasaur?
    seqEflButtonUnbounded(A); // (yes)
    
    {
      char from = 'A';
      for (int i = 0; i < 70; i++) {
        char randomLetter = (char) (Math.random() < 0.5 ? 'A' + Math.random()*26 : 'a' + Math.random()*26);
        seqUnbounded(new NamingSegment("" + randomLetter, from));
        seqEflButtonUnboundedNoDelay(B);
        from = randomLetter;
      }
      seqUnbounded(new NamingSegment("E", from));
    }
//    seqEflButtonUnbounded(DOWN); // J
//    seqEflButtonUnbounded(A, PRESSED); // "J"
    delayEfl(new SeqSegment() {
      @Override
      protected void execute() {
        seqEflButtonUnbounded(Move.START);
        seq(new CheckMetricSegment(new Gen1CheckDVMetric(0, 0, 15, 15, 3)));
//        seq(new CheckMetricSegment(new Gen1CheckDVMetric(15, 0, 15, 15, 15)));
      }
    });

		seq(new EflSkipTextsSegment(2)); // rival choose mon
		seq(new EflWalkToSegment(5, 6)); // try leaving
		seq(new EflSkipTextsSegment(4)); // rival challenges you
	}
}
