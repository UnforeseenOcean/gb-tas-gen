package mrwint.gbtasgen.segment.pokemon;

import java.util.ArrayList;
import java.util.List;

import mrwint.gbtasgen.move.Move;
import mrwint.gbtasgen.move.pokemon.SoftResetMove;
import mrwint.gbtasgen.segment.Segment;
import mrwint.gbtasgen.segment.util.MoveSegment;
import mrwint.gbtasgen.segment.util.SequenceSegment;
import mrwint.gbtasgen.state.StateBuffer;

public class ResetAndContinueSegment implements Segment {

	SequenceSegment sequence;

	public ResetAndContinueSegment() {
		List<Segment> segments = new ArrayList<Segment>();
		segments.add(new MoveSegment(new SoftResetMove())); // reset GB
		segments.add(Segment.press(Move.A)); // vid 1
		segments.add(Segment.press(Move.START)); // vid 2
		segments.add(Segment.press(Move.A)); // title screen
		segments.add(Segment.press(Move.START)); // continue
		segments.add(Segment.press(Move.A)); // title screen

		sequence = new SequenceSegment(segments.toArray(new Segment[0]));
	}

	@Override
	public StateBuffer execute(StateBuffer in) {
		return sequence.execute(in);
	}
}
