package ch.fdehedin.patterns.observer.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	private static final Logger LOGGER = Logger.getLogger(SwingObserverExample.class.getSimpleName());

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		frame = new JFrame();
		JButton button = new JButton("should i do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		button.addActionListener(new ExitListener());
		frame.add(button);
		frame.setVisible(true);
	}

	class AngelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			LOGGER.info("don't do it!");
		}
	}

	class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			LOGGER.info("Do it do it do it!!!!");
		}
	}

	class ExitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			LOGGER.info("I've seen enough, i leave nnow..!!");
			// frame.dispose();
			// System.exit(0);
		}
	}

}
