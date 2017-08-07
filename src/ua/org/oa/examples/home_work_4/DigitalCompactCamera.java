package ua.org.oa.examples.home_work_4;

/** класс компактных камер без сменной оптики */
public class DigitalCompactCamera extends Foto {
	/** кратность зума камеры, специфическая переменная для данного типа камер */
	private int zoomCount;

	// конструкторы
	public DigitalCompactCamera() {
	}

	public DigitalCompactCamera(String brandName, float price,
								String imageSize, boolean allWeather, int maxIso, int countMpx,
								int zoomCount) {
		super(brandName, price, imageSize, allWeather, maxIso, countMpx);
		this.zoomCount = zoomCount;
	}

	// геттеры и сеттеры
	public int getZoomCount() {
		return zoomCount;
	}

	public void setZoomCount(int zoomCount) {
		this.zoomCount = zoomCount;
	}

	// переопределенный метод вывода инфы о камере
	@Override
	public void showCamera() {
		super.showBasicInfo();
		System.out.println(getZoomCount());
	}

}

