package sorting;

import java.util.ArrayList;

import graphics.ArrayCanvas;
import utils.CanvasUtils;
import utils.Constants;

public class InsertionSort
	{
		public static void sort(ArrayCanvas ac)
			{
				ArrayList<Integer> list = ac.getArray().list;
				int temp = 0;

				for (int i = 1; i < list.size(); i++) {
					temp = list.get(i);
					int j = i;

					while ((j > 0) && (list.get(j - 1) > temp)) {
						ac.compare();
						ac.getArray().addHighlight(i, Constants.COLOR_POINTER2);
						list.set(j, list.get(j - 1));
						ac.swap();
						ac.getArray().addHighlight(j, Constants.COLOR_SWAP);
						CanvasUtils.sleep(10);
						ac.getArray().removeHighlight(j);
						j--;
					}
					list.set(j, temp);
					ac.swap();
					CanvasUtils.sleep(10);
					ac.getArray().removeHighlight(i);
				}
			}
	}