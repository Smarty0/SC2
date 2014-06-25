package vswe.stevesvehicles.old.Arcade;

import java.util.EnumSet;

import vswe.stevesvehicles.client.interfaces.GuiVehicle;


public class Community extends CardPlace {

	public Community(ArcadeMonopoly game) {
		super(game);
	}

	@Override
	protected int getTextureId() {
		return 5;
	}
	
	@Override
	public void drawText(GuiVehicle gui, EnumSet<PLACE_STATE> states) {
		game.getModule().drawSplitString(gui, "Dungeon Chest", 3 + gui.getGuiLeft(), 10 + gui.getGuiTop(), ArcadeMonopoly.PLACE_WIDTH - 6, true, 0x404040);
	}

	@Override
	public Card getCard() {
		return CardCommunity.cards.get(game.getModule().getCart().rand.nextInt(CardCommunity.cards.size()));
	}
	
}