package ua.org.oa.examples.home_work_4;

public class DigitalWithLensesCompact extends DigitalWithLenses {

	public DigitalWithLensesCompact() {

	}

	public DigitalWithLensesCompact(String brandName, float price,
									String imageSize, boolean allWeather, int maxIso, int countMpx,
									String lensMountType) {
		super(brandName, price, imageSize, allWeather, maxIso, countMpx,
				lensMountType);
	}

	// переопределенный метод вывода инфы о камере
	@Override
	public void showCamera() {
		super.showCamera();
	}
}
