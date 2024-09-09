package com.ImageViewing;

public class GalleryApp implements ImageViewer{
	ImageAdapter imageAdapter;

	@Override
	public void Show(String type) {
		// TODO Auto-generated method stub
		imageAdapter= new ImageAdapter(type);
		imageAdapter.Show(type);
	}

}
