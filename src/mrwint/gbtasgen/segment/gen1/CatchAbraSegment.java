package mrwint.gbtasgen.segment.gen1;

import java.util.ArrayList;
import java.util.List;

import mrwint.gbtasgen.metric.CheckEncounterMetric;
import mrwint.gbtasgen.move.Move;
import mrwint.gbtasgen.segment.CatchMonSegment;
import mrwint.gbtasgen.segment.Segment;
import mrwint.gbtasgen.segment.WalkToSegment;
import mrwint.gbtasgen.segment.util.CheckMetricSegment;
import mrwint.gbtasgen.segment.util.DelayMoveSegment;
import mrwint.gbtasgen.segment.util.DelayMoveSegment.PressButtonFactory;
import mrwint.gbtasgen.segment.util.SequenceSegment;
import mrwint.gbtasgen.segment.util.SkipTextsSegment;
import mrwint.gbtasgen.state.StateBuffer;

public class CatchAbraSegment extends Segment {

	SequenceSegment sequence;
	
	public CatchAbraSegment() {
		List<Segment> segments = new ArrayList<Segment>();

		segments.add(new WalkToSegment(4,17));

		segments.add(new DelayMoveSegment(new PressButtonFactory(Move.DOWN), new CheckMetricSegment(new CheckEncounterMetric(148, 0, null,0))));

		segments.add(new SkipTextsSegment(2)); // wild abra, go mon
		segments.add(Segment.press(Move.DOWN)); // items
		segments.add(Segment.press(Move.A)); // select items
		segments.add(new CatchMonSegment());

		segments.add(new SkipTextsSegment(4)); // cought, new dex data
		segments.add(Segment.press(Move.A)); // skip dex
		segments.add(Segment.press(Move.B)); // skip dex
		segments.add(new SkipTextsSegment(2)); // no nickname
		
		sequence = new SequenceSegment(segments.toArray(new Segment[0]));
	}
	
	@Override
	public StateBuffer execute(StateBuffer in) throws Throwable {
		return sequence.execute(in);
	}
}
