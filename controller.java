import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.List;

public class controller{
	private board theBoard;

	ImageIcon empty = new ImageIcon("resources/empty.png");

	ImageIcon bQueen = new ImageIcon("Resources/bQueen.png");
	ImageIcon bBishop = new ImageIcon("Resources/bBishop.png");
	ImageIcon bPawn = new ImageIcon("Resources/bPawn.png");
	ImageIcon bKing = new ImageIcon("Resources/bKing.png");

	ImageIcon wQueen = new ImageIcon("Resources/wQueen.png");
	ImageIcon wBishop = new ImageIcon("Resources/wBishop.png");
	ImageIcon wPawn = new ImageIcon("Resources/wPawn.png");
	ImageIcon wKing = new ImageIcon("Resources/wKing.png");
	
	public controller(board theBoard)
	{
		this.theBoard = theBoard;
		this.theBoard.newGame(empty, bQueen, bBishop, bPawn, bKing, wQueen, wBishop, wPawn, wKing);
		// this.theBoard.initializeGame(empty, bQueen, bBishop, bPawn, bKing, wQueen, wBishop, wPawn, wKing);
		// this.theBoard.addMoveListener(new MoveListener());
	}
	
	// class MoveListener implements ActionListener{
	// 	public void actionPerformed(ActionEvent e)
	// 	{
	// 		JButton temp = (JButton)e.getSource();
	// 		temp.setBackground(Color.black);
	// 		int u=theBoard.getCurSquareU();
	// 		int v=theBoard.getCurSquareV();
	// 		int x=theBoard.getPrevSquareX();
	// 		int y=theBoard.getPrevSquareY();
	// 		Boolean prevSquare = theBoard.getPrevSquare();
	// 		if(prevSquare){
	// 			Thread move = new Thread()
	// 			{
	// 				public void run()
	// 				{
	// 					try{
	// 						ImageIcon icon = theBoard.getIcon(x,y);
	// 						theBoard.setMove(icon, u, v, x, y);
	// 						theBoard.resetColor();
	// 						Thread.sleep(500);
	// 					}
	// 					catch(InterruptedException ex){
	// 						Thread.currentThread().interrupt();
	// 					}
	// 				}
	// 			};
	// 			move.start();
	// 		}
	// 		temp.setBackground(Color.red);
			
	// 	}
	// }
}