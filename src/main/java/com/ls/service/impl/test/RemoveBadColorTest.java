package com.ls.service.impl.test;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.imageio.ImageIO;

public class RemoveBadColorTest {

	public static void main(String[] args) {

		File imageFile = new File("D:/applications/Tesseract-OCR/1434631972836.jpg");
		try {
			BufferedImage bufferedImage = ImageIO.read(imageFile);

			int width = bufferedImage.getWidth();
			int height = bufferedImage.getHeight();
			
			int[][] rgbs = getImageGRB("D:/applications/Tesseract-OCR/1434631972836.jpg");

//			Map<Integer, Integer> mapColor = new HashMap<Integer, Integer>();
//			for (int i = 0; i < width; i++)
//				for (int j = 0; j < height; j++) {
//					int color = bufferedImage.getRGB(i, j);
//					Integer count = mapColor.get(color);
//					if (count == null)
//						count = 0;
//					count++;
//					mapColor.put(color, count);
//				}
//			System.out.println(mapColor);
//
//			List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(mapColor.entrySet());
//			Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
//
//				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
//
//					return o2.getValue() - o1.getValue();
//				}
//			});
//			list = list.subList(0, 5);
//
//			System.out.println(list);
//
//			int intBack = list.get(0).getKey();
//			Set<Integer> setColor = new HashSet<Integer>();
//			for (Map.Entry<Integer, Integer> entry : list) {
//				setColor.add(entry.getKey());
//			}
//			System.out.println(setColor);
//			for (int i = 0; i < width; i++)
//				for (int j = 0; j < height; j++) {
//					int color = bufferedImage.getRGB(i, j);
//					System.out.println(color);
//					if (setColor.contains(color)) {
//						System.out.println("Wanted");
//						bufferedImage.setRGB(i, j, color);
//						continue;
//					} else {
//						System.out.println("Not-Wanted");
//						bufferedImage.setRGB(i, j, intBack);
//					}
//				}
//
//			ImageIO.write(bufferedImage, "png", new File("D:/applications/Tesseract-OCR/a.jpg"));
//
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int[][] getImageGRB(String filePath) {
		File file = new File(filePath);
		int[][] result = null;
		if (!file.exists()) {
			return result;
		}
		try {
			BufferedImage bufImg = ImageIO.read(file);
			int height = bufImg.getHeight();
			int width = bufImg.getWidth();
			result = new int[width][height];
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					
					int rgb = bufImg.getRGB(i, j) & 0xFFFFFF;
					Color color = new Color(rgb);
					int red = color.getRed(), green = color.getGreen(), black = color.getBlue();
					
					if (red > 90 && green > 90 && black > 90) {
						bufImg.setRGB(i, j, Color.WHITE.getRGB());
					} else {
						bufImg.setRGB(i, j, Color.BLACK.getRGB());
					}
				}
			}
			
			ImageIO.write(bufImg, "png", file);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}
}
