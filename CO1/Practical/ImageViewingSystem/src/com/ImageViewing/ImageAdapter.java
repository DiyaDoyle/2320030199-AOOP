package com.ImageViewing;

public class ImageAdapter implements ImageViewer{
	AdvancedImageViewer advancedImageViewer;
	public ImageAdapter(String imageType) {
		if(imageType.equalsIgnoreCase("png")) {
			advancedImageViewer= new PngShower();
		}
		else if(imageType.equalsIgnoreCase("jpg")) {
			advancedImageViewer= new JpgShower();
		}
	}

	@Override
	public void Show(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("png")) {
			advancedImageViewer.showPng();
		}
		else if(type.equalsIgnoreCase("jpg")) {
			advancedImageViewer.showJpg();
		}
	}

}
