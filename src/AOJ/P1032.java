package AOJ;

public class P1032 {

	public static void main(String[] args) {
		for (int cock = 0; cock <= 19; cock++) {
			for (int hen = 0; hen <= 33; hen++) {
				int chicks = 100 - cock - hen;
				if ((cock * 5 + hen * 3 + chicks / 3 == 100) && chicks % 3 == 0) {
					System.out.println("cock=" + cock + ",hen=" + hen + ",chicken=" + chicks);
				}
			}
		}
	}
}
