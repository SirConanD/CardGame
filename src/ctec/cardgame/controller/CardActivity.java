package ctec.cardgame.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class CardActivity extends Activity
{
	public String cardContents;
	public String getCardContents()
	{
		return cardContents;
	}

	public ImageView getCardFront()
	{
		return cardFront;
	}

	public ImageView getCardBack()
	{
		return cardBack;
	}

	public void setCardContents(String cardContents)
	{
		this.cardContents = cardContents;
	}

	public void setCardFront(ImageView cardFront)
	{
		this.cardFront = cardFront;
	}

	public void setCardBack(ImageView cardBack)
	{
		this.cardBack = cardBack;
	}

	public ImageView cardFront;
	public ImageView cardBack;
	
	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
	}
}
