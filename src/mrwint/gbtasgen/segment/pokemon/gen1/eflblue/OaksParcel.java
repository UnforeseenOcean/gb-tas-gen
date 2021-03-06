package mrwint.gbtasgen.segment.pokemon.gen1.eflblue;

import static mrwint.gbtasgen.state.Gameboy.curGb;
import mrwint.gbtasgen.move.Move;
import mrwint.gbtasgen.move.pokemon.gen1.EflOverworldInteract;
import mrwint.gbtasgen.move.pokemon.gen1.EflWalkStep;
import mrwint.gbtasgen.segment.pokemon.EflTextSegment;
import mrwint.gbtasgen.segment.pokemon.EflWalkToSegment;
import mrwint.gbtasgen.segment.util.EflSkipTextsSegment;
import mrwint.gbtasgen.segment.util.MoveSegment;
import mrwint.gbtasgen.segment.util.SeqSegment;
import mrwint.gbtasgen.state.StateBuffer;
import mrwint.gbtasgen.util.EflUtil;

public class OaksParcel extends SeqSegment {

	@Override
	public void execute() {
//		seq(new EflWalkToSegment(5, 12, false)); // leave oaks lab
//		seq(new EflWalkToSegment(10, -1)); // walk out of town
//    StateBuffer.increaseBufferSizeTo(15);
//		seq(new EflWalkToSegment(10, -1)); // walk out to viridian
//    StateBuffer.resetBufferSize();
//		seq(new EflWalkToSegment(29, 19)); // walk into mart
//		seq(new EflSkipTextsSegment(5)); // take parcel
//		seq(new EflWalkToSegment(3, 8, false)); // walk outside
//    save("tmp2");
//    load("tmp2");
//		seq(new EflWalkToSegment(26, 27, false)); // viridian ledge
//    save("tmp");
    load("tmp");
		seq(new EflWalkToSegment(21, 36)); // leave viridian
		seq(new EflWalkToSegment(14, 19, false)); // ledge jump 1
		seq(new EflWalkToSegment(11, 27, false)); // ledge jump 2
		seq(new EflWalkToSegment(11, 36)); // enter pallet town
		seq(new EflWalkToSegment(12, 11)); // enter oaks lab
		seq(new EflWalkToSegment(4, 2)); // stand left of oak
//		seq(new WalkToSegment(5, 1)); // stand behind oak
		seq(new EflWalkToSegment(5, 2, false)); // face towards oak
		//seq(new WalkToSegment(5, 3)); // stand in front of oak
		seq(new MoveSegment(new EflOverworldInteract(5))); // talk to oak
		seq(new EflSkipTextsSegment(41)); // oak parcel speech
		seq(new EflWalkToSegment(4, 12, false)); // leave oaks lab
		//seq(new WalkToSegment(5, 12, false)); // leave oaks lab
		seq(new EflWalkToSegment(10, -1)); // leave pallet town
    StateBuffer.pushBufferSize(15);
		seq(new EflWalkToSegment(10, -1)); // enter viridian
    StateBuffer.popBufferSize();
	}
}
