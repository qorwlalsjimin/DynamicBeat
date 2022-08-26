package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null); //게임창이 모니터 정중앙에 뜨게 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //게임을 종료했을때 완벽히 종료
		setVisible(true); //게임창을 화면에 보이게 함
	}
}
