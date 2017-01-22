import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class board extends JFrame
{
	int verSquare = 8;
	int horSquare = 5;
	JButton newBtn = new JButton();
	JButton saveBtn = new JButton();
	JButton undoBtn = new JButton();
	JButton squares[][] = new JButton[8][5];
	JLabel alpCoord = new JLabel("a              b                c                d              e      ");
	JLabel[] numCoord = new JLabel[8];
	JLabel[] gameDimension = new JLabel[verSquare * horSquare];
	public board()
	{
		super("Barsoomian Chess");
		// Main Panel
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints mainConstraints = new GridBagConstraints();

		// // Top Panel
		// JPanel topPanel = new JPanel(new FlowLayout());
		// JLabel Desc = new JLabel("Multiplayer chess ( 1P vs 2P)");
		// topPanel.add(Desc);
		// mainConstraints.gridx = 0;
		// mainConstraints.gridy = 0;
		// mainPanel.add(topPanel, mainConstraints);
		// // End code for creating the description

		JPanel topCoord = new JPanel(new FlowLayout());
		GridBagConstraints topCoordConstraints = new GridBagConstraints(); // Constraint for previous and current list	
		topCoordConstraints.gridx = 0;
		topCoordConstraints.gridy = 0;
		topCoord.add(alpCoord, topCoordConstraints);
		mainPanel.add(topCoord);

		JPanel LeftCoord = new JPanel(new FlowLayout());
		GridBagConstraints LeftCoordConstraints = new GridBagConstraints(); // Constraint for previous and current list	
		for(int i=0; i<8; i++) // create 18 label for the list
		{
			numCoord[i] = new JLabel();
			numCoord[i].setText((i+1)+"  ");
			LeftCoordConstraints.gridx = 0;
			LeftCoordConstraints.gridy = 1;
			LeftCoord.add(numCoord[i],LeftCoordConstraints);
		}
		mainPanel.add(LeftCoord, LeftCoordConstraints);
		// Save Button Panel
		// JPanel saveBox = new JPanel(new FlowLayout());
		// undoBtn = new JButton("Undo");
		// saveBox.add(undoBtn);
		// saveBtn = new JButton("Save Game");
		// saveBox.add(saveBtn);
		// mainConstraints.gridx = 1;
		// mainConstraints.gridy = 0; // Main menu panel top right
		// mainPanel.add(saveBox,mainConstraints);
		// End Code for Creating Save Button Panel

		JPanel gameBoard = new JPanel(new GridBagLayout());
		GridBagConstraints boardConstraints = new GridBagConstraints();
		int j = 0;
		int size = verSquare * horSquare;
		
		for (int i=0; i < size; i++)
		{
			if(i > 1 && i%8 == 0)
				j++;
			boardConstraints.gridx = j;
			boardConstraints.gridy = i%8;
			boardConstraints.ipadx = 3;
			boardConstraints.ipady = 3;
			gameDimension[i] = new JLabel();
			gameBoard.add(gameDimension[i], boardConstraints);
			gameDimension[i].setFocusable(false);
		}
		gameBoard.setBackground(new Color(51,232,255));
		boardConstraints.gridx = 0;
		boardConstraints.gridy = 2;
		boardConstraints.ipadx = 10;
		boardConstraints.ipady = 10;
		mainPanel.add(gameBoard, boardConstraints);



		add(mainPanel); // Add main panel to the constructor
		setSize(900,650); // Set size for window panel
		setMinimumSize(new Dimension(900,650)); // Set minimum size for window panel
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Set close program when exit is trigger
		setFocusable(true); // Set window focusable
		requestFocusInWindow(); // Focus on this window
		setVisible(true); // Set this window visible

	}

	// Set Icon for the label (Andy Yong)
	public void setPic(ImageIcon icon, int position)
	{
		gameDimension[position].setIcon(icon);
	}

	//To initiate the squares become button
	public void addMoveListener(ActionListener moveListener)
	{
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 5; j++) 
				squares[i][j].addActionListener(moveListener);
	}

	// Initialize GUI Board for multiple tries (Andy Yong)
	public void newGame(ImageIcon empty, ImageIcon bQueen, ImageIcon bBishop, ImageIcon bPawn, ImageIcon bKing, ImageIcon wQueen, ImageIcon wBishop, ImageIcon wPawn, ImageIcon wKing)
	{
		for(int i=0; i< horSquare * verSquare; i++)
			setPic(empty, i);

	}


}