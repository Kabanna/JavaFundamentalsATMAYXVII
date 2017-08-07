package ua.org.oa.examples.home_work_4;

public class DigitalWithLensesDslr extends DigitalWithLenses {
	/** тип зеркалки (профессиональная, любительская и т.п */
	private String dslrType;

	// конструкторы
	public DigitalWithLensesDslr() {
	}

	public DigitalWithLensesDslr(String brandName, float price,
								 String imageSize, boolean allWeather, int maxIso, int countMpx,
								 String lensMountType, String dslrType) {
		super(brandName, price, imageSize, allWeather, maxIso, countMpx,
				lensMountType);
		this.dslrType = dslrType;

	}

	// геттеры и сеттеры
	public String getDslrType() {
		return dslrType;
	}

	public void setDslrType(String dslrType) {
		this.dslrType = dslrType;
	}

	// переопределенный метод вывода инфы о камере
	@Override
	public void showCamera() {
		super.showCamera();
		System.out.println(getDslrType());
	}
}
