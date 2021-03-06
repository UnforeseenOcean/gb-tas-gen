package mrwint.gbtasgen.segment.pokemon.gen1.catchemall;

import mrwint.gbtasgen.metric.pokemon.CheckEncounterMetric;
import mrwint.gbtasgen.move.Move;
import mrwint.gbtasgen.move.PressButton;
import mrwint.gbtasgen.move.pokemon.gen1.OverworldInteract;
import mrwint.gbtasgen.move.pokemon.gen1.PrepWalkStep;
import mrwint.gbtasgen.move.pokemon.gen1.WalkStep;
import mrwint.gbtasgen.segment.Segment;
import mrwint.gbtasgen.segment.pokemon.CatchMonSegment;
import mrwint.gbtasgen.segment.pokemon.CatchSafariMonSegment;
import mrwint.gbtasgen.segment.pokemon.TextSegment;
import mrwint.gbtasgen.segment.pokemon.WalkToSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.CancelMoveLearnSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.DepositMonSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EncounterAndCatchSafariSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EncounterAndCatchSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.ReleaseMonSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.SwapWithSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.TossItemSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.UseBikeSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.UseEvoStoneSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.UseRareCandySegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.WithdrawMonSegment;
import mrwint.gbtasgen.segment.util.SeqSegment;
import mrwint.gbtasgen.segment.util.SkipTextsSegment;

public class SafariZone extends SeqSegment {

	@Override
	public void execute() {
//		seq(new UseBikeSegment(0, -8));
//		seq(new WalkToSegment(35, 27));
//		seq(Segment.repress(Move.START));
//		seq(Segment.repress(Move.A)); // items
//		seq(Segment.scrollFast(31-1)); // palette
//		seq(new SwapWithSegment(4)); // saved map
//		seq(new TossItemSegment(256-0xc1)); // warp c1x0b
//		seq(Segment.repress(Move.B));
//		seq(Move.START);
//		seq(new WalkToSegment(2, 8, false));
//		seq(Segment.repress(Move.START));
//		seq(Segment.repress(Move.A)); // items
//		seq(Segment.scrollFast(4)); // text pointer
//		seq(new SwapWithSegment(-3)); // swap with tileset
//		seq(new TossItemSegment(-3)); // dig everywhere
//		seq(Segment.repress(Move.B));
//		seq(Move.START);
//
//		//DDLDDLLDDDRDRDRRRRRU
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.LEFT, true));
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.LEFT, true));
//		seq(new WalkStep(Move.LEFT, true));
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.RIGHT, true));
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.RIGHT, true));
//		seq(new WalkStep(Move.DOWN, true));
//		seq(new WalkStep(Move.RIGHT, true));
//		seq(new WalkStep(Move.RIGHT, true));
//		seq(new WalkStep(Move.RIGHT, true));
//		seq(new WalkStep(Move.RIGHT, true));
//		seq(new WalkStep(Move.RIGHT, true));
//		seq(new WalkStep(Move.UP, true));
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(-1)); // mons
//		seq(Segment.scrollA(1)); // mew
//		seq(Segment.repress(Move.A)); // dig
//		seq(Segment.skip(1));
//		seq(new WalkToSegment(50, 10));
////		save("sz1");
////		load("sz1");
//		seq(new WalkToSegment(7, 2, false)); // ledge
//		seq(new EncounterAndCatchSegment(new CheckEncounterMetric(0, 21, 22)/*.withMinDSum(0xb8)*/, Move.RIGHT, 188).withExtraSkips(0)); // Bellsprout
////		save("sz2");
////		load("sz2");
//		seq(new WalkToSegment(11, 2, false)); //
//		seq(new EncounterAndCatchSegment(new CheckEncounterMetric(185, 22)/*.withMinDSum(0xc0)*/, Move.DOWN).withExtraSkips(/*24*/0)); // Oddish
////		save("sz3");
////		load("sz3");
//		seq(new WalkToSegment(10, 4, false)); //
//		seq(new EncounterAndCatchSegment(new CheckEncounterMetric(57, 20), Move.DOWN)); // Mankey
//		seq(new WalkToSegment(12, 10, false)); // gate
//		
////		save("sz4");
////		load("sz4b");
//
//		seq(new WalkToSegment(1, 4));
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(2)); // items
//		seq(Segment.scrollFast(33)); // Y abs
//		seq(new SwapWithSegment(1)); // swap with X abs
//		seq(new SwapWithSegment(1)); // swap with saved map
//		seq(Segment.scrollFast(-2)); // Y abs
//		seq(new SwapWithSegment(2)); // swap with saved map
//		seq(Segment.repress(Move.B)); // cancel
//		seq(Move.START); // cancel
//		seq(new WalkToSegment(-1, 4, false)); // wrong warp 0:3
//		seq(new WalkStep(Move.DOWN, true));
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(-1)); // mons
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(1)); // mew
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(1)); // fly
//		seq(Segment.skip(1));
//		seq(Segment.scrollA(4)); // vermilion
//		seq(Segment.skip(1));
//		seq(new WalkToSegment(40, 14)); // leave vermilion
//		seq(new WalkToSegment(4, 5)); // enter diglett's cave
//		seq(new WalkToSegment(4, 4)); // enter diglett's cave
//		seq(new WalkToSegment(36, 31));
//		seq(new EncounterAndCatchSegment(102, Move.LEFT, true, 4, 2)); // Eevee
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(1)); // mons
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(1)); // mew
//		seq(Segment.repress(Move.A)); // dig
//		seq(Segment.skip(1));
//		
////		save("sz2");
////		load("sz2");
//
//		seq(new UseBikeSegment(1, 1));
//		seq(new WalkToSegment(25, 4, false)); // eevee house
//		seq(new WalkToSegment(2, 1));
//		seq(new WalkToSegment(4, 1));
//		seq(new WalkToSegment(2, 1));
//		seq(new WalkToSegment(2, 7));
//		seq(new WalkToSegment(4, 3, false));
//		seq(new OverworldInteract(2));
//		seq(new TextSegment()); // got Eevee
//		seq(new SkipTextsSegment(6)); // no nick, no room
//		seq(new WalkToSegment(3, 8, false));
//		seq(new WalkToSegment(2, 1));
//		seq(new WalkToSegment(4, 1));
//		seq(new WalkToSegment(2, 1));
//		seq(new WalkToSegment(4, 0));
//		{
//			seq(Segment.repress(Move.START));
//			seq(Segment.repress(Move.A)); // items
//			seq(Segment.scrollFastA(4)); // JACK
//			seq(Segment.repress(Move.A)); // use
//			seq(Move.B); // cancel
//			seq(Segment.scrollFastA(-4)); // Bike
//			seq(new SkipTextsSegment(1));
////			seq(Segment.repress(Move.B)); // cancel
////			seq(Move.START); // cancel
//		}
//		seq(new WalkStep(Move.LEFT, true));
//		seq(new WalkStep(Move.LEFT, true));
//		seq(new WalkStep(Move.LEFT, true));
//		seq(new WalkStep(Move.LEFT, true));
//		seq(new WalkStep(Move.DOWN, true));
//		{
//			seq(Segment.repress(Move.START));
//			seq(Segment.scrollA(-1)); // mons
//			seq(Move.B); // cancel
//			seq(Move.START); // cancel
//		}
//		seq(new WalkToSegment(-1, 18));
//		seq(new WalkToSegment(27, 10));
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(1)); // items
//		seq(Segment.scrollA(19)); // Poke flute
//		seq(Segment.repress(Move.A)); // use
//		seq(new SkipTextsSegment(3)); // snorlax
//		seq(new CatchMonSegment(0)); // Snorlax
//		seq(new WalkToSegment(23, 10, false));
//		
////		save("sz3");
////		load("sz3");
//
//		seq(new WalkToSegment(1, 8));
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(2)); // items
//		seq(Segment.scrollFast(2)); // Rare Candy
//		seq(new UseRareCandySegment(1, -2)); // Mankey L21
//		seq(new SkipTextsSegment(1)); // Fury Swipes
//		seq(new UseRareCandySegment(6, 0)); // Mankey L27
//		seq(new CancelMoveLearnSegment()); // Focus Energy
//		seq(new UseRareCandySegment(1, 0)); // Mankey L28
//		seq(new TextSegment());
//		seq(new TextSegment()); // evolution
//		seq(new UseRareCandySegment(1, -1)); // Oddish L23
//		seq(new TextSegment());
//		seq(new TextSegment()); // evolution
//		seq(new UseRareCandySegment(1, -1)); // Bellsprout L23
//		seq(new TextSegment());
//		seq(new TextSegment()); // evolution
//		seq(Segment.scrollFast(5)); // leaf stone
//		seq(new UseEvoStoneSegment(0)); // Victreebel
//		seq(new UseEvoStoneSegment(1)); // Vileplume
//		seq(Segment.scrollFast(1)); // thunderstone
//		seq(new UseEvoStoneSegment(2)); // jolteon
//
//		seq(Segment.scrollFast(25)); // Y abs
//		seq(new SwapWithSegment(1)); // swap with X abs
//		seq(new SwapWithSegment(1)); // swap with saved map
//		seq(Segment.scrollFast(-2)); // Y abs
//		seq(new SwapWithSegment(2)); // swap with saved map
//		seq(new TossItemSegment(256-217));
//		seq(Segment.repress(Move.B)); // cancel
//		seq(Move.START); // cancel
//		seq(new WalkToSegment(-1, 8, false)); // wrong warp 217:0
//
////		save("sz4");
////		load("sz4");
//
//		seq(new WalkToSegment(8, 3));
//		seq(new EncounterAndCatchSafariSegment(26, Move.RIGHT).withExtraSkips(26)); // Scyther
////		save("sz5");
////		load("sz5");
//		seq(new WalkToSegment(11, 3));
//		seq(new EncounterAndCatchSafariSegment(2, Move.RIGHT).withExtraSkips(20)); // Kangaskhan
////		save("sz6");
////		load("sz6");
//		seq(new WalkToSegment(10, 3));
//		seq(new EncounterAndCatchSafariSegment(46, Move.LEFT)); // Parasect
////		save("sz7");
////		load("sz7");
//		seq(new WalkToSegment(11, 3));
//		seq(new EncounterAndCatchSafariSegment(15, Move.RIGHT)); // NidoranF
////		save("sz8");
////		load("sz8");
//		seq(new WalkToSegment(10, 3));
//		seq(new EncounterAndCatchSafariSegment(12, Move.LEFT)); // Exeggcute
////		save("sz9");
////		load("sz9");
//		seq(new UseBikeSegment());
//		seq(new WalkToSegment(11, 3));
//		seq(new EncounterAndCatchSafariSegment(109, Move.RIGHT)); // Paras
////		save("sz10");
////		load("sz10");
//		seq(new WalkToSegment(10, 3));
//		seq(new EncounterAndCatchSafariSegment(70, Move.LEFT)); // Doduo
//		seq(new WalkToSegment(11, 3));
//		seq(new WalkToSegment(-1, 5, false)); // north
//		
////		save("sz4");
////		load("sz4");
//
//		seq(new WalkToSegment(29, 32));
//		seq(new WalkToSegment(28, 32));
//		for(int i=0;i<2;i++) {
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.DOWN));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.RIGHT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.UP));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.LEFT));
//		}
//		seq(new EncounterAndCatchSafariSegment(18, Move.LEFT)); // Rhyhorn
////		save("sz5");
////		load("sz5");
//		for(int i=0;i<1;i++) {
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.DOWN));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.RIGHT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.UP));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.LEFT));
//		}
//		seq(new WalkToSegment(27, 33));
//		for(int i=0;i<1;i++) {
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.LEFT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.UP));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.RIGHT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.DOWN));
//		}
//		seq(new WalkToSegment(26, 33));
//		for(int i=0;i<2;i++) {
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.DOWN));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.RIGHT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.UP));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.LEFT));
//		}
//		seq(new EncounterAndCatchSafariSegment(3, Move.LEFT)); // NidoranM
////		save("sz6");
////		load("sz6");
//		for(int i=0;i<1;i++) {
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.DOWN));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.RIGHT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.UP));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.LEFT));
//		}
//		seq(new WalkToSegment(24, 33));
//		for(int i=0;i<1;i++) {
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.DOWN));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.RIGHT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.UP));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.RIGHT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.DOWN));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.LEFT));
//		}
//		seq(new WalkToSegment(23, 33));
//		seq(new EncounterAndCatchSafariSegment(60, Move.LEFT)); // Tauros
//		seq(new WalkToSegment(21, 36, false)); // center
////		save("sz7");
////		load("sz7");
//		seq(new WalkToSegment(15, 3));
//		seq(new WalkToSegment(14, 3));
//		for(int i=0;i<1;i++) {
//			seq(Segment.skip(1));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.UP));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.RIGHT));
//			seq(Segment.skip(1));
//			seq(new PrepWalkStep(Move.DOWN));
//		}
//		seq(new WalkToSegment(14, 5));
//		seq(new EncounterAndCatchSafariSegment(65, Move.DOWN)); // Venonat
//		
////		save("sz5");
////		load("sz5");
//
//		seq(new WalkToSegment(14, 6));
//		seq(new WalkToSegment(14, 7));
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(1)); // mons
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(1)); // mew
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(2)); // surf
//		seq(new SkipTextsSegment(1)); // got on mew
//		seq(new WalkStep(Move.DOWN, true));
//
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(1)); // items
//		seq(Segment.scrollFast(18)); // mansion text pointer
//		seq(new SwapWithSegment(21)); // swap with text pointer
//		seq(Segment.repress(Move.B));
//		seq(Move.START);
//		seq(new OverworldInteract(1));
//		seq(new SkipTextsSegment(2));
//		seq(new CatchSafariMonSegment());
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(1)); // mons
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(1)); // mew
//		seq(Segment.repress(Move.A)); // dig
//		seq(Segment.skip(1));
//		seq(Move.START);
//		seq(Segment.repress(Move.A)); // mons
//		seq(Segment.repress(Move.A)); // mew
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(1)); // fly
//		seq(Segment.skip(1));
//		seq(Segment.scrollA(-2)); // pewter
//		
////		save("sz6");
////		load("sz6");
//		seq(Segment.skip(1));
//		seq(new UseBikeSegment(1, 1));
//
//		seq(new WalkToSegment(14, 7));
//		seq(new WalkToSegment(9, 5));
//		seq(new WalkToSegment(9, 4));
//		seq(new SkipTextsSegment(1));
//		seq(new SkipTextsSegment(1, true)); // buy ticket
//		seq(new SkipTextsSegment(1));
//		seq(new WalkToSegment(7, 7));
//		seq(new WalkToSegment(13, 1));
//		seq(Segment.repress(Move.START));
//		seq(Move.A); // mons
//		seq(Move.B); // cancel
//		seq(Move.START); // cancel
//		seq(new WalkToSegment(7, 7));
//		seq(new WalkToSegment(10, 8, false));
//		seq(new WalkToSegment(18, 36));
////		save("sz7");
////		load("sz7");
//		seq(new WalkToSegment(8, 6));
////		seq(Segment.wait(500));
//		seq(new EncounterAndCatchSegment(72, Move.LEFT, true)); // Jynx
//		seq(new UseBikeSegment());
//		seq(new WalkToSegment(8, -1));
//
//		seq(new WalkToSegment(31, 2));
//		seq(Segment.repress(Move.START));
//		seq(Segment.repress(Move.A)); // items
//		seq(Move.B); // cancel
//		seq(Move.START); // cancel
//		seq(new WalkToSegment(19, 36));
////		save("sz8");
////		load("sz8");
//		seq(new WalkToSegment(8, 2));
//		seq(new EncounterAndCatchSegment(43, Move.LEFT, true)); // Hitmonlee
//
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(1)); // mons
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(1)); // mew
//		seq(Segment.skip(1));
//		seq(Segment.scrollAF(1)); // fly
//		seq(Segment.skip(1));
//		seq(Segment.scrollA(4)); // vermilion
//		
////		save("sz9");
//		load("sz9");
//		seq(Segment.skip(1));
//
//		seq(new WalkToSegment(11, 3));
//		seq(new WalkToSegment(13,4));
//		seq(new WalkToSegment(13,3, false)); // correct facing direction
//		seq(Segment.press(Move.A)); // use PC
//		seq(new SkipTextsSegment(1)); // booted PC
//		seq(Segment.press(Move.A)); // someones PC
//		seq(new SkipTextsSegment(2)); // someones PC, mon storage system
//		seq(Segment.scroll(2)); // release
		load("tmp");
		seq(new ReleaseMonSegment(0)); // Hitmonlee
		seq(new ReleaseMonSegment(1)); // Jynx
		seq(Segment.menu(Move.UP)); // deposit
		seq(new DepositMonSegment(0)); // Ditto
		seq(new DepositMonSegment(1)); // Victreebel
		seq(new DepositMonSegment(1)); // Primeape
		seq(new DepositMonSegment(1)); // Vileplume
		seq(new DepositMonSegment(1)); // Jolteon
		seq(Segment.menu(Move.UP)); // withdraw
		seq(new WithdrawMonSegment(3)); // NidoM
		seq(new WithdrawMonSegment(6)); // Exeggcute
		seq(new WithdrawMonSegment(6)); // NidoF
		seq(new WithdrawMonSegment(10)); // Eevee
		seq(Segment.menu(Move.B)); // leave
		seq(Segment.menu(Move.B)); // leave
//		seq(Segment.skip(1));
//		seq(Segment.repress(Move.START));
//		seq(Segment.scrollA(1)); // items
//		seq(Segment.scrollFast(2)); // rare candy
//		seq(new UseRareCandySegment(1, 1)); // NidoM Lxx
//		seq(new TextSegment());
//		seq(new TextSegment()); // evolution
//		seq(new UseRareCandySegment(1, 2)); // NidoF Lxx
//		seq(new TextSegment());
//		seq(new TextSegment()); // evolution
//		seq(Segment.scrollFast(1)); // moon stone
//		seq(new UseEvoStoneSegment(0)); // Nidoqueen
//		seq(new UseEvoStoneSegment(-2)); // Nidoking
//		seq(new CancelMoveLearnSegment()); // Thrash
//		seq(Segment.scrollFast(6)); // leaf stone
//		seq(new UseEvoStoneSegment(1)); // Exeggutor
//		seq(Segment.scrollFast(8)); // fire stone
//		seq(new UseEvoStoneSegment(2)); // Flareon
//		seq(Segment.repress(Move.B));
//		seq(Move.START);
//		seq(Segment.press(Move.A)); // use PC
//		seq(new SkipTextsSegment(1)); // booted PC
//		seq(Segment.press(Move.A)); // someones PC
//		seq(new SkipTextsSegment(2)); // someones PC, mon storage system
//		seq(Segment.scroll(1)); // deposit
//		seq(new DepositMonSegment(1)); // Nidoking
//		seq(new DepositMonSegment(1)); // Nidoqueen
//		seq(new DepositMonSegment(1)); // Exeggutor
//		seq(new DepositMonSegment(1)); // Flareon
//		seq(Segment.menu(Move.B)); // leave
//		seq(Segment.menu(Move.B)); // leave
//		seq(new WalkToSegment(4, 7));
////
////		save("sz8");
////		load("sz8");
////
//		seq(Segment.skip(1));
//		seq(Segment.repress(Move.START));
//		seq(Segment.repress(Move.A)); // items
//		seq(Segment.scrollFast(31-14)); // palette
//		seq(new SwapWithSegment(4)); // saved map
//		seq(new TossItemSegment(-0x76)); // warp 76:0
//		seq(Segment.repress(Move.B));
//		seq(Move.START);
//		seq(new WalkToSegment(4, 8, false));
//		seq(new SkipTextsSegment(15)); // Oak HoF speech
//		seq(new TextSegment());
//		seq(new TextSegment());
//		seq(new SkipTextsSegment(1));
	}
}
